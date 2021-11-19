public void onVerificarRed() {
    if (verificarRed()) {
        new com.rlmonsalve.pokemonmovil.MapsActivity.getData().execute();
    }
}