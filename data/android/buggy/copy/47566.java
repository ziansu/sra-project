@java.lang.SuppressWarnings(value = "unchecked")
public java.util.Collection<classes.Entry> getEntriesWithCount(int count) {
    return getHibernateTemplate().find("from Entry entry where entry.count = ?", count);
}