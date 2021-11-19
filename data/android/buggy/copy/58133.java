public void startSearching(com.pokegomapco.pokemongomapper.PokemonNetwork.PokemonListener listener) {
    mPokemonListener = listener;
    if (mLocationFinder.isReady()) {
        mPokemonThread = new com.pokegomapco.pokemongomapper.PokemonNetwork.PokemonThread();
        mPokemonThread.start();
    }
}