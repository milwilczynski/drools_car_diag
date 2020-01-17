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
