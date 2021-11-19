public java.sql.Timestamp getDateLastTake() {
    if ((dateLastTake) == null)
        return null;
    
    return new java.sql.Timestamp(dateLastTake.getMillis());
}