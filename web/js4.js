function changecolor()
{
date=new Date();
hour=date.getHours();
min=date.getMinutes();
sec=date.getSeconds()
fulldate=date.toLocaleTimeString();
x=document.getElementById("pl");
x.innerHTML=fulldate;
if(sec%2==0){
x.style.color="red";
}
else
{
x.style.color="blue";
}
}
function start(){
clear=setInterval(changecolor,10);
}
function stop(){
clearInterval(clear);
}

