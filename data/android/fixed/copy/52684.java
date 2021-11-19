public final mjson.Json at(java.lang.String property, mjson.Json def) {
    mjson.Json x = at(property);
    if (x == null) {
        return def;
    }else
        return x;
    
}