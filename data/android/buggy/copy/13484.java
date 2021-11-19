@java.lang.Override
public int getCount() {
    android.content.SharedPreferences sharedPref = mContext.getSharedPreferences("Ride_id", Context.MODE_PRIVATE);
    int temp = sharedPref.getInt("ride_id", 1);
    return temp;
}