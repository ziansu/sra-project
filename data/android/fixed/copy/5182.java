@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.importantConditionsAdapter = createImportantConditionsAdapter(this.importantWeatherConditionsNames);
    setHasOptionsMenu(false);
}