import dto.UrunDetayDto;
import dto.UrunYorumDto;
import entity.Kategori;
import entity.Kullanici;
import entity.UrunYorum;
import entityservice.KategoriEntityService;
import entityservice.KullaniciEntityService;
import entityservice.UrunEntityService;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        KategoriEntityService service = new KategoriEntityService();
        List<Kategori> kategoriList = service.findAll();

        for (Kategori kategori : kategoriList) {
            System.out.println(kategori.getAdi());
        }


        //kullanıcı e.s findall
        KullaniciEntityService service1 = new KullaniciEntityService();
        List<Kullanici> kullaniciList = service1.findAll();

        for(Kullanici kullanici: kullaniciList){
           // System.out.println(kullanici.getEmail());
        }
    }
}
