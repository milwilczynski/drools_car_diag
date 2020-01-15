package main.controller;
import main.entities.swiatla.*;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MegaOfferController {
    @Autowired
    private KieSession session;
    @RequestMapping(value = "/swiatla/migacze", method = RequestMethod.POST)
    @ResponseBody
    public String orderNow(@RequestBody MigaczeSprawdz migaczeSprawdz) {
        session.insert(migaczeSprawdz.getMigacze());
        session.insert(migaczeSprawdz.getBezpiecznik());
        session.insert(migaczeSprawdz.getZarowki());
        session.insert(migaczeSprawdz.getPrzewody());
        session.fireAllRules();
        return migaczeSprawdz.getMigacze().getWiadomosc();
    }

    @PostMapping("/swiatla/stopu")
    public String orderNow(@RequestBody StopuSprawdz stopuSprawdz) {
        System.out.println(stopuSprawdz.getStopu().getCzySwiecaStop());
        session.insert(stopuSprawdz.getStopu());
        session.insert(stopuSprawdz.getBezpiecznik());
        session.insert(stopuSprawdz.getZarowki());
        session.insert(stopuSprawdz.getPrzewody());
        session.fireAllRules();
        return stopuSprawdz.getStopu().getWiadomosc();
    }

}
