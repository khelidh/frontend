$(document).ready(function (e) {
    $('boutonPasser').click(function (e) {
        $.get('passer-tour-servlet');
    });
});