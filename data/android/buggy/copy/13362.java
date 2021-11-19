@java.lang.Override
public void onForeground(long time) {
    com.urbanairship.automation.Automation.isForeground = true;
    this.onEventAdded(JsonValue.NULL, Trigger.LIFE_CYCLE_FOREGROUND, 1.0);
    onScheduleConditionsChanged();
}