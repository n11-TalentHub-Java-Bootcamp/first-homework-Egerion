package dto;

import java.util.Date;

public class KullaniciYorumDto {

    private Long kullaniciId;
    private String kullaniciAdi;
    private String urunAdi;
    private Date yorumTarihi;

    public KullaniciYorumDto(Long kullaniciId, String kullaniciAdi, String urunAdi, Date yorumTarihi) {
        this.kullaniciId = kullaniciId;
        this.kullaniciAdi = kullaniciAdi;
        this.urunAdi = urunAdi;
        this.yorumTarihi = yorumTarihi;
    }

    public Long getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Long kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    @Override
    public String toString() {
        return "KullaniciYorumDto{" +
                "kullaniciId=" + kullaniciId +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", urunAdi='" + urunAdi + '\'' +
                ", yorumTarihi=" + yorumTarihi +
                '}';
    }
}
