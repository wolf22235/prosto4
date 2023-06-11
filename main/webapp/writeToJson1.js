let Furniture = {
    furniture: "",
    produced: "",
    color: "",
    width: 0,
    height: 0
}
function getData(){
    Furniture.furniture = document.getElementById("furniture").value;
    Furniture.produced = document.getElementById("produced").value;
    Furniture.color = document.getElementById("color").value;
    Furniture.width = document.getElementById("width").value;
    Furniture.height = document.getElementById("height").value;
    let furnitureJson = JSON.stringify(Furniture);
    let xhr = new XMLHttpRequest();
    xhr.open("POST", "write",true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send(furnitureJson);
};