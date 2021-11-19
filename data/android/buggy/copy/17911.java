public void removeRingtoneState(android.content.Context context) {
    if ((timeEvent) == null)
        timeEvent = new com.wordpress.gatarblog.dzwonnik.States.RingtoneState.TimeEvent(context);
    
    timeEvent.stop();
}