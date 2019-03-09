package com.decision_aid.bean;

/*
 * 教师所属部门
 */

public class DivisionManagement {
    private Integer id;

    private String teaId;

    private Integer dmId;

    private String dmClassroom;

    private String dmRemake;

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

    public Integer getDmId() {
        return dmId;
    }

    public void setDmId(Integer dmId) {
        this.dmId = dmId;
    }

    public String getDmClassroom() {
        return dmClassroom;
    }

    public void setDmClassroom(String dmClassroom) {
        this.dmClassroom = dmClassroom;
    }

    public String getDmRemake() {
        return dmRemake;
    }

    public void setDmRemake(String dmRemake) {
        this.dmRemake = dmRemake;
    }
}