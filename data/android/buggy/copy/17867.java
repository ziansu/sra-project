@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.widget.Toast.makeText(getActivity(), "recive", Toast.LENGTH_LONG).show();
    updateWeather();
}