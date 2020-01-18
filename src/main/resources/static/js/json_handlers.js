//migacze
//
function prepareMigaczJSON(){
    var swieca = 0;
    var migaja = 0;
    var spalony = 0;
    var spalonaZarowka = 0;
    var napiecie = 0;
    var uszkodzony = 0;

    if(parseInt(document.querySelector('input[name="0"]:checked').value) == 1){
        swieca = parseInt(document.querySelector('input[name="0"]:checked').value);
        spalony = parseInt(document.querySelector('input[name="2"]:checked').value);
        spalonaZarowka = parseInt(document.querySelector('input[name="3"]:checked').value);
        uszkodzony  = parseInt(document.querySelector('input[name="4"]:checked').value);
        sendMigaczJSON(swieca, migaja, spalony, spalonaZarowka, napiecie, uszkodzony);
    }

    if(parseInt(document.querySelector('input[name="0"]:checked').value) == 2){
        swieca = parseInt(document.querySelector('input[name="0"]:checked').value);
        migaja = parseInt(document.querySelector('input[name="1"]:checked').value);
        spalonaZarowka = parseInt(document.querySelector('input[name="3"]:checked').value);
        napiecie  = parseInt(document.querySelector('input[name="5"]:checked').value);
        sendMigaczJSON(swieca, migaja, spalony, spalonaZarowka, napiecie, uszkodzony);
    }
}

function sendMigaczJSON(swieca, migaja, spalony, spalonaZarowka, napiecie, uszkodzony){

    const xmlhttp = new XMLHttpRequest();
    const url="/swiatla/migacze";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify({
        "migacze":{
            "czySwieca": swieca,
            "czyZaSzybkoMigaja": migaja,
            "czyDzialaLewaStrona":0,
            "czyDzialaPrawaStrona":0,
            "wiadomosc": ""
        },
        "bezpiecznik":{
            "czySpalony": spalony
        },
        "zarowki":{
            "czySpalone": spalonaZarowka,
            "napiecie": napiecie
        },
        "przewody":{
            "czyUszkodzone":uszkodzony
        }
    }));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//cofania
function prepareCofaniaJSON(){
    var swieca = parseInt(document.querySelector('input[name="0"]:checked').value);
    var spalony = parseInt(document.querySelector('input[name="1"]:checked').value);
    var spalonaZarowka = parseInt(document.querySelector('input[name="2"]:checked').value);
    var uszkodzony = parseInt(document.querySelector('input[name="3"]:checked').value);
    var czujnik = parseInt(document.querySelector('input[name="4"]:checked').value);

    sendCofaniaJSON(swieca, spalony, spalonaZarowka,  uszkodzony, czujnik);
}

