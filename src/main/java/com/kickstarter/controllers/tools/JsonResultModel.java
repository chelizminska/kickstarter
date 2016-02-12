package com.kickstarter.controllers.tools;

public class JsonResultModel<TEntity> {
    private String errorMessage;
    private TEntity data;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public TEntity getData() {
        return data;
    }

    public void setData(TEntity data) {
        this.data = data;
    }
}
