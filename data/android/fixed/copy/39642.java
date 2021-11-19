@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((day) == 0)
        day = 1;
    
    mListener.setAlarm(day, hour, minute);
}