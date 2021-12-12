package odevUygulamalar;

import dto.KullaniciYorumDto;
import entityservice.KullaniciEntityService;

import java.util.List;

public class FindYorumByKullaniciIdApp_soru4 {

    public static void main(String[] args) {

        KullaniciEntityService service = new KullaniciEntityService();
        List<KullaniciYorumDto> kullaniciYorum =  service.findAllYorumByKullaniciId(1L);
        for (KullaniciYorumDto kullaniciYorumDto : kullaniciYorum) {
            System.out.println(kullaniciYorumDto);
        }

    }
}
