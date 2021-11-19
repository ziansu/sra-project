@java.lang.Override
public boolean delete(int id, int userId) {
    return (jdbcTemplate.update("DELETE FROM meals WHERE id=? and userId = ? ", id, userId)) != 0;
}