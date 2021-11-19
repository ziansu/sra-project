public java.lang.String getStatusName() {
    int id = getStatus();
    if (id == 1)
        return "не обработана";
    else
        return "обработана";
    
}