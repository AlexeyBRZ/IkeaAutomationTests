package org.homework.model.accountId;

import java.util.List;

public class Events {
    private String id;
    private List experimentIds;
    private String key;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List getExperimentIds() {
        return experimentIds;
    }

    public void setExperimentIds(List experimentIds) {
        this.experimentIds = experimentIds;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
