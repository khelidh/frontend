$(document).ready(function (e) {

    $('.carte img').click(function (e) {
        if ($(this).hasClass('selectionCarte')) {
            $(this).removeClass('selectionCarte');
        } else {
            $(this).addClass('selectionCarte');
        }
    });
});