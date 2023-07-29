package org.homework.model.AccountId;

import java.util.List;

public class Pax {

    private String accountId;
    private boolean anonymizeIP;
    private List<Attributes> attributes;
    private List<Audience> audiences;
    private boolean botFiltering;
    private String environmentKey;
    private List<Events> events;
    private List<Experiments> experiments;
    private List<FeatureFlags> featureFlags;
    private List<Groups> groups;
    private String projectId;
    private String revision;
    private List<Rollouts> rollouts;
    private String sdKey;
    private List<TypedAudiences> typedAudiences;
    private List variables;
    private String version;

    public Pax(String accountId, boolean anonymizeIP, List<Attributes> attributes, List<Audience> audiences, boolean botFiltering,
               String environmentKey, List<Events> events, List<Experiments> experiments, List<FeatureFlags> featureFlags, List<Groups> groups,
               String projectId, String revision, List<Rollouts> rollouts, String sdKey, List<TypedAudiences> typedAudiences, List variables,
               String version) {
        this.accountId = accountId;
        this.anonymizeIP = anonymizeIP;
        this.attributes = attributes;
        this.audiences = audiences;
        this.botFiltering = botFiltering;
        this.environmentKey = environmentKey;
        this.events = events;
        this.experiments = experiments;
        this.featureFlags = featureFlags;
        this.groups = groups;
        this.projectId = projectId;
        this.revision = revision;
        this.rollouts = rollouts;
        this.sdKey = sdKey;
        this.typedAudiences = typedAudiences;
        this.variables = variables;
        this.version = version;
    }

    public Pax(){
    }

    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    public void setAudiences(List<Audience> audiences) {
        this.audiences = audiences;
    }

    public String getVersion() {
        return version;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getRevision() {
        return revision;
    }

    public List<Audience> getAudiences() {
        return audiences;
    }

    public List<Events> getEvents() {
        return events;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public List getVariables() {
        return variables;
    }

    public void setVariables(List variables) {
        this.variables = variables;
    }

    public String getEnvironmentKey() {
        return environmentKey;
    }

    public void setEnvironmentKey(String environmentKey) {
        this.environmentKey = environmentKey;
    }

    public boolean isAnonymizeIP() {
        return anonymizeIP;
    }

    public void setAnonymizeIP(boolean anonymizeIP) {
        this.anonymizeIP = anonymizeIP;
    }

    public boolean isBotFiltering() {
        return botFiltering;
    }

    public void setBotFiltering(boolean botFiltering) {
        this.botFiltering = botFiltering;
    }

    public void setEvents(List<Events> events) {
        this.events = events;
    }

    public List<TypedAudiences> getTypedAudiences() {
        return typedAudiences;
    }

    public void setTypedAudiences(List<TypedAudiences> typedAudiences) {
        this.typedAudiences = typedAudiences;
    }

    public String getSdKey() {
        return sdKey;
    }

    public void setSdKey(String sdKey) {
        this.sdKey = sdKey;
    }

    public List<FeatureFlags> getFeatureFlags() {
        return featureFlags;
    }

    public void setFeatureFlags(List<FeatureFlags> featureFlags) {
        this.featureFlags = featureFlags;
    }

    public List<Experiments> getExperiments() {
        return experiments;
    }

    public void setExperiments(List<Experiments> experiments) {
        this.experiments = experiments;
    }

    public List<Groups> getGroups() {
        return groups;
    }

    public void setGroups(List<Groups> groups) {
        this.groups = groups;
    }

    public List<Rollouts> getRollouts() {
        return rollouts;
    }

    public void setRollouts(List<Rollouts> rollouts) {
        this.rollouts = rollouts;
    }
}
