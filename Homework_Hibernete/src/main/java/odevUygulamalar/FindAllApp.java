package odevUygulamalar;

import entity.Urun;
import entity.UrunYorum;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class FindAllApp {

    public static void main(String[] args) {

        //find all
        UrunYorumEntityService service = new UrunYorumEntityService();
        List<UrunYorum> urunYorum = service.findAll();
        for (UrunYorum all : urunYorum) {
            System.out.println(urunYorum);
        }
    }
}
