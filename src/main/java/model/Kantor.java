package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import komparasi.komparatorNama;

public class Kantor {

    private String nama;
    private List<Pegawai> daftarPegawai;

    public Kantor(String n) {
        nama = n;
        daftarPegawai = new ArrayList<>();
    }

    public List<Pegawai> getDaftarPegawai() {
        if (daftarPegawai == null) {
            return new ArrayList<>();
        }
        return daftarPegawai;
    }

    public void tambahPegawai(Pegawai peg) {
        if (peg != null) {
            daftarPegawai.add(peg);
        } else {
            daftarPegawai.add(null);
        }
    }

    public void hapusPegawai(String namaPeg) {
        for (int i = 0; i < daftarPegawai.size(); i++) {
            if (daftarPegawai.get(i).getNama().equals(namaPeg)) {
                daftarPegawai.remove(i);
                i--;
            }
        }
    }

    public void urutkanSesuaiGaji() {
        Collections.sort(daftarPegawai);
        Collections.sort(daftarPegawai);
    }

    public void urutkanSesuaiNama() {
        Collections.sort(daftarPegawai, new komparatorNama());
        Collections.sort(daftarPegawai, new Comparator<Pegawai>() {
            @Override
            public int compare(Pegawai o1, Pegawai o2) {
                return o1.getNama().compareTo(o2.getNama());
            }
        });
    }

    public ArrayList<Pegawai> getSesuaiUmur(int umur) {
        return daftarPegawai.stream()
                .filter(Pegawai -> Pegawai.getUmur() == umur)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
