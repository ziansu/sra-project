@java.lang.Override
public java.sql.ResultSet getLeagues(long sumID) {
    java.lang.String proc = ("CALL retrieve_league(" + sumID) + ")";
    return requestData(proc);
}