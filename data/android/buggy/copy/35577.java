private java.sql.Connection getConnection(int tid) {
    if (!(connectionMap.containsKey(tid))) {
        throw new com.aincvy.finger.FingerRuntimeException("给定的事务id有误，请检查");
    }
    return connectionMap.get(tid);
}