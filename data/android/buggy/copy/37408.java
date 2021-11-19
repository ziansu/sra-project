@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    checkLocationPermission();
    if ((android.os.Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        checkLocationPermission();
    }
}