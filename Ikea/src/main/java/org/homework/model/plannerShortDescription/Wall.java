package org.homework.model.plannerShortDescription;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Wall {
    @JsonProperty("RetailerCode")
    private String retailerCode;
    @JsonProperty("LineTypeCode")
    private String lineTypeCode;
    @JsonProperty("DisplayOrder")
    private int displayOrder;
    @JsonProperty("IsConfigurable")
    private boolean isConfigurable;
    @JsonProperty("Describers")
    private List<Object> describers;
    @JsonProperty("Prices")
    private List<Object> prices;
    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("ShortDescription")
    private String shortDescription;
    @JsonProperty("Assets")
    private List<Assets> assets;
    @JsonProperty("Attributes")
    private List<Attributes> attributes;
    @JsonProperty("Tags")
    private Object tags;

    public Wall(String retailerCode, String lineTypeCode, int displayOrder, boolean isConfigurable, List<Object> describers, List<Object> prices,
                String effectiveDate, boolean isActive, int id, String code, String description, String shortDescription, List<Assets> assets,
                List<Attributes> attributes, Object tags) {
        this.retailerCode = retailerCode;
        this.lineTypeCode = lineTypeCode;
        this.displayOrder = displayOrder;
        this.isConfigurable = isConfigurable;
        this.describers = describers;
        this.prices = prices;
        this.effectiveDate = effectiveDate;
        this.isActive = isActive;
        this.id = id;
        this.code = code;
        this.description = description;
        this.shortDescription = shortDescription;
        this.assets = assets;
        this.attributes = attributes;
        this.tags = tags;
    }

    public Wall() {
    }

    public String getLineTypeCode() {
        return lineTypeCode;
    }

    public void setLineTypeCode(String lineTypeCode) {
        this.lineTypeCode = lineTypeCode;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public boolean isConfigurable() {
        return isConfigurable;
    }

    public void setConfigurable(boolean configurable) {
        isConfigurable = configurable;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public List<org.homework.model.plannerShortDescription.Assets> getAssets() {
        return assets;
    }

    public void setAssets(List<org.homework.model.plannerShortDescription.Assets> assets) {
        this.assets = assets;
    }

    public List<org.homework.model.plannerShortDescription.Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<org.homework.model.plannerShortDescription.Attributes> attributes) {
        this.attributes = attributes;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public List<Object> getDescribers() {
        return describers;
    }

    public void setDescribers(List<Object> describers) {
        this.describers = describers;
    }

    public List<Object> getPrices() {
        return prices;
    }

    public void setPrices(List<Object> prices) {
        this.prices = prices;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRetailerCode() {
        return retailerCode;
    }

    public void setRetailerCode(String retailerCode) {
        this.retailerCode = retailerCode;
    }
}
