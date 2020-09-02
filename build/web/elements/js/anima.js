
"use strict";

const imgs = document.querySelectorAll(".img");
const hide = document.querySelector(".hide");

imgs.forEach((img)=>{
    img.addEventListener("click", ()=>{
        const cloneImg = img.cloneNode(false);
        if(hide.className === "hide"){
            hide.classList.add("visible");
            hide.append(cloneImg);
        }else{
            hide.classList.remove("visible");
            hide.removeChild(hide.children[0]);
        }
    });
});