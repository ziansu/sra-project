@java.lang.Override
public void attachToBaseObjectIfNeeded(int i, WT value) {
    if ((changeMonitor) != null)
        attachToBaseObject(i, value, false);
    
}