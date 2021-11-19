public void previousPage(android.view.View view) {
    if ((com.example.kelvin_pc.film.Model.System.System_Variables.PAGE_NUMBER) != 1)
        com.example.kelvin_pc.film.Model.System.System_Variables.PAGE_NUMBER = (com.example.kelvin_pc.film.Model.System.System_Variables.PAGE_NUMBER) - 1;
    
    generateFilmQuery();
}