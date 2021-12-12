package uygulamalar;

import entity.Kategori;
import entity.Urun;
import entityservice.KategoriEntityService;
import entityservice.UrunEntityService;

import java.util.List;

public class FindAllApp {

    public static void main(String[] args) {

        //find all ürün
        UrunEntityService service = new UrunEntityService();
        List<Urun> urunList = service.findAll();
        for (Urun urun : urunList) {
            System.out.println(urun);
        }

        //find all kategori
        KategoriEntityService serviceKategori = new KategoriEntityService();
        List<Kategori> kategoriList = serviceKategori.findAll();
        for (Kategori kategori : kategoriList) {
            System.out.println(kategori);
        }
    }
}
