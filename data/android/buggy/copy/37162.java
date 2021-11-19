public void onVerificarRed() {
    if ((verificarRed()) == true) {
        new com.rlmonsalve.pokemonmovil.MapsActivity.getData().execute();
    }
}