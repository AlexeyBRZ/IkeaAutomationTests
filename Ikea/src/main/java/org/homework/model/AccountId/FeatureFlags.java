package org.homework.model.AccountId;

import java.util.List;

public class FeatureFlags {
    private String id;
    private String key;
    private String rolloutId;
    private List experimentIds;
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

    public String getRolloutId() {
        return rolloutId;
    }

    public void setRolloutId(String rolloutId) {
        this.rolloutId = rolloutId;
    }

    public List getExperimentIds() {
        return experimentIds;
    }

    public void setExperimentIds(List experimentIds) {
        this.experimentIds = experimentIds;
    }

    public List getVariables() {
        return variables;
    }

    public void setVariables(List variables) {
        this.variables = variables;
    }
}
