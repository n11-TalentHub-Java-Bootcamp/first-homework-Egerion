package odevUygulamalar;

import dto.UrunYorumDto;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class DtoApp {

    public static void main(String[] args) {

        UrunYorumEntityService service = new UrunYorumEntityService();
        List<UrunYorumDto> urunYorumList = service.findUrunYorumDtoByUrunId(2L);

        for (UrunYorumDto urunYorumDto : urunYorumList) {
            System.out.println(urunYorumDto.getYorum());
        }
    }
}
