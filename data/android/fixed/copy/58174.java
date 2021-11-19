@java.lang.Override
public void updateController() {
    super.updateController();
    com.darkmagician6.eventapi.EventManager.call(tick);
}