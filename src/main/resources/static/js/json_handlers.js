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
    xmlhttp.send(JSON.stringify({
        "tarczeHamulcowe":{
            "CzySiePrzegrzewaja": przegrzewaja,
            "CzySaUszkodzone": 0,
            "wiadomosc": ""
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
        "opony":{
            "czyBieznikZuzyty": bieznikZuzyty,
            "czyCisnieniePrawidlowe": cisnieniePrawidlowe,
            "czyPrzebite": przebite,
            "czySamochodTraciSterownosc:" traciSterownosc,
            "czyDrganiaPodczasJazdy": drgania,
            "wiadomosc": ""
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

//skrzynia biegów automatyczna

function preparAutomatycznaJSON(){
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
        "automatyczna":{
            "wiadomosc": "",
            "czyRozlaczanieNapedu": rozlaczanieNapedu,
            "czyBrakBieguWstecznego": brakBieguWstecznego,
            "czyBrakWysokichBiegow:" brakWysokich,
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

//układ kierowniczy

function preparUkladKierowniczyJSON(){
    var szarpanie = parseInt(document.querySelector('input[name="0"]:checked').value);
    var luz = parseInt(document.querySelector('input[name="1"]:checked').value);
    var drganie = parseInt(document.querySelector('input[name="2"]:checked').value);
    var wspomaganie = parseInt(document.querySelector('input[name="2"]:checked').value);
    var wspomaganiev2 = parseInt(document.querySelector('input[name="2"]:checked').value);
    var wycie = parseInt(document.querySelector('input[name="2"]:checked').value);
    var utrudnione = parseInt(document.querySelector('input[name="2"]:checked').value);
    var gwizdy = parseInt(document.querySelector('input[name="2"]:checked').value);

    sendUkladKierowniczyJSON(szarpanie, luz, drganie, wspomaganiem, wspomaganiev2, wycie, utrudnione, gwizdy);
}

function sendUkladKierowniczyJSON(szarpanie, luz, drganie, wspomaganiem, wspomaganiev2, wycie, utrudnione, gwizdy) {
    const xmlhttp = new XMLHttpRequest();
    const url="/ukladkierowniczy";
    xmlhttp.open("POST", url, true);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify({
        "ukladKierowniczy":{
            "czySzarpaniePodczasSkrecania": szarpanie,
            "czyLuzWKolachPodczasJazdy": luz,
            "czyDrganieKierownicyPodczasPostoju": drganie,
            "czyWspomaganieDziala": wspomaganiem,
            "wspomaganieRazDzialaRazNie": wspomaganiev2,
            "wiadomosc": "",
            "wyciePompyWTrakcieJazdy": wycie,
            "czyUtrudnioneSkrecanie": utrudnione,
            "czyGwizdyPompyWTrakcieJazdy": gwizdy,
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