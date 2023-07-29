package org.homework.model.accountId;

import java.util.List;

public class Experiments {
    private String id;
    private String key;
    private String status;
    private String layerId;
    private List<Variations> variations;
    private List<TrafficAllocation> trafficAllocations;
    private Object forcedVariations;
    private List audienceIds;
    private List audienceConditions;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLayerId() {
        return layerId;
    }

    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }

    public List<Variations> getVariations() {
        return variations;
    }

    public void setVariations(List<Variations> variations) {
        this.variations = variations;
    }

    public List<TrafficAllocation> getTrafficAllocations() {
        return trafficAllocations;
    }

    public void setTrafficAllocations(List<TrafficAllocation> trafficAllocations) {
        this.trafficAllocations = trafficAllocations;
    }

    public Object getForcedVariations() {
        return forcedVariations;
    }

    public void setForcedVariations(Object forcedVariations) {
        this.forcedVariations = forcedVariations;
    }

    public List getAudienceIds() {
        return audienceIds;
    }

    public void setAudienceIds(List audienceIds) {
        this.audienceIds = audienceIds;
    }

    public List getAudienceConditions() {
        return audienceConditions;
    }

    public void setAudienceConditions(List audienceConditions) {
        this.audienceConditions = audienceConditions;
    }
}
