@java.lang.Override
public void onNext(android.view.View view) {
    com.srmarlins.weather.network.model.WeatherInfo info = ((com.srmarlins.weather.network.model.WeatherInfo) (view.getTag(WeatherRecyclerAdapter.VIEW_KEY)));
    startActivity(com.srmarlins.weather.ui.activity.DetailActivity.newIntent(this, info));
}