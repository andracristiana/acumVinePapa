package ro.esolutions.acumVinePapa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ConectorExtern {

    @GetMapping("/churches")
    public String getAllChurches(){
        List<Biserica> biserici = new ArrayList<>();

        Biserica sfIosif = new Biserica();
        Biserica catedralaMN = new Biserica();
        Biserica sfIon = new Biserica();
        Biserica bisericaMea = new Biserica();
        Biserica domnitaBalasa = new Biserica();

        biserici.add(sfIosif);
        biserici.add(catedralaMN);
        biserici.add(sfIon);
        biserici.add(bisericaMea);
        biserici.add(domnitaBalasa);


        sfIosif.nume = "Biserica Sfantul Iosif";
        sfIosif.luna = "may";
        sfIosif.tipReligie = "ortodoxa";



        catedralaMN.nume = "Catedrala Mantuirii Neamului";
        catedralaMN.luna = "july";
        catedralaMN.tipReligie = "ortodoxa";



        catedralaMN.nume = "Biserica Sfantul Ion";
        catedralaMN.luna = "september";
        catedralaMN.tipReligie = "catolica";



        bisericaMea.nume = "Biserica Din coltul strazii";
        bisericaMea.luna = "november";
        bisericaMea.tipReligie = "catolica";



        domnitaBalasa.nume = "Biserica Domnita Balasa";
        domnitaBalasa.luna = "january";
        domnitaBalasa.tipReligie = "monoteista";

        return "Bisericile mele sunt: " + sfIosif.nume;

    }
}
