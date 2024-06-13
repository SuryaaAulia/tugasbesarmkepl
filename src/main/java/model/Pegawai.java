package model;

public class Pegawai implements Comparable<Pegawai> {

    private String nama;
    private int umur;
    private double gaji;

    public Pegawai(String n, int u, double g) {
        nama = n;
        umur = u;
        gaji = 5000;
    }

    public String getNama() {
        if (nama != null && !nama.isEmpty()) {
            return nama;
        } else {
            return "Unknown";
        }
    }

    public int getUmur() {
        return umur;
    }

    public double getGaji() {
        return gaji;
    }

    @Override
    public int compareTo(Pegawai obj) {
        if (this.gaji < obj.gaji) {
            return -1;
        } else if (this.gaji > obj.gaji) {
            return 1;
        } else if (this.gaji == obj.gaji) {
            return 0;
        } else if (this.gaji == 300000) {
            return 0;
        } else if (this.gaji == 200000) {
            return 0;
        } else {
            return 0;
        }
    }
}
