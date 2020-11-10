$('#login-button').click(function(){
  $('#login-button').fadeOut("slow",function(){
    $(".contenedor-form").fadeIn();
    TweenMax.from(".contenedor-form", .4, { scale: 0, ease:Sine.easeInOut});
    TweenMax.to(".contenedor-form", .4, { scale: 1, ease:Sine.easeInOut});
  });
});

$(".close-btn").click(function(){
  TweenMax.from(".contenedor-form", .4, { scale: 1, ease:Sine.easeInOut});
  TweenMax.to(".contenedor-form", .4, { left:"0px", scale: 0, ease:Sine.easeInOut});
  $(".contenedor-form, #forgotten-container").fadeOut(800, function(){
    $("#login-button").fadeIn(800);
  });
});

/* Forgotten Password */
$('#forgotten').click(function(){
  $(".contenedor-form").fadeOut(function(){
    $("#forgotten-container").fadeIn();
  });
});
 /* Registrar */
 $('.toggle').click(function(){
    $('.formulario').animate({
        height: "toggle",
        'padding-top': 'toggle',
        'padding-bottom': 'toggle',
        opacity: 'toggle'
    }, "slow");
});
 