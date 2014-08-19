package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
	// write your code here
        List<Employee> employees = new ArrayList<Employee>();
        try {
            BufferedReader line = new BufferedReader(new FileReader("Summer2014data.txt"));
            String ugh = line.readLine();
            String s;

            while((s=line.readLine())!=null){
                String[] employeeParts = s.split("\\s+");

                if(employeeParts.length==10 && employeeParts[2].equals("B")){
                    if(employeeParts[4].equals("1") || employeeParts[6].equals("1") || employeeParts[8].equals("1")) {
                Employee employee = new Employee();
                employee.setEmployeeID(employeeParts[0]);
                employee.setDateOf(employeeParts[1]);
                employee.setTypeOfSample(employeeParts[2]);
                employee.setJobCode(employeeParts[3]);
                employee.setElement1(employeeParts[4]);
                employee.setElement1Value(employeeParts[5]);
                employee.setElement2(employeeParts[6]);
                employee.setElement2Value(employeeParts[7]);
                employee.setElement3(employeeParts[8]);
                employee.setElement3Value(employeeParts[9]);
                employees.add(employee);
//                System.out.println(employee);
                    }
                }
                else if(employeeParts.length == 8 && employeeParts[2].equals("B")){
                    if(employeeParts[4].equals("1") || employeeParts[6].equals("1") ){
                    Employee employee = new Employee();
                    employee.setEmployeeID(employeeParts[0]);
                    employee.setDateOf(employeeParts[1]);
                    employee.setTypeOfSample(employeeParts[2]);
                    employee.setJobCode(employeeParts[3]);
                    employee.setElement1(employeeParts[4]);
                    employee.setElement1Value(employeeParts[5]);
                    employee.setElement2(employeeParts[6]);
                    employee.setElement2Value(employeeParts[7]);
                    employees.add(employee);
                        System.out.println(employee);
                    }
                }
                else if(employeeParts.length == 6 && employeeParts[2].equals("B")){
                    if(employeeParts[4].equals("1")){
                    Employee employee = new Employee();
                    employee.setEmployeeID(employeeParts[0]);
                    employee.setDateOf(employeeParts[1]);
                    employee.setTypeOfSample(employeeParts[2]);
                    employee.setJobCode(employeeParts[3]);
                    employee.setElement1(employeeParts[4]);
                    employee.setElement1Value(employeeParts[5]);
                    employees.add(employee);
                        System.out.println(employee);
                    }
                }
            }
            line.close();
        } catch (IOException e) {
            System.out.println("Exception thrown while reading");
            System.out.println(e);
        }
    }
}
