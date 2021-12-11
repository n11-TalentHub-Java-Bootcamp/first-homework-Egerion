package uygulamalar;

import entity.Urun;
import entityservice.UrunEntityService;

public class FindByIdApp {

    public static void main(String[] args) {
        UrunEntityService service = new UrunEntityService();
        Urun urun = service.findById(2L);

        System.out.println(urun);
    }
}
