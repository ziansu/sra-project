@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        java.lang.String str = WeatherConditionsNames.Cloudiness.toString();
        this.importantConditionsAdapter = createImportantConditionsAdapter(this.importantWeatherConditionsNames);
    }
    setHasOptionsMenu(false);
}