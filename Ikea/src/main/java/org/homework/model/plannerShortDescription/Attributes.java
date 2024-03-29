package org.homework.model.plannerShortDescription;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attributes {
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Value")
    private String value;
    @JsonProperty("Type")
    private String type;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
