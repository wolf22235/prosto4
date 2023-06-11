let Furniture = {
    furniture: "",
    produced: "",
    color: "",
    width: 0,
    height: 0,
}
function sendEditedFlower(){
    let xhrEdit = new XMLHttpRequest();
    Furniture.furniture=document.getElementById("furniture").value;
    Furniture.produced=document.getElementById("produced").value;
    Furniture.genre=document.getElementById("color").value;
    Furniture.width=document.getElementById("width").value;
    Furniture.height=document.getElementById("height").value;
    let flowerJson = JSON.stringify(Furniture);
    console.log(Furniture);
    xhrEdit.open("POST", "saveChanges",true);
    xhrEdit.setRequestHeader('Content-Type', 'application/json');
    xhrEdit.send(flowerJson);
    location.href="read"
}