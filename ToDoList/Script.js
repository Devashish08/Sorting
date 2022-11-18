const shape = document.querySelector("#my");
const time =  document.querySelector("span");
 
let startTime = new Date().getTime(); 
shape.addEventListener("click",e=>{
    hideShape();
})
 
const hideShape = ()=>{
    calculateTime();
    shape.style.display = "none";
    setTimeout(showShape,1000);
}
 
const showShape = ( )=>{
    changePostion();
    changeShape();
    changeSize();
    randomColor();
    startTime = new Date().getTime();
    shape.style.display = "block";
}
 
const changeShape = ()=>{
    const num = Math.random();// 0 to 1
    if(num > 0.49){
        shape.style.borderRadius = "50%";
    }
    else{
        shape.style.borderRadius = "0";
    }
}
 
const calculateTime = ()=>{
    const endTime = new Date().getTime();
    const reactionTime = endTime - startTime;
    time.innerText = reactionTime/1000;
}
 
const changePostion = ()=>{
    const top = Math.random() * 500;
    const left = Math.random() * 500;
 
    shape.style.top = `${top}px`;
    shape.style.left = `${left}px`;
}
 
const changeSize = ()=>{
 
    const width =50+ Math.random() * 100;
 
    shape.style.width = `${width}px`;
    shape.style.height = `${width}px`;
}
const randomColor = ()=>{
    const randomColor = Math.floor(Math.random()*16777215).toString(16);
    const color ="#"+randomColor;
 
    shape.style.backgroundColor = color;
}