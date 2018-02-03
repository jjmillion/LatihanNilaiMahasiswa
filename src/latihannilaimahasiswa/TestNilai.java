package latihannilaimahasiswa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author UPHM
 */
public class TestNilai {

    public static void main(String[] args) {
        NilaiTerm budi = new NilaiTerm(new Siswa("Budi", "0001"), new HashMap<String, Integer>());
        NilaiTerm susi = new NilaiTerm(new Siswa("Susi", "0002"), new HashMap<String, Integer>());

        // tambahkan nilai untuk budi
        budi.getNilai().put("Pengembangan Aplikasi", 80);
        budi.getNilai().put("Bahasa Inggris", 70);

        // tambahkan nilai untuk susi
        susi.getNilai().put("Pengembangan Aplikasi", 70);
        susi.getNilai().put("Bahasa Inggris", 90);

        List<NilaiTerm> daftarNilai = new ArrayList<>();
        daftarNilai.add(budi);
        daftarNilai.add(susi);

        daftarNilai.forEach(System.out::println);

        //Versi pakai For int i=0
        /*for (int i = 0; i < daftarNilai.size(); i++) {
            NilaiTerm temp = daftarNilai.get(i);
            System.out.printf("%s %n", temp.getSiswa());
            System.out.println("===================================================================================");
            System.out.println("Mata Kuliah\t\t\tNilai Angka\t\t\tNilai Huruf");
            System.out.println("===================================================================================");
            for (Entry<String, Integer> e : temp.getNilai().entrySet()) {
                String mp = e.getKey();
                Integer np = e.getValue();
                System.out.println(mp + "\t\t\t" + np + "\t\t\t\t" + (np >= 80 ? "A" : np >= 70 ? "B" : np >= 60 ? "C" : np >= 50 ? "D" : "E"));
            }
        }*/
        for (NilaiTerm score : daftarNilai) {
            System.out.printf("%s %n", score.getSiswa());
            System.out.println("===================================================================================");
            System.out.printf("%15s %30s %30s %n", "Mata Kuliah" , "Nilai Angka", "Nilai Huruf");
            //System.out.println("Mata Kuliah\t\t\tNilai Angka\t\t\tNilai Huruf");
            System.out.println("===================================================================================");
            for (Entry<String, Integer> e : score.getNilai().entrySet()) {
                String mp = e.getKey();
                Integer np = e.getValue();
                String code = (np >= 80 ? "A" : np >= 70 ? "B" : np >= 60 ? "C" : np >= 50 ? "D" : "E");
                //System.out.println(mp + "\t\t\t" + np + "\t\t\t\t" + (np >= 80 ? "A" : np >= 70 ? "B" : np >= 60 ? "C" : np >= 50 ? "D" : "E"));
                System.out.printf("%21s %20s %30s %n", mp , np, code);
            }
        }
    }
}
