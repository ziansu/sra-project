@java.lang.Override
public void act(float delta) {
    if (started) {
        this.setVisible(true);
        started = false;
    }
    if (touchedDown) {
        com.TeamHEC.LocomotionCommotion.UI_Elements.WarningMessage.fireWarningWindow("", "Please Select a Train");
        com.TeamHEC.LocomotionCommotion.Goal.PlayerGoals.chooseTrain = true;
        touchedDown = false;
    }
}