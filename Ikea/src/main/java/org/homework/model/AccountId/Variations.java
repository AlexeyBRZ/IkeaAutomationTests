package org.homework.model.AccountId;

import java.util.List;

public class Variations {
    private String id;
    private String key;
    private boolean featureEnabled;
    private List variables;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isFeatureEnabled() {
        return featureEnabled;
    }

    public void setFeatureEnabled(boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
    }

    public List getVariables() {
        return variables;
    }

    public void setVariables(List variables) {
        this.variables = variables;
    }
}
