@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d(com.example.alvinlam.drawer.activity.MainActivity.TAG, ("onClick: " + "1"));
    java.lang.Class destinationClass = com.example.alvinlam.drawer.activity.AddCardAddActivity.class;
    android.content.Intent intentToStartAddCardActivity = new android.content.Intent(this, destinationClass);
    startActivity(intentToStartAddCardActivity);
}