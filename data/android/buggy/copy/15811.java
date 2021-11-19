public static void Init() {
    try {
        util.TimerTasks.MyTimer.addAllTask();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}