private void pushSpecies(java.lang.String speciesId, java.lang.String name, @android.support.annotation.Nullable
java.lang.String subname, int level) {
    subname = null;
    fragmentController.pushFragment(name, null, com.github.charmasaur.alpsinsects.ui.fragments.SpeciesItemDetailFragment.newInstance(speciesId), level);
}