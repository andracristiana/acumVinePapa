package ro.esolutions.acumVinePapa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConectorExtern {

    @GetMapping("/churches")
    public String getAllChurches(){
        Biserica sfIosif = new Biserica();

        sfIosif.nume = "Biserica Sfantul Iosif";
        sfIosif.luna = "mai";
        sfIosif.tipReligie = "ortodoxa";

        return "Bisericile mele sunt: " + sfIosif.nume;

    }
}
