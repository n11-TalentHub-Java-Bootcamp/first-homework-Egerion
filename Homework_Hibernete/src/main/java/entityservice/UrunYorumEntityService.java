package entityservice;

import dao.UrunYorumDao;
import dto.UrunYorumDto;
import dto.UrunYorumToplamDto;
import entity.UrunYorum;

import java.util.List;

public class UrunYorumEntityService {

    private UrunYorumDao urunYorumDao;

    public UrunYorumEntityService() {
        urunYorumDao = new UrunYorumDao();
    }

    public List<UrunYorum> findAll(){
        return urunYorumDao.findAll();
    }

    public List<UrunYorumDto> findUrunYorumDtoByUrunId(Long urunId){
        return urunYorumDao.findUrunYorumDtoByUrunId(urunId);
    }

    public List<UrunYorumToplamDto> countAllYorumOnUrunler(){
        return urunYorumDao.countAllYorumOnUrunler();
    }
}
