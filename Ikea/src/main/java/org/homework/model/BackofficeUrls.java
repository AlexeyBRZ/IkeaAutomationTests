package org.homework.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BackofficeUrls {
    @JsonProperty("public")
    private String Public;
    private String productoffering;
    private String userprofile;
    private String localizationservice;

    public BackofficeUrls(String Public, String productoffering, String userprofile, String localizationservice) {
        this.Public = Public;
        this.productoffering = productoffering;
        this.userprofile = userprofile;
        this.localizationservice = localizationservice;
    }

    public BackofficeUrls() {
    }

    public String getPublic() {
        return Public;
    }

    public void setPublic(String aPublic) {
        Public = aPublic;
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
