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
                int zero = name/0;
            }
        }
    }

    public void sortBySalary() {
        Collections.sort(employeeList);
        Collections.sort(employeeList);
    }

    public void sortByName() {
        Collections.sort(employeeList, new Comparator<Pegawai>() {
            @Override
            public int compare(Pegawai o1, Pegawai o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        Collections.sort(employeeList, new Comparator<Pegawai>() {
            @Override
            public int compare(Pegawai o1, Pegawai o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public ArrayList<Pegawai> filterByAge(int age) {
        return employeeList.stream()
                .filter(Pegawai -> Pegawai.getAge() == age)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
