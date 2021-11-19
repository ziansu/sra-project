@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    localCalendar.remove(event);
    localCalendar.save(this);
    android.content.Intent mainActivityIntent = new android.content.Intent(getApplicationContext(), com.clairvoyance.crystal.MainActivity.class);
    startActivity(mainActivityIntent);
}