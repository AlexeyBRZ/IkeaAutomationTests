package org.homework.model;

public class Pax {
    private String version;
    private String accountId;
    private String projectId;
    private String revision;
    private String attributes;
    private String audiences;
    private String events;

    public Pax() {
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

    public String getAttributes() {
        return attributes;
    }

    public String getAudiences() {
        return audiences;
    }

    public String getEvents() {
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
}
