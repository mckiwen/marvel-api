window.onload = inicio;

function inicio() {
    document.getElementById("id").addEventListener('change', redireccion, false);
}

function redireccion() {
    var selector = document.getElementById("id").value;
    console.log(selector);


    // Redirige a la URL correspondiente al elemento seleccionado
    window.location.href = selector;
}