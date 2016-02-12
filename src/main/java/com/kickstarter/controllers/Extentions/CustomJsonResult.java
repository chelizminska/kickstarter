package com.kickstarter.controllers.Extentions;


public class CustomJsonResult<TEntity> {

    private JsonResultModel<TEntity> data;

    public static CustomJsonResult TryGetJsonResult(Object object, String methodName, Object... params)
    {
        CustomJsonResult result = new CustomJsonResult();
        try
        {
            result.SetData(object.getClass().getMethod(methodName).invoke(object, params));
        }
        catch (Exception e)
        {
            result.SetError(e.getMessage());
        }
        return result;
    }

    public static CustomJsonResult TryExecute(Object object, String methodName)
    {
        CustomJsonResult result = new CustomJsonResult();
        try
        {
            object.getClass().getMethod(methodName).invoke(object);
            result.SetData(true);
        }
        catch (Exception e)
        {
            result.SetError(e.getMessage());
        }
        return result;
    }

    public CustomJsonResult SetData(TEntity data)
    {
        JsonResultModel<TEntity> result = new JsonResultModel<TEntity>();
        result.setData(data);

        this.setData(result);
        return this;
    }

    public CustomJsonResult SetError(String error)
    {
        JsonResultModel<TEntity> result = new JsonResultModel<TEntity>();
        result.setErrorMessage(error);

        this.setData(result);
        return this;
    }

    public JsonResultModel<TEntity> getData() {
        return data;
    }

    public void setData(JsonResultModel<TEntity> data) {
        this.data = data;
    }
}
