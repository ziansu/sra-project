@java.lang.Override
public long getTotalPigInShed(java.lang.String code) {
    java.lang.String sql = java.lang.String.format("select sum(s.pigNumber) from Sty s where s.shed.code='%s'", code);
    org.hibernate.Query query = session.createQuery(sql);
    long number = ((long) (query.uniqueResult()));
    return number;
}