package com.pcs.suman.crud.model;

public class Student {
  private int StudetId;
  private String Emailid;
  private  String Address;

    public Student() {}
    public Student(int studentId, String emailId, String address) {
      this.StudetId=studentId;
      this.Emailid=emailId;
      this.Address=address;
    }
    public int getStudetId() {
        return StudetId;
    }

    public void setStudetid(int studetid) {
        StudetId = studetid;
    }

    public String getEmailid() {
        return Emailid;
    }

    public void setEmailid(String emailid) {
        Emailid = emailid;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
