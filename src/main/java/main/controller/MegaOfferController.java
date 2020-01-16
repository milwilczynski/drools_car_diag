package main.controller;
import main.core.DroolConfig;
import main.entities.swiatla.cofania.CofaniaSprawdz;
import main.entities.swiatla.migacze.MigaczeSprawdz;
import main.entities.swiatla.stopu.StopuSprawdz;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
public class MegaOfferController {
    @RequestMapping(value = "/swiatla/migacze", method = RequestMethod.POST)
    @ResponseBody
    public String checkMigacze(@RequestBody MigaczeSprawdz migaczeSprawdz) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();
        session.insert(migaczeSprawdz.getMigacze());
        session.insert(migaczeSprawdz.getBezpiecznik());
        session.insert(migaczeSprawdz.getZarowki());
        session.insert(migaczeSprawdz.getPrzewody());
        session.fireAllRules();
        session.destroy();
        return migaczeSprawdz.getMigacze().getWiadomosc();
    }

    @PostMapping("/swiatla/stopu")
    public String chceckStopu(@RequestBody StopuSprawdz stopuSprawdz) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(stopuSprawdz.getStopu());
        session.insert(stopuSprawdz.getBezpiecznik());
        session.insert(stopuSprawdz.getZarowki());
        session.insert(stopuSprawdz.getPrzewody());
        session.fireAllRules();
        session.destroy();
        return stopuSprawdz.getStopu().getWiadomosc();
    }

    @PostMapping("/swiatla/cofania")
    public String chceckCofania(@RequestBody CofaniaSprawdz cofaniaSprawdz) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(cofaniaSprawdz.getCofania());
        session.insert(cofaniaSprawdz.getBezpiecznik());
        session.insert(cofaniaSprawdz.getZarowki());
        session.insert(cofaniaSprawdz.getPrzewody());
        session.fireAllRules();
        session.destroy();
        return cofaniaSprawdz.getCofania().getWiadomosc();
    }


}
