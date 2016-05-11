package uk.co.sammy.model;

import java.math.BigDecimal;

/**
 * Created by smlif on 05/05/2016.
 */
public class Resource {

    private Long resourceId;
    private String name;
    private String type;
    private BigDecimal cost;
    private String unitOfMeasure;

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceId=" + getResourceId() +
                ", name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", cost=" + getCost() +
                ", unitOfMeasure='" + getUnitOfMeasure() + '\'' +
                '}';
    }
}
