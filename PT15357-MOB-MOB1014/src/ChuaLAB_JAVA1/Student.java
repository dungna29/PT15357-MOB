/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuaLAB_JAVA1;

import Slide5.*;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Student implements Comparable<Student> {

    private String tenSV;
    private String monSV;
    private int tuoiSV;

    public Student() {
    }

    public Student(String tenSV, String monSV, int tuoiSV) {
        this.tenSV = tenSV;
        this.monSV = monSV;
        this.tuoiSV = tuoiSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMonSV() {
        return monSV;
    }

    public void setMonSV(String monSV) {
        this.monSV = monSV;
    }

    public int getTuoiSV() {
        return tuoiSV;
    }

    public void setTuoiSV(int tuoiSV) {
        this.tuoiSV = tuoiSV;
    }
    

    @Override
    public int compareTo(Student objectstudent) {
//        return this.tenSV.compareTo(objectstudent.getTenSV());
        if (this.tuoiSV > objectstudent.getTuoiSV()) {
            return 1;
        } else if (this.getTuoiSV() < objectstudent.getTuoiSV()) {
            return -1;
        } else {
            return 0;
        }
    }

}
