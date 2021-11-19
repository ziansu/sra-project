public static int getTimeLeftInSec() {
    int temp = controllers.Global.nextExecutionInSeconds(controllers.TimerController.getTimeLeftHour(), controllers.TimerController.getTimeLeftMinute());
    java.lang.System.out.println(temp);
    return temp;
}