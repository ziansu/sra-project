@java.lang.Override
protected V processArg(A parameter) {
    V tableValue = table.evaluate().get(parameter);
    if (tableValue == null)
        throw new org.eclipse.scanning.api.event.queues.models.QueueModelException((("No value for " + parameter) + " in table"));
    
    return tableValue;
}