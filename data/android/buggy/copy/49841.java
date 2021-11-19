private void showCastFragment() {
    tech.salroid.filmy.fragment.CastFragment castFragment = tech.salroid.filmy.fragment.CastFragment.newInstance(movie_id_final, movie_title);
    getSupportFragmentManager().beginTransaction().replace(R.id.cast_container, castFragment).commitAllowingStateLoss();
}