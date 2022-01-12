@java.lang.Override
public java.lang.Long getUserLoggedMinutesForDay(java.lang.String userId, java.util.Date day) {
    return ((java.lang.Long) (getActiveEntityManager().createQuery("SELECT SUM(w.loggedMinutes) FROM WorklogBean w WHERE w.userId = :user AND w.day = :day").setParameter("user", userId).setParameter("day", day).getSingleResult()));
}