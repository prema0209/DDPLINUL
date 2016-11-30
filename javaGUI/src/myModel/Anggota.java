/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myModel;

/**
 *
 * @author prema
 */
public class Anggota {
    private String NoAnggota;
    private String Nama;
    private String Alamat;
    private String Pekerjaan;

    public Anggota() {
    }

    public Anggota(String NoAnggota, String Nama, String Alamat, String Pekerjaan) {
        this.NoAnggota = NoAnggota;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Pekerjaan = Pekerjaan;
    }

    /**
     * @return the NoAnggota
     */
    public String getNoAnggota() {
        return NoAnggota;
    }

    /**
     * @param NoAnggota the NoAnggota to set
     */
    public void setNoAnggota(String NoAnggota) {
        this.NoAnggota = NoAnggota;
    }

    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the Alamat
     */
    public String getAlamat() {
        return Alamat;
    }

    /**
     * @param Alamat the Alamat to set
     */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    /**
     * @return the Pekerjaan
     */
    public String getPekerjaan() {
        return Pekerjaan;
    }

    /**
     * @param Pekerjaan the Pekerjaan to set
     */
    public void setPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }
    
    
    
}
