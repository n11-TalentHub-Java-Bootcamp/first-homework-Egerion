package odevUygulamalar;

import entity.Urun;
import entity.UrunYorum;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class FindAllApp {

    public static void main(String[] args) {

        UrunYorumEntityService service = new UrunYorumEntityService();
        //List<UrunYorum> urunToplamYorum = service.findAllYorumsOnUrun();
        //for (UrunYorum yorum : urunToplamYorum) {
        //    System.out.println(yorum);
       // }

        List<UrunYorum> urunYorumFindAll = service.findAllYorumsOnUrun();
        for (UrunYorum all : urunYorumFindAll) {
            System.out.println(all);
        }
    }
}
