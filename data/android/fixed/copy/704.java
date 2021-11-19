@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        booster.mingliu.boostertest.models.QuestionModelManager.getsInstance().setCurOption(finalPos);
    }
    org.greenrobot.eventbus.EventBus.getDefault().post(new booster.mingliu.boostertest.events.QuestionCheckedEvent());
}