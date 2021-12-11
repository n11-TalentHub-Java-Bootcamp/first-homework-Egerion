package entity;

import javax.persistence.*;

/*
 * id
 * adi
 * soyadi
 * email
 * telefon
 */
@Entity
@Table(name="Kullanici")
public class Kullanici {
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name="ADI",length = 50)
    private String adi;
    @Column(name="SOYADI",length = 50, columnDefinition="CHAR")
    private String soyadi;
    @Column(name="EMAIL",length = 50, columnDefinition="CHAR")
    private String email;
    @Column(name="TELEFON",length = 15, columnDefinition="CHAR")
    private String telefon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
