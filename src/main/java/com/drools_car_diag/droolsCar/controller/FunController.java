package com.drools_car_diag.droolsCar.controller;

import com.drools_car_diag.droolsCar.config.DroolConfig;
import com.drools_car_diag.droolsCar.entities.swiatla.cofania.CofaniaSprawdz;
import com.drools_car_diag.droolsCar.entities.swiatla.migacze.MigaczeSprawdz;
import com.drools_car_diag.droolsCar.entities.swiatla.stopu.StopuSprawdz;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
public class FunController {
    @RequestMapping(value = "/swiatla/migacze", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
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

    @RequestMapping(value = "/swiatla/stopu", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
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

    @RequestMapping(value = "/swiatla/cofania", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
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
