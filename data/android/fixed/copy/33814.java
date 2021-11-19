@java.lang.Override
public void onTriggerEnabled(de.iweinzierl.easyprofiles.persistence.Trigger trigger) {
    trigger.setEnabled(true);
    trigger.save();
}