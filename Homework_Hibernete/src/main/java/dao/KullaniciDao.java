package dao;

import base.BaseDao;
import dto.KullaniciYorumDto;
import entity.Kullanici;
import org.hibernate.query.Query;
import org.intellij.lang.annotations.Language;

import java.util.Date;
import java.util.List;

public class KullaniciDao extends BaseDao {

    public List<Kullanici> findAll(){

        Query query = getCurrentSession().createQuery("select kullanici from Kullanici kullanici");
        return query.list();
    }

    public List<KullaniciYorumDto> findAllYorumByKullaniciId(Long kullaniciId){

        @Language("SQL")
                String sql = "select new dto.KullaniciYorumDto(kullanici.id, kullanici.adi, urun.adi, urunYorum.yorumTarihi) " +
                "from Kullanici kullanici " +
                "left join UrunYorum urunYorum on urunYorum.kullaniciId = kullanici.id " +
                "left join Urun urun on urun.id = urunYorum.urunId" +
                " where kullanici.id = :kullaniciId and urunYorum.yorum is not null";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("kullaniciId", kullaniciId);
        return query.list();
    }
}
