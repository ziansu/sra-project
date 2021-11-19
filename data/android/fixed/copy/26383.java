@java.lang.Override
public void save(com.estore.user.entity.User data) {
    data.setEnabled(true);
    this.userMapper.insert(data);
}