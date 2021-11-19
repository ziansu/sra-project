public void toAlarm(android.view.View view) {
    android.content.Intent changeToFavorites = new android.content.Intent(view.getContext(), com.davidtoh.helloworld.Alarm.class);
    startActivityForResult(changeToFavorites, 0);
}