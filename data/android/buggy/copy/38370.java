public static com.server.Database getInstance() {
    if ((com.server.Database.instance) == null) {
        com.server.Database.instance = new com.server.Database(com.server.Database.DB_URL, com.server.Database.DB_USER, com.server.Database.DB_PASS);
    }
    return com.server.Database.instance;
}