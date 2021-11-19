public java.lang.String getStatusName() {
    int id = getStatus();
    if (id == 0)
        return "не обработана";
    else
        return "обработана";
    
}