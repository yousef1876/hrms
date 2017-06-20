package com.application.hrms.person.model;

public enum Gender {
	MALE("male"),
    FEMALE("female");
	

    private String url;

    Gender(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
