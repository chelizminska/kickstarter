package com.kickstarter.controllers.tools;

import com.kickstarter.extentions.Action;
import com.kickstarter.extentions.Function;

public class CustomJsonResult<TEntity> {

    private JsonResultModel<TEntity> data;

    public static <TEntity> CustomJsonResult TryGetJsonResult(Function<TEntity> function)
    {
        CustomJsonResult result = new CustomJsonResult();
        try
        {
            result.SetData(function.getResult());
        }
        catch (Exception e)
        {
            result.SetError(e.getMessage());
        }
        return result;
    }

    public static CustomJsonResult TryExecute(Action function)
    {
        CustomJsonResult result = new CustomJsonResult();
        try
        {
            function.run();
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
