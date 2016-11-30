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
public class Pegawai {
    
    private String firtsname;
    private String lastname;
    private boolean married;
    private String fax;
    private String phone;
    private String email;
    private int departement;
    private String company;
    private String phonework;
    private String faxwork;
    private String lokasikantor;

    public Pegawai() {
    }

    public Pegawai(String firtsname, String lastname, boolean married, String fax, String phone, String email, int departement, String company, String phonework, String faxwork, String lokasikantor) {
        this.firtsname = firtsname;
        this.lastname = lastname;
        this.married = married;
        this.fax = fax;
        this.phone = phone;
        this.email = email;
        this.departement = departement;
        this.company = company;
        this.phonework = phonework;
        this.faxwork = faxwork;
        this.lokasikantor = lokasikantor;
    }

    public String getFirtsname() {
        return firtsname;
    }

    public void setFirtsname(String firtsname) {
        this.firtsname = firtsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDepartement() {
        return departement;
    }

    public void setDepartement(int departement) {
        this.departement = departement;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhonework() {
        return phonework;
    }

    public void setPhonework(String phonework) {
        this.phonework = phonework;
    }

    public String getFaxwork() {
        return faxwork;
    }

    public void setFaxwork(String faxwork) {
        this.faxwork = faxwork;
    }

    public String getLokasikantor() {
        return lokasikantor;
    }

    public void setLokasikantor(String lokasikantor) {
        this.lokasikantor = lokasikantor;
    }
    
    
}
