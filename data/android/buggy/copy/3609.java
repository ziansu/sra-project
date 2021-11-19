@java.lang.Override
public void onReceive(com.home.pete.aquarium.Context context, com.home.pete.aquarium.Intent intent) {
    int msg = intent.getIntExtra("ACTION", 0);
    android.util.Log.d(com.home.pete.aquarium.MainActivity.TAG, ("Got hello reponse of: " + msg));
}