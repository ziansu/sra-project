@java.lang.Override
public int addRole(edu.ynu.travel.entity.user.RoleEntity roleEntity) {
    return roleEntityMapper.insert(roleEntity);
}