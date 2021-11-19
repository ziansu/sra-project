@java.lang.Override
public io.sample.h2.bean.Users getNameByNamedParameterJdbcTemplate(java.lang.String name) {
    io.sample.h2.bean.Users users = userByNamedParameterJdbcTemplateDao.findByName(name);
    java.lang.System.out.println((">>>2 + " + (users.getEmail())));
    return null;
}