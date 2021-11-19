@java.lang.Override
public ru.javawebinar.topjava.model.Meal get(int id, int userId) {
    java.util.List<ru.javawebinar.topjava.model.Meal> meals = jdbcTemplate.query("SELECT * FROM meals WHERE id=? AND user_id=?", new java.lang.Object[]{ userId }, ru.javawebinar.topjava.repository.jdbc.JdbcMealRepositoryImpl.ROW_MAPPER);
    return org.springframework.dao.support.DataAccessUtils.singleResult(meals);
}