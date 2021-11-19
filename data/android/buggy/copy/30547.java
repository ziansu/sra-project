public boolean isBooked(java.sql.Timestamp timestamp) {
    return (timestamp.after(tStart)) && (timestamp.before(tEnd));
}