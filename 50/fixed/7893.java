@org.skife.jdbi.v2.sqlobject.SqlUpdate(value = "UPDATE tools SET deleted = 'Y' where id = :id and deleted = 'D'")
protected abstract void delete(@org.skife.jdbi.v2.sqlobject.Bind(value = "id")
java.lang.Long id);