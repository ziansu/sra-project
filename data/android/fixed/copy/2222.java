public void testGetServerConnection() {
    connection = com.kritsit.casetracker.client.domain.factory.ServiceFactory.getServerConnection();
    assertTrue(((connection) != null));
    assertTrue(connection.equals(com.kritsit.casetracker.client.domain.factory.ServiceFactory.getServerConnection()));
}