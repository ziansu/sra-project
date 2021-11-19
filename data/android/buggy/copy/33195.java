@java.lang.Override
public long count() {
    com.mongodb.DBCollection dbc1 = dBCollection();
    long x = dbc1.count();
}