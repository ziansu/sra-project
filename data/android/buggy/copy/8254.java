@org.junit.After
public void tearDown() throws java.lang.Exception {
    try {
        DB.ExecuteQuery("DELETE from Bets where username=\"bettest\";");
        DB.ExecuteQuery("DELETE from Players where username=\"bettest\";");
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}