@java.lang.Override
public void onClick(android.view.View v) {
    com.example.pravallika.multiplealarms.beans.SpecialDaysReminder currentSpecialDaysReminder = extractCurrentSplReminder();
    saveSplRemToDB(currentSpecialDaysReminder);
    setNotificationForReminder(currentSpecialDaysReminder);
    finish();
}