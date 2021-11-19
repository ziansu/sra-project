@java.lang.Override
public void persist(com.coin.entity.User user) {
    if ((user.getId()) == null) {
        user.setId(java.util.UUID.randomUUID());
    }
    super.persist(user);
}