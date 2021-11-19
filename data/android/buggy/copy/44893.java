@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onTrackerEvent(com.brandonhogan.liftscout.views.workout.TrackerEvent event) {
    graph.update();
}