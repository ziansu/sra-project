public int getCameWithCar() {
    android.content.SharedPreferences sharedPreferences = omer.parking.com.util.SharedPrefManager.mCtx.getSharedPreferences(omer.parking.com.util.SharedPrefManager.SHARED_PREF_NAME, Context.MODE_PRIVATE);
    return sharedPreferences.getInt(omer.parking.com.util.SharedPrefManager.TAG_CAME_WITH_CAR, 1);
}