function sendCofaniaJSON(swieca, spalony, spalonaZarowka,  uszkodzony, czujnik) {
        const xmlhttp = new XMLHttpRequest();
        const url="/swiatla/cofania";
        xmlhttp.open("POST", url, true);
        xmlhttp.setRequestHeader("Content-Type", "application/json");
        xmlhttp.send(JSON.stringify({
            "cofania":{
                "czySwieca": swieca,
                "czyCzujnikBieguDziala": czujnik,
                "wiadomosc": ""
            },
            "bezpiecznik":{
                "czySpalony": spalony
            },
            "zarowki":{
                "czySpalone": spalonaZarowka,
                "napiecie": 0
            },
            "przewody":{
                "czyUszkodzone":uszkodzony
            }
        }));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//stopu
function prepareStopuJSON(){
    var swieca = parseInt(document.querySelector('input[name="0"]:checked').value);
    var spalony = parseInt(document.querySelector('input[name="1"]:checked').value);
    var spalonaZarowka = parseInt(document.querySelector('input[name="2"]:checked').value);
    var uszkodzony = parseInt(document.querySelector('input[name="3"]:checked').value);
    var czujnik = parseInt(document.querySelector('input[name="4"]:checked').value);

    sendStopuJSON(swieca, spalony, spalonaZarowka,  uszkodzony, czujnik);
}

function sendStopuJSON(swieca, spalony, spalonaZarowka,  uszkodzony, czujnik) {
    const xmlhttp = new XMLHttpRequest();
    const url="/swiatla/stopu";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify({
        "stopu":{
            "czySwiecaStop": swieca,
            "czyDzialaCzujnikHamowania": czujnik,
            "wiadomosc": ""
        },
        "bezpiecznik":{
            "czySpalony": spalony
        },
        "zarowki":{
            "czySpalone": spalonaZarowka,
            "napiecie": 0
        },
        "przewody":{
            "czyUszkodzone":uszkodzony
        }
    }));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////
//KlockiHamulcowe
function prepareKlockiHamulcoweJSON(){
    var zuzyte = parseInt(document.querySelector('input[name="0"]:checked').value);
    var przegrzewaja = parseInt(document.querySelector('input[name="1"]:checked').value);

    sendKlockiHamulcoweJSON(zuzyte, przegrzewaja);
}

function sendKlockiHamulcoweJSON(zuzyte, przegrzewaja) {
    const xmlhttp = new XMLHttpRequest();
    const url="/hamulce/klockihamulcowe";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify(
        {
            "czyZuzyte": zuzyte,
            "czySiePrzegrzewaja": przegrzewaja
        }
    ));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////
//amortyzatory
function prepareAmortyzatoryJSON(){
    var drogaHamowania = parseInt(document.querySelector('input[name="0"]:checked').value);
    var wyciekOleju = parseInt(document.querySelector('input[name="1"]:checked').value);
    var odrywajace = parseInt(document.querySelector('input[name="2"]:checked').value);

    sendAmortyzatoryJSON(drogaHamowania, wyciekOleju, odrywajace);
}

function sendAmortyzatoryJSON(drogaHamowania, wyciekOleju, odrywajace) {
    const xmlhttp = new XMLHttpRequest();
    const url="/zawieszenie/amortyzatory";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify(
        {
            "wydluzonaDrogaHamowania": drogaHamowania,
            "wyciekOlejuZAmortyzatora": wyciekOleju,
            "odrywajaceSieKolaOdNawierzchni": odrywajace,
            "wiadomosc": ""
        }
    ));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////
//Geometria Zawieszenia
function prepareGeometriaZawieszeniaJSON(){
    var skret = parseInt(document.querySelector('input[name="0"]:checked').value);
    var zbieznosc = parseInt(document.querySelector('input[name="1"]:checked').value);
    var kat = parseInt(document.querySelector('input[name="2"]:checked').value);
    var pisk = parseInt(document.querySelector('input[name="3"]:checked').value);
    sendGeometriaZawieszeniaJSON(skret, zbieznosc, kat, pisk);
}

function sendGeometriaZawieszeniaJSON(skret, zbieznosc, kat, pisk) {
    const xmlhttp = new XMLHttpRequest();
    const url="/zawieszenie/geometriazawieszenia";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify(
        {
            "samoistneSkrecaniePojazdu": skret,
            "odpowiedniaZbieznoscKol": zbieznosc,
            "katPochyleniaKol": kat,
            "czyPiskOponPodczasSkrecania": pisk,
            "wiadomosc": ""
        }
    ));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//Stabilizatory
function prepareStabilizatoryJSON(){
    var stuka = parseInt(document.querySelector('input[name="0"]:checked').value);
    var zuzyta = parseInt(document.querySelector('input[name="1"]:checked').value);

    sendStabilizatoryJSON(stuka, zuzyta);
}

function sendStabilizatoryJSON(stuka, zuzyta) {
    const xmlhttp = new XMLHttpRequest();
    const url="/zawieszenie/stabilizatory";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify(
        {
            "czyStukanieZawieszeniaPodczasJazdyPoNierownosciach": stuka,
            "czyGumaStabilizatoraZuzyta": zuzyta,
            "wiadomosc": ""
        }
    ));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}
////////////////////////////////////////////////////////////////////////////////
//wahacze
function prepareWahaczeJSON(){
    var tuleje = parseInt(document.querySelector('input[name="0"]:checked').value);
    var pukanie = parseInt(document.querySelector('input[name="1"]:checked').value);
    var szarpie = parseInt(document.querySelector('input[name="2"]:checked').value);

    sendWahaczeJSON(tuleje, pukanie, szarpie);
}

function sendWahaczeJSON(tuleje, pukanie, szarpie) {
    const xmlhttp = new XMLHttpRequest();
    const url="/zawieszenie/wahacze";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify(
        {
            "czyStukaniePodczasjazdyPoNierownosciach": tuleje,
            "czySzarpaniePrzyRuszaniu": szarpie,
            "czyPukanieWKolach": pukanie,
            "wiadomosc": ""
        }
    ));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

