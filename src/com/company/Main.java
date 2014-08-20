package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {



    public static void main(String[] args) {
	// write your code here
        HashMap<String, List<Employee>> employees = new HashMap<String, List<Employee>>();
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
                if(employees.containsKey(employee.getEmployeeID())){
                 List<Employee> emps = employees.get(employee.getEmployeeID());
                 emps.add(employee);
                employees.put(employee.getEmployeeID(), emps);
                }
                else{
                    List<Employee> emps = new ArrayList<Employee>();
                    emps.add(employee);
                    employees.put(employee.getEmployeeID(),emps);
                }
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
                        if(employees.containsKey(employee.getEmployeeID())){
                            List<Employee> emps = employees.get(employee.getEmployeeID());
                            emps.add(employee);
                            employees.put(employee.getEmployeeID(), emps);
                        }
                        else{
                            List<Employee> emps = new ArrayList<Employee>();
                            emps.add(employee);
                            employees.put(employee.getEmployeeID(),emps);
                        }
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
                        if(employees.containsKey(employee.getEmployeeID())){
                            List<Employee> emps = employees.get(employee.getEmployeeID());
                            emps.add(employee);
                            employees.put(employee.getEmployeeID(), emps);
                        }
                        else{
                            List<Employee> emps = new ArrayList<Employee>();
                            emps.add(employee);
                            employees.put(employee.getEmployeeID(),emps);
                        }
                    }
                }
            }
            line.close();
        } catch (IOException e) {
            System.out.println("Exception thrown while reading");
            System.out.println(e);
        }
        Iterator it = employees.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();
            List<Employee> empDates = (List<Employee>) pair.getValue();
            System.out.println(pair.getKey());
            System.out.println(".........................");
            for(Employee emp: empDates){
                System.out.println(emp);
            }
            System.out.println("\n");
        }
    }

    public static void doCalc(List<Employee>empDates){

    }


}
