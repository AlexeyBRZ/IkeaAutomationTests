package org.homework.model;

public class LibVersion {
    private String libVersion;
    private String libName;

    public LibVersion(String libVersion, String libName) {
        this.libVersion = libVersion;
        this.libName = libName;
    }

    public LibVersion() {
    }

    public String getLibVersion() {
        return libVersion;
    }

    public void setLibVersion(String libVersion) {
        this.libVersion = libVersion;
    }

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }
}
