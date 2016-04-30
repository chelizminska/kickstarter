package com.kickstarter.models;

import java.util.Calendar;
import java.util.Date;

public class ProjectModel {
    private Integer id;
    private String name;
    private Integer countryId;
    private Integer projectTypeId;
    private String description;
    private Date startDate;
    private Date endDate;
    private Integer fundingGoal;
    private Integer fundingDuration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getProjectTypeId() {
        return projectTypeId;
    }

    public void setProjectTypeId(Integer projectTypeId) {
        this.projectTypeId = projectTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getFundingGoal() {
        return fundingGoal;
    }

    public void setFundingGoal(Integer fundingGoal) {
        this.fundingGoal = fundingGoal;
    }

    public Integer getFundingDuration() {
        return fundingDuration;
    }

    public void setFundingDuration(Integer fundingDuration) {
        this.fundingDuration = fundingDuration;
    }

    public Date getEndDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        cal.add(Calendar.DATE, fundingDuration);
        return cal.getTime();
    }
}
