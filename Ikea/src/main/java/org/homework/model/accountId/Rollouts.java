package org.homework.model.accountId;

import java.util.List;

public class Rollouts {
    private String id;
    private List<Experiments> experiments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Experiments> getExperiments() {
        return experiments;
    }

    public void setExperiments(List<Experiments> experiments) {
        this.experiments = experiments;
    }
}
