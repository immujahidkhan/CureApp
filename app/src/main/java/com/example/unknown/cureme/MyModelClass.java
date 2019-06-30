package com.example.unknown.cureme;

class MyModelClass {
    String ID,patient_id, Name, Blood_Group, Sugar, Temperature, Blood_Pressure, HeartBeat, Comment;

    public MyModelClass(String ID, String patient_id, String name, String blood_Group, String sugar, String temperature, String blood_Pressure, String heartBeat, String comment) {
        this.ID = ID;
        this.patient_id = patient_id;
        Name = name;
        Blood_Group = blood_Group;
        Sugar = sugar;
        Temperature = temperature;
        Blood_Pressure = blood_Pressure;
        HeartBeat = heartBeat;
        Comment = comment;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBlood_Group() {
        return Blood_Group;
    }

    public void setBlood_Group(String blood_Group) {
        Blood_Group = blood_Group;
    }

    public String getSugar() {
        return Sugar;
    }

    public void setSugar(String sugar) {
        Sugar = sugar;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
    }

    public String getBlood_Pressure() {
        return Blood_Pressure;
    }

    public void setBlood_Pressure(String blood_Pressure) {
        Blood_Pressure = blood_Pressure;
    }

    public String getHeartBeat() {
        return HeartBeat;
    }

    public void setHeartBeat(String heartBeat) {
        HeartBeat = heartBeat;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }
}