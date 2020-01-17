function chceckIfMigacze() {
    document.getElementById("m3").style.display = "block";

    if(document.querySelector('input[name="0"]:checked').value == 0){
        document.getElementById("m3").style.display = "none";
    }
    if(document.querySelector('input[name="0"]:checked').value == 2){
        document.getElementById("m1").style.display = "block"
        document.getElementById("m5").style.display = "block";
    }
    else{
        document.getElementById("m1").style.display = "none";
        document.getElementById("m5").style.display = "none";
    }

    if(document.querySelector('input[name="0"]:checked').value == 1){
        document.getElementById("m2").style.display = "block";
        document.getElementById("m4").style.display = "block";
    }
    else{
        document.getElementById("m2").style.display = "none";
        document.getElementById("m4").style.display = "none";
    }

}

function closePopUp(){
    document.getElementById("containerDiv").style.display = "none";
}
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

function changeImageTo(whichPart) {
    document.getElementById('partImage').style.backgroundImage = "url('../parts/" + whichPart + ".jpg')";
    if(whichPart == "cofania" || whichPart == "stop"){
        document.getElementById('partImage').style.marginLeft = "40%";
    }
    else{
        document.getElementById('partImage').style.marginLeft = "25%";
    }
    var xhr= new XMLHttpRequest();
    xhr.open('GET', whichPart + '.html', true);
    xhr.onreadystatechange= function() {
        if (this.readyState!==4) return;
        if (this.status!==200) return; // or whatever error handling you want
        document.getElementById('textContainer').innerHTML= this.responseText;
    };
    xhr.send()
};
