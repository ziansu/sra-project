public void closeConnection() {
    if ((mongo) != null) {
        mongo.close();
        java.lang.System.out.println(" ********** goodbye mongo");
    }
}