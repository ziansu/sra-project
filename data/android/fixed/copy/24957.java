@java.lang.Override
public void onCounterFinished(java.lang.String result) {
    if ((mCheckbox) != null)
        mCheckbox.setSummaryOn(result);
    
}