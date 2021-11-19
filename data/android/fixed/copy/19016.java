@java.lang.Override
public boolean shouldSchedule() {
    if (this.completionAssistantIsActive)
        return false;
    
    return true;
}