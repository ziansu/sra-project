@java.lang.Override
public edu.ynu.travel.entity.user.RoleEntity addRole(edu.ynu.travel.entity.user.RoleEntity roleEntity) {
    return (roleEntityMapper.insert(roleEntity)) == 1 ? roleEntity : null;
}