package org.homework.model.plannerShortDescription;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Assets {
    @JsonProperty("Uri")
    private String uri;
    @JsonProperty("Type")
    private int type;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
