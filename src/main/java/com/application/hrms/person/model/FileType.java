package com.application.hrms.person.model;

public enum FileType {
	CV("resume"),
    IMAGE("image"),
    CERTIFICATE("certificate");
	

    private String url;

    FileType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
