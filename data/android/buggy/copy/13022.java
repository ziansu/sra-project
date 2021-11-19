@org.junit.Test(expected = org.postgresql.util.PSQLException.class)
public void testWrongPWDDB() {
    postgres.Database falsePWRD = new postgres.Database("booktown", "postgres", "meow");
    assertFalse(falsePWRD.verifyConnection());
}