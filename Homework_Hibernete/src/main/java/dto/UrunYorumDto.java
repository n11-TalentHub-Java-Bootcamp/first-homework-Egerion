package dto;

import java.math.BigDecimal;
import java.util.Date;

public class UrunYorumDto {
    private String urunAdi;
    private String kategoriAdi;
    private BigDecimal fiyat;
    private String kullaniciAdi;
    private String kullaniciSoyAdi;
    private String email;
    private String telefon;
    private String yorum;
    private Date yorumTarihi;
    

    public String getYorum() {
        return yorum;
    }

    public UrunYorumDto(String urunAdi, String kategoriAdi, BigDecimal fiyat, String kullaniciAdi, String kullaniciSoyAdi, String email, String telefon, String yorum, Date yorumTarihi) {
        this.urunAdi = urunAdi;
        this.kategoriAdi = kategoriAdi;
        this.fiyat = fiyat;
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciSoyAdi = kullaniciSoyAdi;
        this.email = email;
        this.telefon = telefon;
        this.yorum = yorum;
        this.yorumTarihi = yorumTarihi;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public UrunYorumDto() {
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    public BigDecimal getFiat() {
        return fiyat;
    }

    public void setFiat(BigDecimal fiat) {
        this.fiyat = fiat;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
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

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }
}
