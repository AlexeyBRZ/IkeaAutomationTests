package org.homework.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BackofficeUrls {
    @JsonProperty("public")
    private String testPublic;
    private String productoffering;
    private String userprofile;
    private String localizationservice;

    public BackofficeUrls(String testPublic, String productoffering, String userprofile, String localizationservice) {
        this.testPublic = testPublic;
        this.productoffering = productoffering;
        this.userprofile = userprofile;
        this.localizationservice = localizationservice;
    }

    public BackofficeUrls() {
    }

    public String getTestPublic() {
        return testPublic;
    }

    public void setTestPublic(String testPublic) {
        this.testPublic = this.testPublic;
    }

    public String getProductoffering() {
        return productoffering;
    }

    public void setProductoffering(String productoffering) {
        this.productoffering = productoffering;
    }

    public String getUserprofile() {
        return userprofile;
    }

    public void setUserprofile(String userprofile) {
        this.userprofile = userprofile;
    }

    public String getLocalizationservice() {
        return localizationservice;
    }

    public void setLocalizationservice(String localizationservice) {
        this.localizationservice = localizationservice;
    }
}
