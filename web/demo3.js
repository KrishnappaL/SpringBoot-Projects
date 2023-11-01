function create()
{
content=document.getElementById("input_text").value
element=document.createElement("p");
our_data=document.createTextNode(content);
element.appendChild(our_data);
mydiv=document.getElementById("mydiv");
mydiv.appendChild(element);
}
