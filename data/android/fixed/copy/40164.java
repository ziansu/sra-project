@java.lang.Override
public void onChanged(dev.blunch.blunch.activity.EventType type) {
    if (type.equals(EventType.Full)) {
        init("All");
    }
}