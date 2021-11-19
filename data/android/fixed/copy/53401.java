@java.lang.Override
public boolean active() {
    if (scripts.SUPER.isStoreroomDoorOpen()) {
        return true;
    }
    org.tribot.api.General.sleep(SUPER.SLEEP_TIME);
    return false;
}