@org.skife.jdbi.v2.sqlobject.SqlQuery(value = "select id, type, updated_at from users where id in (<ids>)")
@org.skife.jdbi.v2.sqlobject.customizers.Mapper(value = com.github.k0kubun.github_ranking.repository.dao.UserDao.UserUpdatedAtMapper.class)
java.util.List<com.github.k0kubun.github_ranking.model.User> findUsersWithUpdatedAt(@org.skife.jdbi.v2.unstable.BindIn(value = "ids")
java.util.List<java.lang.Integer> ids);