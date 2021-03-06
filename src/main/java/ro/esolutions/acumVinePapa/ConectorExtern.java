package ro.esolutions.acumVinePapa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ConectorExtern {

    @GetMapping("/churches/{month}")
    public String getAllChurches(@PathVariable String month){

        String raspuns = "The pope will be in the following churches: ";
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
        sfIosif.luna = "May";
        sfIosif.tipReligie = "ortodoxa";



        catedralaMN.nume = "Catedrala Mantuirii Neamului";
        catedralaMN.luna = "July";
        catedralaMN.tipReligie = "ortodoxa";



        sfIon.nume = "Biserica Sfantul Ion";
        sfIon.luna = "September";
        sfIon.tipReligie = "catolica";



        bisericaMea.nume = "Biserica Din coltul strazii";
        bisericaMea.luna = "November";
        bisericaMea.tipReligie = "catolica";



        domnitaBalasa.nume = "Biserica Domnita Balasa";
        domnitaBalasa.luna = "January";
        domnitaBalasa.tipReligie = "monoteista";


        for(int i = 0; i< biserici.size();i++){
            if(biserici.get(i).luna.equals(month)){
                raspuns += biserici.get(i).nume + ", ";
            }
        }

        return raspuns;

    }
}
