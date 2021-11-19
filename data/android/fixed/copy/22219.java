@java.lang.Override
public void addAudio(long audioId, long userId) throws java.sql.SQLException {
    jdbcTemplate.update(addAudio, userId, audioId, userId);
}