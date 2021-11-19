@java.lang.Override
public int getCountUserBirthday(final java.util.Date date) {
    final java.lang.Number result = ((java.lang.Number) (sessionFactory.getCurrentSession().createQuery("SELECT count(t) FROM DbBirthdayAll t where day(t.birthday) = day(:date) and month(t.birthday) = month(:date)").setParameter("date", date).uniqueResult()));
    return result.intValue();
}