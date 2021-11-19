@java.lang.Override
public org.moqui.entity.EntityValue previous() {
    (internalIndex)--;
    if ((internalIndex) < 0)
        return null;
    
    return currentEntityValue();
}