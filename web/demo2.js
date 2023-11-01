function getCityName()
{
cityDivision=document.getElementById("cities")
citynamesinput=cityDivision.getElementsByTagName("input")
citynamesoutput=document.getElementsByTagName("p")
for(i=0;i<citynamesinput.length;i++){
citynamesoutput[i].innerHTML=citynamesinput[i].value
citynamesoutput[i].style.color="green"
citynamesoutput[i].style.background="yellow"
}
}

