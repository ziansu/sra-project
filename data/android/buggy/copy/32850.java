@java.lang.Override
public void onAddPokemonClick() {
    loadFragment(valjevac.kresimir.homework3.fragments.AddPokemonFragment.newInstance(), valjevac.kresimir.homework3.activities.PokemonListActivity.ADD_POKEMON_FRAGMENT_TAG, null);
    android.util.Log.e("OPENING ADD POKEMON", "Add pokemon");
}