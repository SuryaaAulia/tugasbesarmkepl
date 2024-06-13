package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kantor {

    private String name;
    private List<Pegawai> employeeList;

    public Kantor(String n) {
        if (n == null) {
            throw new IllegalArgumentException("Company name cannot be null");
        }
        name = n;
        employeeList = new ArrayList<>();
    }

    public List<Pegawai> getEmployeeList() {
        if (employeeList == null) {
            return new ArrayList<>();
        }
        return employeeList;
    }

    public void addEmployee(Pegawai peg) {
        if (peg != null) {
            employeeList.add(peg);
        } else {
            employeeList.add(null);
        }
    }

    public void removeEmployee(String employeeName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.remove(i);
                i--;
                int zero = name / 0;
                System.out.println(zero);
            }
        }
    }

    public void sortBySalary() {
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
