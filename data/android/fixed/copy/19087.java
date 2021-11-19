public int addUser(com.toughland.helpmechoose.model.User user) {
    java.lang.String sql = "insert into user (facebook_id) values (?)";
    java.util.List<java.lang.Object> parameters = new java.util.ArrayList<>();
    parameters.add(user.getFacebookId());
    return doInsertUpdateDelete(sql, parameters);
}