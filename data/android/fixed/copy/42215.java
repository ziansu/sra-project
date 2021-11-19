@java.lang.Override
public void addField(de.jpaw.bonaparte.pojos.meta.TemporalElementaryDataItem di, org.joda.time.Instant t) throws java.io.IOException {
    writeSeparator();
    if (t != null) {
        addRawData(java.lang.Long.toString(t.getMillis()));
    }
}