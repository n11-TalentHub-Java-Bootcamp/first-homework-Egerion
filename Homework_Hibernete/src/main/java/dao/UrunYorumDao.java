package dao;

import base.BaseDao;
import dto.UrunYorumDto;
import entity.UrunYorum;
import org.hibernate.query.Query;
import org.intellij.lang.annotations.Language;

import java.util.List;

public class UrunYorumDao extends BaseDao {

    public List<UrunYorum> findAll(){

        Query query = getCurrentSession().createQuery("select urunYorum from UrunYorum urunYorum");
        return query.list();
    }

    public List<UrunYorumDto> findUrunYorumDtoByUrunId(Long urunId){

        @Language("SQL")
        String sql = "select " +
              "new dto.UrunYorumDto(urun.adi, kategori.adi, urun.fiyat, kullanici.adi, kullanici.soyadi, kullanici.email, kullanici.telefon, urunYorum.yorum, urunYorum.yorumTarihi) " +
                "from UrunYorum urunYorum "+
                "left join Urun urun on urun.id = urunYorum.urunId "+
                "left join Kategori kategori on kategori.id = urun.id " +
                "left join UrunYorum urunYorum on urunYorum.urunId = urun.id " +
                "left join Kullanici kullanici on kullanici.id = urunYorum.kullaniciId " +
                "where urunYorum.urunId = :urunId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("urunId", urunId);
        return query.list();
    }

    public List<UrunYorum> findAllYorumsOnUrun(){

        @Language("SQL")
        String sql = "select " +
                "urunYorum " +
                "from UrunYorum urunYorum " +
                "left join Urun urun on urunYorum.urunId = urun.id";
        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }
}
