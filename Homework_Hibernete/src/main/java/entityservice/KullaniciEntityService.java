package entityservice;

import dao.KullaniciDao;
import dto.KullaniciYorumDto;
import entity.Kullanici;

import java.util.List;

public class KullaniciEntityService {

    private KullaniciDao kullaniciDao;

    public KullaniciEntityService() {
        kullaniciDao = new KullaniciDao();
    }

    public List<Kullanici> findAll(){
        return kullaniciDao.findAll();
    }

    public List<KullaniciYorumDto> findAllYorumByKullaniciId(Long kullaniciId){
        return kullaniciDao.findAllYorumByKullaniciId(kullaniciId);
    }
}