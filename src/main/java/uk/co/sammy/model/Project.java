package uk.co.sammy.model;

import java.math.BigDecimal;

/**
 * Created by smlif on 03/05/2016.
 */
public class Project {

    private Long projectId;
    private String name;
    private String description;
    private String sponsor;
    private BigDecimal authorizedHours;
    private BigDecimal authorizedFunds;
    private String year;
    private boolean special;
    private String type;

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public void setAuthorizedFunds(BigDecimal authorizedFunds) {
        this.authorizedFunds = authorizedFunds;
    }

    public void setAuthorizedHours(BigDecimal authorizedHours) {
        this.authorizedHours = authorizedHours;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Long getProjectId() {
        return projectId;
    }

    public String getDescription() {
        return description;
    }

    public String getSponsor() {
        return sponsor;
    }

    public BigDecimal getAuthorizedHours() {
        return authorizedHours;
    }

    public BigDecimal getAuthorizedFunds() {
        return authorizedFunds;
    }

    public String getYear() {
        return year;
    }

    public boolean isSpecial() {
        return special;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + getProjectId() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", sponsor='" + getSponsor() + '\'' +
                ", authorizedHours=" + getAuthorizedHours() +
                ", authorizedFunds=" + getAuthorizedFunds() +
                ", year='" + getYear() + '\'' +
                ", special=" + isSpecial() +
                ", type='" + getType() + '\'' +
                '}';
    }
}
