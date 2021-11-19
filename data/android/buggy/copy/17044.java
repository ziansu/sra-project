@java.lang.Override
public void onHomePressed(android.support.v4.app.Fragment fragment) {
    if (fragment instanceof valjevac.kresimir.homework3.fragments.AddPokemonFragment) {
        removeFragmentFromStack(valjevac.kresimir.homework3.activities.PokemonListActivity.ADD_POKEMON_FRAGMENT_TAG);
    }
}