private boolean isComplete(final pl.com.itsense.eventprocessing.consumer.sql.SQLTuple tuple) {
    boolean complete = true;
    for (final pl.com.itsense.eventprocessing.consumer.sql.SQLTable table : references) {
        if ((tuple.getReference(table)) == null) {
            complete = false;
            break;
        }
    }
    return complete;
}