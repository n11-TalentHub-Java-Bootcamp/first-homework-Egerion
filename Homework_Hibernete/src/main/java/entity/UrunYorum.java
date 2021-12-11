package entity;

import javax.persistence.*;
import java.util.Date;

/*
 * id
 * yorum
 * yorum tarihi
 * urunid
 * kullaniciid
 */
@Entity
@Table(name="UrunYorum")
public class UrunYorum {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "YORUM", length = 500)
    private String yorum;
    @Column(name = "YORUM_TARIHI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date yorumTarihi;
    @Column(name = "URUN_ID", nullable = false)
    private Long urunId;
    @Column(name = "KULLANICI_ID", nullable = false)
    private int kullaniciId;

    public int getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