//pompa hamulcowa

function prepareTarczeHamulcoweJSON(){
    var przegrzewaja = parseInt(document.querySelector('input[name="0"]:checked').value);

    sendTarczeHamulcoweJSON(przegrzewaja);
}

function sendTarczeHamulcoweJSON(przegrzewaja) {
    const xmlhttp = new XMLHttpRequest();
    const url="/hamulce/tarcze";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify(
      {
            "CzySiePrzegrzewaja": przegrzewaja,
            "CzySaUszkodzone": 0,
            "wiadomosc": ""
        }
    ));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

//tarcze klocki

function prepareTarczeKlockiJSON(){
    var uszkodzone = parseInt(document.querySelector('input[name="0"]:checked').value);
    var przegrzewaja = parseInt(document.querySelector('input[name="1"]:checked').value);

    sendTarczeKlockiJSON(uszkodzone, przegrzewaja);
}

function sendTarczeKlockiJSON(uszkodzone, przegrzewaja) {
    const xmlhttp = new XMLHttpRequest();
    const url="/hamulce/tarczeklocki";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify({
        "tarczeHamulcowe":{
            "CzySiePrzegrzewaja": 0,
            "CzySaUszkodzone": uszkodzone,
            "wiadomosc": ""
        },
        "klockiHamulcowe":{
            "czyZuzyte": 0,
            "czySiePrzegrzewaja": przegrzewaja,
            "wiadomosc": "",
        }
    }));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

//opony

function prepareOponyJSON(){
    var bieznikZuzyty = parseInt(document.querySelector('input[name="0"]:checked').value);
    var cisnieniePrawidlowe = parseInt(document.querySelector('input[name="1"]:checked').value);
    var przebite = parseInt(document.querySelector('input[name="2"]:checked').value);
    var traciSterownosc = parseInt(document.querySelector('input[name="3"]:checked').value);
    var drgania = parseInt(document.querySelector('input[name="4"]:checked').value);

    sendOponyJSON(bieznikZuzyty, cisnieniePrawidlowe, przebite, traciSterownosc, drgania);
}

function sendOponyJSON(bieznikZuzyty, cisnieniePrawidlowe, przebite, traciSterownosc, drgania) {
    const xmlhttp = new XMLHttpRequest();
    const url="/opony";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify({
        "czyBieznikZuzyty": bieznikZuzyty,
        "czyCisnieniePrawidlowe": cisnieniePrawidlowe,
        "czyPrzebite": przebite,
        "czySamochodTraciSterownosc:": traciSterownosc,
        "czyDrganiaPodczasJazdy": drgania,
        "wiadomosc": ""
    }
    ));
    console.log("czyBieznikZuzyty bieznikZuzyty");
    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

//skrzynia biegów automatyczna

function prepareAutomatycznaJSON(){
    var rozlaczanieNapedu = parseInt(document.querySelector('input[name="0"]:checked').value);
    var brakBieguWstecznego = parseInt(document.querySelector('input[name="1"]:checked').value);
    var brakWysokich = parseInt(document.querySelector('input[name="2"]:checked').value);

    sendAutomatycznaJSON(rozlaczanieNapedu, brakBieguWstecznego, brakWysokich);
}

function sendAutomatycznaJSON(rozlaczanieNapedu, brakBieguWstecznego, brakWysokich) {
    const xmlhttp = new XMLHttpRequest();
    const url="/skrzynia/automatyczna";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify({

            "wiadomosc": "",
            "czyRozlaczanieNapedu": rozlaczanieNapedu,
            "czyBrakBieguWstecznego": brakBieguWstecznego,
            "czyBrakWysokichBiegow": brakWysokich

    }));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

//układ kierowniczy

function prepareUkladKierowniczyJSON(){
    var szarpanie = parseInt(document.querySelector('input[name="0"]:checked').value);
    var luz = parseInt(document.querySelector('input[name="1"]:checked').value);
    var drganie = parseInt(document.querySelector('input[name="2"]:checked').value);
    var wspomaganie = parseInt(document.querySelector('input[name="3"]:checked').value);
    var wspomaganiev2 = parseInt(document.querySelector('input[name="4"]:checked').value);
    var wycie = parseInt(document.querySelector('input[name="5"]:checked').value);
    var utrudnione = parseInt(document.querySelector('input[name="6"]:checked').value);
    var gwizdy = parseInt(document.querySelector('input[name="7"]:checked').value);

    sendUkladKierowniczyJSON(szarpanie, luz, drganie, wspomaganie, wspomaganiev2, wycie, utrudnione, gwizdy);
}

