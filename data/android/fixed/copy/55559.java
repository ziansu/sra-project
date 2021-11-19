@java.lang.Override
public org.moqui.entity.EntityValue previous() {
    if ((internalIndex) < 0)
        return null;
    
    (internalIndex)--;
    if ((internalIndex) < 0)
        return null;
    
    return currentEntityValue();
}