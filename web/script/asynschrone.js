$(document).ready(function (e) {
    
    $('.boutonPasser').click(function(e) {
        $.get('passer-tour-servlet');
    });
    
    $('.boutonLancer').click(function(e) {
        $.get('lancer-sort-servlet');
    });
});