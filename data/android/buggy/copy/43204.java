public java.util.ArrayList<org.pi.litepost.applicationLogic.Post> getByUser(int userId) throws java.sql.SQLException, org.pi.litepost.databaseAccess.DatabaseCriticalErrorException {
    java.sql.ResultSet result = this.model.getQueryManager().executeQuery("getPostsByUser");
    java.util.ArrayList<org.pi.litepost.applicationLogic.Post> posts = this.createPosts(result);
    return posts;
}