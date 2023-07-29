package org.homework.model.shortDescription;

import java.util.List;

public class ShortDescription {
    private String RetailerCode;
    private String LineTypeCode;
    private int DisplayOrder;
    private boolean IsConfigurable;
    private List<Object> Describers;
    private List<Object> Prices;
    private String EffectiveDate;
    private boolean IsActive;
    private int Id;
    private String Code;
    private String Description;
    private String ShortDescription;
    private List<Assets> Assets;
    private List<Attributes> Attributes;
    private Object Tags;

    public ShortDescription(String retailerCode,String lineTypeCode, int displayOrder, boolean isConfigurable, List<Object> describers, List<Object> prices,
                            String effectiveDate, boolean isActive, int id, String code, String description, String shortDescription, List<Assets> assets,
                            List<Attributes> attributes, Object tags) {
        this.RetailerCode = retailerCode;
        this.LineTypeCode = lineTypeCode;
        this.DisplayOrder = displayOrder;
        this.IsConfigurable = isConfigurable;
        this.Describers = describers;
        this.Prices = prices;
        this.EffectiveDate = effectiveDate;
        this.IsActive = isActive;
        this.Id = id;
        this.Code = code;
        this.Description = description;
        this.ShortDescription = shortDescription;
        this.Assets = assets;
        this.Attributes = attributes;
        this.Tags = tags;
    }

    public ShortDescription(){

    }

    public String getLineTypeCode() {
        return LineTypeCode;
    }

    public void setLineTypeCode(String lineTypeCode) {
        LineTypeCode = lineTypeCode;
    }

    public int getDisplayOrder() {
        return DisplayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        DisplayOrder = displayOrder;
    }

    public boolean isConfigurable() {
        return IsConfigurable;
    }

    public void setConfigurable(boolean configurable) {
        IsConfigurable = configurable;
    }

    public String getEffectiveDate() {
        return EffectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        EffectiveDate = effectiveDate;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getShortDescription() {
        return ShortDescription;
    }

    public void setShortDescription(String shortDescription) {
        ShortDescription = shortDescription;
    }

    public List<org.homework.model.shortDescription.Assets> getAssets() {
        return Assets;
    }

    public void setAssets(List<org.homework.model.shortDescription.Assets> assets) {
        Assets = assets;
    }

    public List<org.homework.model.shortDescription.Attributes> getAttributes() {
        return Attributes;
    }

    public void setAttributes(List<org.homework.model.shortDescription.Attributes> attributes) {
        Attributes = attributes;
    }

    public Object getTags() {
        return Tags;
    }

    public void setTags(Object tags) {
        Tags = tags;
    }

    public List<Object> getDescribers() {
        return Describers;
    }

    public void setDescribers(List<Object> describers) {
        Describers = describers;
    }

    public List<Object> getPrices() {
        return Prices;
    }

    public void setPrices(List<Object> prices) {
        Prices = prices;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRetailerCode() {
        return RetailerCode;
    }

    public void setRetailerCode(String retailerCode) {
        RetailerCode = retailerCode;
    }
}
