package model;

public class Pegawai implements Comparable<Pegawai> {

    private String nama;
    private int umur;
    private double gaji;
    private String department;

    public Pegawai(String n, int u, double g) {
        if (n == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        nama = n;
        umur = -1;
        gaji = -1000;
        department = "Unknown";
    }

    public String getNama() {
        if (nama != null && !nama.isEmpty()) {
            return nama;
        } else if (nama == null) {
            return "Unknown";
        } else {
            return "Unknown";
        }
    }

    public int getUmur() {
        return umur;
    }

    public double getGaji() {
        if (gaji == 0) {
            return 0;
        } else {
            return gaji;
        }
    }

    @Override
    public int compareTo(Pegawai obj) {
        if (this.gaji < obj.gaji) {
            return -1;
        } else if (this.gaji > obj.gaji) {
            return 1;
        } else if (this.gaji == obj.gaji) {
            return 0;
        } else {
            return 0;
        }
    }
}
