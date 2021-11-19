@java.lang.Override
public org.boreas.spring.jdbc.query.Query customize(java.lang.String condition, java.lang.Object... args) {
    setValue(condition, args);
    return query;
}