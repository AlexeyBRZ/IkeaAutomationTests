package org.homework.model;

import java.util.List;

public class SimpleCeiling {

    private boolean Ismarco;
    private int OptionCount;
    private List<AssetCodes> AssetCodes;
    private int Id;
    private String Code;
    private String Description;
    private List<Object> Attributes;
    private Object Tags;

    public SimpleCeiling(boolean ismarco, int optionCount, List assetCodes, int id, String code, String description, List attributes, Object tags) {
        this.Ismarco = ismarco;
        this.OptionCount = optionCount;
        this.AssetCodes = assetCodes;
        this.Id = id;
        this.Code = code;
        this.Description = description;
        this.Attributes = attributes;
        this.Tags = tags;
    }

    public boolean isIsmarco() {
        return Ismarco;
    }

    public void setIsmarco(boolean ismarco) {
        Ismarco = ismarco;
    }

    public int getOptionCount() {
        return OptionCount;
    }

    public void setOptionCount(int optionCount) {
        OptionCount = optionCount;
    }

    public List<org.homework.model.AssetCodes> getAssetCodes() {
        return AssetCodes;
    }

    public void setAssetCodes(List<org.homework.model.AssetCodes> assetCodes) {
        AssetCodes = assetCodes;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public List<Object> getAttributes() {
        return Attributes;
    }

    public void setAttributes(List<Object> attributes) {
        Attributes = attributes;
    }

    public Object getTags() {
        return Tags;
    }

    public void setTags(Object tags) {
        Tags = tags;
    }
}
