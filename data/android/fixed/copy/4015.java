@org.springframework.transaction.annotation.Transactional
public int saveSummary(com.inapp.ipl.entities.MatchDetails summary) {
    int id = ((java.lang.Integer) (sessionFactory.getCurrentSession().save(summary)));
    return id;
}