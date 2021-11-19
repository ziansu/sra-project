private void connectToBroker() {
    if ((this.objConnection) != null) {
        this.objConnection = new org.springframework.amqp.rabbit.connection.CachingConnectionFactory("localhost");
        this.objConnection.setUsername("username");
        this.objConnection.setPassword("password");
    }
}