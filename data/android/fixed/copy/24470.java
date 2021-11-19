private void initializeActivity(android.os.Bundle savedInstanceState) {
    if (savedInstanceState == null) {
        this.cityId = getIntent().getIntExtra(ru.innopolis.innoweather.presentation.view.activity.MainActivity.INTENT_EXTRA_PARAM_CITY_ID, (-1));
        addFragment(R.id.fragmentContainer, new ru.innopolis.innoweather.presentation.view.fragment.CitiesListFragment());
    }else {
    }
}