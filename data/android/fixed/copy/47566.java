@java.lang.SuppressWarnings(value = "unchecked")
public java.util.Collection<classes.Entry> getEntriesWithCount(int count) {
    java.util.List<?> result = getHibernateTemplate().find("from Entry entry where entry.count = ?", count);
    return ((java.util.Collection<classes.Entry>) (result));
}