function sendUkladKierowniczyJSON(szarpanie, luz, drganie, wspomaganie, wspomaganiev2, wycie, utrudnione, gwizdy) {
    const xmlhttp = new XMLHttpRequest();
    const url="/ukladkierowniczy";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify({

            "czySzarpaniePodczasSkrecania": szarpanie,
            "czyLuzWKolachPodczasJazdy": luz,
            "czyDrganieKierownicyPodczasPostoju": drganie,
            "czyWspomaganieDziala": wspomaganie,
            "wspomaganieRazDzialaRazNie": wspomaganiev2,
            "wiadomosc": "",
            "wyciePompyWTrakcieJazdy": wycie,
            "czyUtrudnioneSkrecanie": utrudnione,
            "czyGwizdyPompyWTrakcieJazdy": gwizdy,

    }));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

//układ wydech - katalizator

function prepareKatalizatorJSON(){
    var grzechotanie = parseInt(document.querySelector('input[name="0"]:checked').value);
    var problemUruchomienie = parseInt(document.querySelector('input[name="1"]:checked').value);
    var przyduszanie = parseInt(document.querySelector('input[name="2"]:checked').value);

    sendKatalizatorJSON(grzechotanie, problemUruchomienie, przyduszanie);
}

function sendKatalizatorJSON(grzechotanie, problemUruchomienie, przyduszanie) {
    const xmlhttp = new XMLHttpRequest();
    const url="/wydech/katalizator";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify({

            "wiadomosc": "",
            "czyGrzechotaniePodczasPracy": grzechotanie,
            "czyProblemyZUruchomieniemSilnika": problemUruchomienie,
            "czyPrzyduszanieSilnika": przyduszanie

    }));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

//układ wydech - kolektor

function prepareKolektorJSON(){
    var halas = parseInt(document.querySelector('input[name="0"]:checked').value);

    sendKolektorJSON(halas);
}

function sendKolektorJSON(halas) {
    const xmlhttp = new XMLHttpRequest();
    const url="/wydech/kolektor";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify({

            "wiadomosc": "",
            "czyHalasPodczasPracy": halas

    }));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

//układ wydech - sonda

function prepareSondaLambdaJSON(){
    var spadekMocy = parseInt(document.querySelector('input[name="0"]:checked').value);
    var wzrostZuzycia = parseInt(document.querySelector('input[name="1"]:checked').value);

    sendSondaLambdaJSON(spadekMocy, wzrostZuzycia);
}

function sendSondaLambdaJSON(spadekMocy, wzrostZuzycia) {
    const xmlhttp = new XMLHttpRequest();
    const url="/wydech/sondalambda";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify({

            "wiadomosc": "",
            "czySpadekMocySilnika": spadekMocy,
            "czyWzrostZuzyciaPaliwa": wzrostZuzycia,

    }));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

//układ wydech - wydech

function prepareWydechJSON(){
    var bialy = parseInt(document.querySelector('input[name="0"]:checked').value);
    var niebieski = parseInt(document.querySelector('input[name="1"]:checked').value);
    var czarny = parseInt(document.querySelector('input[name="2"]:checked').value);

    sendWydechJSON(bialy, niebieski, czarny);
}

function sendWydechJSON(bialy, niebieski, czarny) {
    const xmlhttp = new XMLHttpRequest();
    const url="/wydech/wydech";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify({
            "wiadomosc": "",
            "czyDuzoBialegoDymu": bialy,
            "czyKolorDymuNiebieski": niebieski,
            "czyKolorDymuCzarny": czarny
    }));

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.status == 200){
            var object = (xmlhttp.responseText);
            document.getElementById('containerDiv').style.display = "none";
            if(object.toString().length < 4){
                //nie pokazuj nic
            }else {
                document.getElementById("containerDiv").innerHTML = object.toString();
                document.getElementById('containerDiv').style.display = "block";

                //hide after 3s
                setTimeout(function () {document.getElementById('containerDiv').style.display='none'}, 3000); return false
            }
        }else{
            console.log("nie dziala");
        }
    }
}

