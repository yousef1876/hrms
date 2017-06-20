package com.application.hrms.project.model;

public enum TaskStatus {
    SUCCESS("success"),
    PENDDING("pendding"),
    FAILED("failed");
	

    private String url;

    TaskStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}