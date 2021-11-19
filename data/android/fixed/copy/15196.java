@java.lang.Override
public java.lang.String getQueryValue() {
    if ((get()) == null)
        return "''";
    else
        return ("'" + (get().replace("'", "''"))) + "'";
    
}