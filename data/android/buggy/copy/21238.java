@java.lang.Override
public void setTopicResultsHaveChanged() {
    if (activityStarted)
        resultColour = android.graphics.Color.MAGENTA;
    
    if ((activityStarted) == false)
        textView.setBackgroundColor(resultColour);
    
}