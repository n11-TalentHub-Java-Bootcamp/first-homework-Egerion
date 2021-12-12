package odevUygulamalar;

import dto.UrunYorumToplamDto;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class CountYorumsApp_soru3 {

    public static void main(String[] args) {

        //3. Soru
        UrunYorumEntityService service = new UrunYorumEntityService();
        List<UrunYorumToplamDto> toplamUrunYorum = service.countAllYorumOnUrunler();

        for (UrunYorumToplamDto urunYorum : toplamUrunYorum) {
            System.out.println(urunYorum);
        }

    }
}
