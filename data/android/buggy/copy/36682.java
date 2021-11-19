public void run() {
    it.polito.mad_lab4.firebase_position.FirebaseGetRestaurantsPositions restaurantsPositions = new it.polito.mad_lab4.firebase_position.FirebaseGetRestaurantsPositions();
    restaurantsPositions.waitForResult();
    listaRistoranti = restaurantsPositions.getListaOfferte();
}