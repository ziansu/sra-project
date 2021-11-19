public static void main(java.lang.String[] args) {
    data.CustomerDAO customerDAO = new data.CustomerDAO();
    data.CustomerDAOTest.testJohn(customerDAO);
    data.CustomerDAOTest.testJohnExists(customerDAO);
}