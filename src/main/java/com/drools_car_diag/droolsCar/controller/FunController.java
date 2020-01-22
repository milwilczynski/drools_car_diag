package com.drools_car_diag.droolsCar.controller;

import com.drools_car_diag.droolsCar.config.DroolConfig;
import com.drools_car_diag.droolsCar.entities.hamulce.KlockiHamulcowe;
import com.drools_car_diag.droolsCar.entities.hamulce.PompaHamulcowa;
import com.drools_car_diag.droolsCar.entities.hamulce.TarczeHamulcowe;
import com.drools_car_diag.droolsCar.entities.hamulce.TloczkiHamulcowe;
import com.drools_car_diag.droolsCar.entities.opony.Opony;
import com.drools_car_diag.droolsCar.entities.silnik.Cewka;
import com.drools_car_diag.droolsCar.entities.silnik.Przepustnica;
import com.drools_car_diag.droolsCar.entities.silnik.Turbosprezarka;
import com.drools_car_diag.droolsCar.entities.silnik.czujniki.CzujnikMasyPowietrza;
import com.drools_car_diag.droolsCar.entities.silnik.czujniki.CzujnikPolozeniaWaluKorbowego;
import com.drools_car_diag.droolsCar.entities.skrzyniaBiegow.Automatyczna;
import com.drools_car_diag.droolsCar.entities.skrzyniaBiegow.Manualna;
import com.drools_car_diag.droolsCar.entities.swiatla.cofania.CofaniaSprawdz;
import com.drools_car_diag.droolsCar.entities.swiatla.migacze.MigaczeSprawdz;
import com.drools_car_diag.droolsCar.entities.swiatla.oswietlajace.OswietlajaceSprawdz;
import com.drools_car_diag.droolsCar.entities.swiatla.stopu.StopuSprawdz;
import com.drools_car_diag.droolsCar.entities.ukladKierowniczy.UkladKierowniczy;
import com.drools_car_diag.droolsCar.entities.wydech.Katalizator;
import com.drools_car_diag.droolsCar.entities.wydech.Kolektor;
import com.drools_car_diag.droolsCar.entities.wydech.SondaLambda;
import com.drools_car_diag.droolsCar.entities.wydech.Wydech;
import com.drools_car_diag.droolsCar.entities.zawieszenie.Amortyzatory;
import com.drools_car_diag.droolsCar.entities.zawieszenie.GeometriaZawieszenia;
import com.drools_car_diag.droolsCar.entities.zawieszenie.Stabilizatory;
import com.drools_car_diag.droolsCar.entities.zawieszenie.Wahacze;
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
    public String checkStopu(@RequestBody StopuSprawdz stopuSprawdz) throws IOException {
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
    public String checkCofania(@RequestBody CofaniaSprawdz cofaniaSprawdz) throws IOException {
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

    @RequestMapping(value = "/swiatla/oswietlajace", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkOswietlajace(@RequestBody OswietlajaceSprawdz oswietlajaceSprawdz) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(oswietlajaceSprawdz.getOswietlajace());
        session.insert(oswietlajaceSprawdz.getBezpiecznik());
        session.insert(oswietlajaceSprawdz.getZarowki());
        session.insert(oswietlajaceSprawdz.getPrzewody());
        session.fireAllRules();
        session.destroy();
        return oswietlajaceSprawdz.getOswietlajace().getWiadomosc();
    }

    @RequestMapping(value = "/hamulce/tarczehamulcowe", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkTarczeHamulcowe(@RequestBody TarczeHamulcowe tarczeHamulcowe) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(tarczeHamulcowe);
        session.fireAllRules();
        session.destroy();
        return tarczeHamulcowe.getWiadomosc();
    }

    @RequestMapping(value = "/hamulce/klockihamulcowe", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkKlockiHamulcowe(@RequestBody KlockiHamulcowe klockiHamulcowe) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(klockiHamulcowe);
        session.fireAllRules();
        session.destroy();
        return klockiHamulcowe.getWiadomosc();
    }

    @RequestMapping(value = "/hamulce/pompahamulcowa", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkPompaHamulcowa(@RequestBody PompaHamulcowa pompaHamulcowa) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(pompaHamulcowa);
        session.fireAllRules();
        session.destroy();
        return pompaHamulcowa.getWiadomosc();
    }


    @RequestMapping(value = "/hamulce/tloczkihamulcowe", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkTloczkiHamulcowe(@RequestBody TloczkiHamulcowe tloczkiHamulcowe) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(tloczkiHamulcowe);
        session.fireAllRules();
        session.destroy();
        return tloczkiHamulcowe.getWiadomosc();
    }

    @RequestMapping(value = "/opony", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkOpony(@RequestBody Opony opony) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(opony);
        session.fireAllRules();
        session.destroy();
        return opony.getWiadomosc();
    }

    @RequestMapping(value = "/skrzynia/automatyczna", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkSkrzyniaAutomat(@RequestBody Automatyczna automatyczna) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(automatyczna);
        session.fireAllRules();
        session.destroy();
        return automatyczna.getWiadomosc();
    }
    @RequestMapping(value = "/skrzynia/manualna", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkSkrzyniaManualna(@RequestBody Manualna manualna) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(manualna);
        session.fireAllRules();
        session.destroy();
        return manualna.getWiadomosc();
    }

    @RequestMapping(value = "/ukladkierowniczy", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkUkladKierowniczy(@RequestBody UkladKierowniczy ukladKierowniczy) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(ukladKierowniczy);
        session.fireAllRules();
        session.destroy();
        return ukladKierowniczy.getWiadomosc();
    }

    @RequestMapping(value = "/wydech/katalizator", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkKatalizator(@RequestBody Katalizator katalizator) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(katalizator);
        session.fireAllRules();
        session.destroy();
        return katalizator.getWiadomosc();
    }

    @RequestMapping(value = "/wydech/kolektor", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkKolektor(@RequestBody Kolektor kolektor) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(kolektor);
        session.fireAllRules();
        session.destroy();
        return kolektor.getWiadomosc();
    }

    @RequestMapping(value = "/wydech/sondalambda", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkSondaLambda(@RequestBody SondaLambda sondaLambda) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(sondaLambda);
        session.fireAllRules();
        session.destroy();
        return sondaLambda.getWiadomosc();
    }

    @RequestMapping(value = "/wydech/wydech", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkWydech(@RequestBody Wydech wydech) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(wydech);
        session.fireAllRules();
        session.destroy();
        return wydech.getWiadomosc();
    }

    @RequestMapping(value = "/zawieszenie/amortyzatory", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkAmortyzatory(@RequestBody Amortyzatory amortyzatory) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(amortyzatory);
        session.fireAllRules();
        session.destroy();
        return amortyzatory.getWiadomosc();
    }

    @RequestMapping(value = "/zawieszenie/geometriazawieszenia", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkGeometriaZawieszenia(@RequestBody GeometriaZawieszenia geometriaZawieszenia) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(geometriaZawieszenia);
        session.fireAllRules();
        session.destroy();
        return geometriaZawieszenia.getWiadomosc();
    }

    @RequestMapping(value = "/zawieszenie/stabilizatory", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkStabilizatory(@RequestBody Stabilizatory stabilizatory) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(stabilizatory);
        session.fireAllRules();
        session.destroy();
        return stabilizatory.getWiadomosc();
    }

    @RequestMapping(value = "/zawieszenie/wahacze", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkWahacze(@RequestBody Wahacze wahacze) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(wahacze);
        session.fireAllRules();
        session.destroy();
        return wahacze.getWiadomosc();
    }

    @RequestMapping(value = "/silnik/cewka", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkCewka(@RequestBody Cewka cewka) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(cewka);
        session.fireAllRules();
        session.destroy();
        return cewka.getWiadomosc();
    }

    @RequestMapping(value = "/silnik/przepustnica", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkPrzepustnica(@RequestBody Przepustnica przepustnica) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(przepustnica);
        session.fireAllRules();
        session.destroy();
        return przepustnica.getWiadomosc();
    }
    @RequestMapping(value = "/silnik/turbosprezarka", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkTurbosprezarka(@RequestBody Turbosprezarka turbosprezarka) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(turbosprezarka);
        session.fireAllRules();
        session.destroy();
        return turbosprezarka.getWiadomosc();
    }

    @RequestMapping(value = "/silnik/czujniki/masy", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkCzujnikMasy(@RequestBody CzujnikMasyPowietrza czujnikMasyPowietrza) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(czujnikMasyPowietrza);
        session.fireAllRules();
        session.destroy();
        return czujnikMasyPowietrza.getWiadomosc();
    }
    @RequestMapping(value = "/silnik/czujniki/polozenia", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String checkPolozenia(@RequestBody CzujnikPolozeniaWaluKorbowego czujnikPolozeniaWaluKorbowego) throws IOException {
        KieSession session;
        DroolConfig dg = new DroolConfig();
        session = dg.getKieSession();;
        session.insert(czujnikPolozeniaWaluKorbowego);
        session.fireAllRules();
        session.destroy();
        return czujnikPolozeniaWaluKorbowego.getWiadomosc();
    }






}
