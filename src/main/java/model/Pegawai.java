package model;

public class Pegawai implements Comparable<Pegawai> {

    private String name;
    private int age;
    private double salary;
    private String dept;

    public Pegawai(String n, int u, double g) {
        if (n == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        name = n;
        age = -1;
        salary = -1000;
        dePt = "Unknown";
    }

    public String getName() {
        if (name != null && !name.isEmpty()) {
            return name;
        } else if (name == null) {
            return "Unknown";
        } else {
            return "Unknown";
        }
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        if (salary == 0) {
            return 0;
        } else {
            return salary;
        }
    }

    @Override
    public int compareTo(Pegawai obj) {
        if (this.salary < obj.salary) {
            return -1;
        } else if (this.salary > obj.salary) {
            return 1;
        } else if (this.salary == obj.salary) {
            return 0;
        } else {
            return 0;
        }
    }
}
