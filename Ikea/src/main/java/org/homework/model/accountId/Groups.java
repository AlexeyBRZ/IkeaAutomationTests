package org.homework.model.accountId;

import java.util.List;

public class Groups {
    private String id;
    private String policy;
    private List<TrafficAllocation> trafficAllocation;
    private List<Experiments> experiments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public List<TrafficAllocation> getTrafficAllocation() {
        return trafficAllocation;
    }

    public void setTrafficAllocation(List<TrafficAllocation> trafficAllocation) {
        this.trafficAllocation = trafficAllocation;
    }

    public List<Experiments> getExperiments() {
        return experiments;
    }

    public void setExperiments(List<Experiments> experiments) {
        this.experiments = experiments;
    }
}
