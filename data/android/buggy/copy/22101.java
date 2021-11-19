@java.lang.Override
public void onClick(android.view.View view) {
    if ((scheduleDisplayed) == ((schedules.size()) - 1))
        scheduleDisplayed = 0;
    else
        (scheduleDisplayed)++;
    
    updateSchedulesUI();
}