@java.lang.Override
public long count() {
    return jdbcTemplate.queryForLong("SELECT COUNT(*) FROM Employee;");
}