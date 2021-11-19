@java.lang.Deprecated
public java.util.List<org.joda.time.ReadableDateTime> getDates() {
    org.elasticsearch.index.fielddata.ScriptDocValues.Longs.deprecationLogger.deprecated("getDates on numeric fields is deprecated. Use a date field to get dates.");
    if ((dates) == null) {
        dates = new org.elasticsearch.index.fielddata.ScriptDocValues.Dates(values);
        dates.refreshArray();
    }
    return dates;
}