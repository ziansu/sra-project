@java.lang.Override
public org.boreas.spring.jdbc.query.Query customize(java.lang.String condition, java.lang.Object... args) {
    if (args != null) {
        for (java.lang.Object arg : args)
            if (arg == null)
                return query;
            
        
        setValue(condition, args);
    }
    return query;
}