@java.lang.Override
public void onForeground(long time) {
    this.onEventAdded(JsonValue.NULL, Trigger.LIFE_CYCLE_FOREGROUND, 1.0);
    onScheduleConditionsChanged();
}