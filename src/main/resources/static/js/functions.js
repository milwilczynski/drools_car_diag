
function changeImageTo(whichPart) {
    var xhr= new XMLHttpRequest();
    xhr.open('GET', '/main/contain?part=' + whichPart, true);
    xhr.onreadystatechange= function() {
        if (this.readyState!==4) return;
        if (this.status!==200) return; // or whatever error handling you want
        document.getElementById('textContainer').innerHTML= this.responseText;
    };
    xhr.send()
};

function closePopUp(){
    document.getElementById("containerDiv").style.display = "none";
}
//migacze
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
//cofania
function checkIfCofania () {

}
