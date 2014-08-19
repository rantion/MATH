package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: Rachel
 * Date: 8/11/14
 * Time: 3:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {

    private String employeeID;
    private String dateOf;
    private String typeOfSample;
    private String jobCode;
    private String element1;
    private String element1Value;
    private String element2;
    private String element2Value;
    private String element3;
    private String element3Value;


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getDateOf() {
        return dateOf;
    }

    public void setDateOf(String dateOf) {
        this.dateOf = dateOf;
    }

    public String getTypeOfSample() {
        return typeOfSample;
    }

    public void setTypeOfSample(String typeOfSample) {
        this.typeOfSample = typeOfSample;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getElement1() {
        return element1;
    }

    public void setElement1(String element1) {
        this.element1 = element1;
    }

    public String getElement1Value() {
        return element1Value;
    }

    public void setElement1Value(String element1Value) {
        this.element1Value = element1Value;
    }

    public String getElement2() {
        return element2;
    }

    public void setElement2(String element2) {
        this.element2 = element2;
    }

    public String getElement2Value() {
        return element2Value;
    }

    public void setElement2Value(String element2Value) {
        this.element2Value = element2Value;
    }

    public String getElement3() {
        return element3;
    }

    public void setElement3(String element3) {
        this.element3 = element3;
    }

    public String getElement3Value() {
        return element3Value;
    }

    public void setElement3Value(String element3Value) {
        this.element3Value = element3Value;
    }

    public String toString(){
        return "ID: "+employeeID+", dateof: "+dateOf+", Type of sample: "+typeOfSample+
                ", Job Code: "+jobCode+ ", Element 1: "+element1+" E1 Val: "+element1Value
                +", Element 2: "+element2+" E2 Value: "+element2Value+", Element 3: "+element3+
                " E3 Value: "+element3Value;
    }
}
