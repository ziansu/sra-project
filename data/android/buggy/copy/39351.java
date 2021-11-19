@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.CheckBox checkBox = ((android.widget.CheckBox) (v));
    com.growthbeat.analytics.GrowthAnalytics.getInstance().setDevelopment(checkBox.isChecked());
}