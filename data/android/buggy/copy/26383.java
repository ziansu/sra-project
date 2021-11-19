@java.lang.Override
public void save(com.estore.user.entity.User data) {
    this.userMapper.insert(data);
}