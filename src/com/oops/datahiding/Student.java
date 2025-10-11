package com.oops.datahiding;

// encapsulation = data hiding + abstraction
public class Student {
   // data hiding
    private int sudentId;
    private  String studentName;
    private  String studentRollNo;

    // abstraction


    public int getSudentId () {
        return sudentId;
    }

    public void setSudentId (int sudentId) {
        this.sudentId = sudentId;
    }

    public String getStudentName () {
        return studentName;
    }

    public void setStudentName (String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRollNo () {
        return studentRollNo;
    }

    public void setStudentRollNo (String studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    @Override
    public String toString () {
        return "Student{" +
                "sudentId=" + sudentId +
                ", studentName='" + studentName + '\'' +
                ", studentRollNo='" + studentRollNo + '\'' +
                '}';
    }
}
