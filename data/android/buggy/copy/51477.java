@java.lang.Override
public void onSuccess(com.arao.simpleweather.data.entity.City result) {
    results.add(result);
    java.util.Collections.sort(results);
    homeView.displayWeatherForCities(results);
}