package org.homework.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SimpleCeiling {
    @JsonProperty("IsMacro")
    private boolean isMacro;
    @JsonProperty("OptionCount")
    private int optionCount;
    @JsonProperty("FeatureType")
    private int featureType;
    @JsonProperty("AssetCodes")
    private List<AssetCodes> assetCodes;
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Attributes")
    private List<Object> attributes;
    @JsonProperty("Tags")
    private Object tags;

    public SimpleCeiling(boolean isMacro, int optionCount, int featureType, List assetCodes, int id, String code, String description, List attributes, Object tags) {
        this.isMacro = isMacro;
        this.optionCount = optionCount;
        this.featureType = featureType;
        this.assetCodes = assetCodes;
        this.id = id;
        this.code = code;
        this.description = description;
        this.attributes = attributes;
        this.tags = tags;
    }

    public SimpleCeiling() {

    }

    public boolean isMacro() {
        return isMacro;
    }

    public void setMacro(boolean macro) {
        this.isMacro = macro;
    }

    public int getOptionCount() {
        return optionCount;
    }

    public void setOptionCount(int optionCount) {
        this.optionCount = optionCount;
    }

    public List<org.homework.model.AssetCodes> getAssetCodes() {
        return assetCodes;
    }

    public void setAssetCodes(List<org.homework.model.AssetCodes> assetCodes) {
        this.assetCodes = assetCodes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
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

    public List<Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public int getFeatureType() {
        return featureType;
    }

    public void setFeatureType(int featureType) {
        this.featureType = featureType;
    }
}
