@java.lang.Override
protected V processArg(java.lang.Integer parameter) {
    try {
        return list.evaluate().get(parameter);
    } catch (java.lang.IndexOutOfBoundsException iEOBEx) {
        throw new org.eclipse.scanning.api.event.queues.models.QueueModelException((("No value at index " + parameter) + ". "), iEOBEx);
    }
}