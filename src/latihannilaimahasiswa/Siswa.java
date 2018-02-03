package latihannilaimahasiswa;


import java.util.Objects;

public class Siswa {
    private String nama;
    private String nim;

    public Siswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nama);
        hash = 37 * hash + Objects.hashCode(this.nim);
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
        final Siswa other = (Siswa) obj;
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.nim, other.nim)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nama=" + nama + ", nim=" + nim + '}';
    }
    
}
