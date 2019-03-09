package com.decision_aid.bean;

/*
 * ½ÇÉ«¹ÜÀí
 */

public class RoleManagement {
    private Integer id;

    private String teaId;

    private String rmName;

    private String rmAccess;

    private String rmRemake;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    public String getRmName() {
        return rmName;
    }

    public void setRmName(String rmName) {
        this.rmName = rmName;
    }

    public String getRmAccess() {
        return rmAccess;
    }

    public void setRmAccess(String rmAccess) {
        this.rmAccess = rmAccess;
    }

    public String getRmRemake() {
        return rmRemake;
    }

    public void setRmRemake(String rmRemake) {
        this.rmRemake = rmRemake;
    }
}