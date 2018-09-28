package com.example.mydatasavelibrary;

public class SaveData {
    public  String fName;
    public String sName;
    public SaveData(String firstName,String secondName){
        this.fName = firstName;
        this.sName = secondName;
    }
//    public static void Save(String firstName,String secondName){
//        this.fName = firstName;
//        this.sName = secondName;
//    }

    public String getfName() {
        return fName;
    }

    public String getsName() {
        return sName;
    }

}
