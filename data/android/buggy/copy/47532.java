@java.lang.Deprecated
public org.joda.time.ReadableDateTime getDate() {
    org.elasticsearch.index.fielddata.ScriptDocValues.Longs.deprecationLogger.deprecated("getDate on numeric fields is deprecated. Use a date field to get dates.");
    if ((dates) == null) {
        dates = new org.elasticsearch.index.fielddata.ScriptDocValues.Dates(values);
        dates.refreshArray();
    }
    return dates.getValue();
}