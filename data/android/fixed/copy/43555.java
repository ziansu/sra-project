public boolean evaluate() {
    if (triggerList.isEmpty())
        return false;
    
    for (se.hal.struct.Trigger trigger : triggerList) {
        if (!(trigger.evaluate()))
            return false;
        
    }
    return true;
}