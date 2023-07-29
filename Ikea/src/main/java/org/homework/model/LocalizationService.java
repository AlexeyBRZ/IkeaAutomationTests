package org.homework.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocalizationService {
    @JsonProperty("BackOfficeUrls")
    private BackofficeUrls backofficeUrls;
    @JsonProperty("AppEngine")
    private String appEngine;
    @JsonProperty("2DViewer")
    private String twoDViewer;
    @JsonProperty("3DViewer")
    private String threeDViewer;
    @JsonProperty("LayerViewer")
    private String layerViewer;
    @JsonProperty("MeasureViewer")
    private String measureViewer;
    @JsonProperty("3DEngine")
    private String threeDEngine;
    @JsonProperty("DevToolbox")
    private String devToolBox;
    @JsonProperty("DesignDataViewer")
    private String designDataViewer;
    @JsonProperty("designsummary")
    private String designSummary;
    @JsonProperty("DesignLanguage")
    private String designLanguage;
    @JsonProperty("ProjectManagement")
    private String projectManagement;
    @JsonProperty("ProductBrowser")
    private String productBrowser;
    @JsonProperty("ProductConfigurator")
    private String productConfigurator;
    @JsonProperty("IS_SharedUI")
    private String isSharedui;
    @JsonProperty("IS_Define")
    private String isDefine;
    @JsonProperty("DesignWorkbox")
    private String designWorkbox;


    public LocalizationService(BackofficeUrls backOfficeUrls, String appEngine, String twoDViewer, String threeDViewer, String layerViewer, String measureViewer,
                               String threeDEngine, String devToolbox, String designDataViewer, String designSummary, String designLanguage,
                               String projectManagement, String productBrowser, String productConfigurator, String isSharedui, String isDefine,
                               String designWorkbox) {
        this.backofficeUrls = backOfficeUrls;
        this.appEngine = appEngine;
        this.twoDViewer = twoDViewer;
        this.threeDViewer = threeDViewer;
        this.layerViewer = layerViewer;
        this.measureViewer = measureViewer;
        this.threeDEngine = threeDEngine;
        this.devToolBox = devToolbox;
        this.designDataViewer = designDataViewer;
        this.designSummary = designSummary;
        this.designLanguage = designLanguage;
        this.projectManagement = projectManagement;
        this.productBrowser = productBrowser;
        this.productConfigurator = productConfigurator;
        this.isSharedui = isSharedui;
        this.isDefine = isDefine;
        this.designWorkbox = designWorkbox;
    }

    public LocalizationService() {
    }

    public String getAppEngine() {
        return appEngine;
    }

    public void setAppEngine(String appEngine) {
        this.appEngine = appEngine;
    }

    public String getTwoDViewer() {
        return twoDViewer;
    }

    public void setTwoDViewer(String twoDViewer) {
        this.twoDViewer = twoDViewer;
    }

    public String getThreeDViewer() {
        return threeDViewer;
    }

    public void setThreeDViewer(String threeDViewer) {
        this.threeDViewer = threeDViewer;
    }

    public String getLayerViewer() {
        return layerViewer;
    }

    public void setLayerViewer(String layerViewer) {
        this.layerViewer = layerViewer;
    }

    public String getMeasureViewer() {
        return measureViewer;
    }

    public void setMeasureViewer(String measureViewer) {
        this.measureViewer = measureViewer;
    }

    public String getThreeDEngine() {
        return threeDEngine;
    }

    public void setThreeDEngine(String threeDEngine) {
        this.threeDEngine = threeDEngine;
    }

    public String getDevToolBox() {
        return devToolBox;
    }

    public void setDevToolBox(String devToolBox) {
        this.devToolBox = devToolBox;
    }

    public String getDesignDataViewer() {
        return designDataViewer;
    }

    public void setDesignDataViewer(String designDataViewer) {
        this.designDataViewer = designDataViewer;
    }

    public String getDesignSummary() {
        return designSummary;
    }

    public void setDesignSummary(String designSummary) {
        this.designSummary = designSummary;
    }

    public String getDesignLanguage() {
        return designLanguage;
    }

    public void setDesignLanguage(String designLanguage) {
        this.designLanguage = designLanguage;
    }

    public String getProjectManagement() {
        return projectManagement;
    }

    public void setProjectManagement(String projectManagement) {
        this.projectManagement = projectManagement;
    }

    public String getProductBrowser() {
        return productBrowser;
    }

    public void setProductBrowser(String productBrowser) {
        this.productBrowser = productBrowser;
    }

    public String getProductConfigurator() {
        return productConfigurator;
    }

    public void setProductConfigurator(String productConfigurator) {
        this.productConfigurator = productConfigurator;
    }

    public String getIsSharedui() {
        return isSharedui;
    }

    public void setIsSharedui(String isSharedui) {
        this.isSharedui = isSharedui;
    }

    public String getIsDefine() {
        return isDefine;
    }

    public void setIsDefine(String isDefine) {
        this.isDefine = isDefine;
    }

    public String getDesignWorkbox() {
        return designWorkbox;
    }

    public void setDesignWorkbox(String designWorkbox) {
        this.designWorkbox = designWorkbox;
    }

    public BackofficeUrls getBackofficeUrls() {
        return backofficeUrls;
    }

    public void setBackofficeUrls(BackofficeUrls backofficeUrls) {
        this.backofficeUrls = backofficeUrls;
    }
}
