@java.lang.Override
public com.jajja.jorm.sql.Appender[] getDeleteAppenders() {
    if (isReturning) {
        return com.jajja.jorm.sql.Postgres.DELETE_APPENDERS;
    }else {
        return super.getDeleteAppenders();
    }
}