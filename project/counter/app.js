// se initial cont=0
 let curValue=0
const mainTitle=document.querySelector("#value")
const btnDecrement=document.querySelector("#btn-decrease")
const btnReset=document.querySelector("#btn-reset")
const btnIncrement=document.querySelector("#btn-increase")
btnIncrement.addEventListener("click",()=>{
    curValue++;
    mainTitle.textContent=curValue;
})
btnDecrement.addEventListener("click",()=>{
    curValue--;
    mainTitle.textContent=curValue;
})
btnReset.addEventListener("click",()=>{
    curValue=0;
    mainTitle.textContent=curValue;
})



  