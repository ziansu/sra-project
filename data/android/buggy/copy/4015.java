@org.springframework.transaction.annotation.Transactional
public int saveSummary(com.inapp.ipl.entities.MatchDetails summary) {
    com.inapp.ipl.entities.MatchDetails details = ((com.inapp.ipl.entities.MatchDetails) (sessionFactory.getCurrentSession().save(summary)));
    return details.getId();
}