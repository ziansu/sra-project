public void execute() {
    cleanUp();
    com.vengeful.sloths.Models.TimeModel.TimeModel.getInstance().registerAlertable(this, 30);
}