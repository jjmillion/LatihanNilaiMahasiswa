/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihannilaimahasiswa;

import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Student
 */
public class NilaiTerm {
    private Siswa siswa;
    private Map<String, Integer> nilai;

    public NilaiTerm(Siswa siswa, Map<String, Integer> nilai) {
        this.siswa = siswa;
        this.nilai = nilai;
    }

    public Siswa getSiswa() {
        return siswa;
    }

    public void setSiswa(Siswa siswa) {
        this.siswa = siswa;
    }

    public Map<String, Integer> getNilai() {
        return nilai;
    }

    public void setNilai(Map<String, Integer> nilai) {
        this.nilai = nilai;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.siswa);
        hash = 53 * hash + Objects.hashCode(this.nilai);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NilaiTerm other = (NilaiTerm) obj;
        if (!Objects.equals(this.siswa, other.siswa)) {
            return false;
        }
        if (!Objects.equals(this.nilai, other.nilai)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NilaiTerm{" + "siswa=" + siswa + ", nilai=" + nilai + '}';
    }
    
    
}
