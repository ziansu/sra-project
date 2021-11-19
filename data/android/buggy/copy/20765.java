@org.springframework.transaction.annotation.Transactional
public com.evry.dashboard.model.TaskDetails isValid(com.evry.dashboard.model.TaskDetails taskDetails) {
    org.hibernate.Session session = this.sessionFactory.getCurrentSession();
    return getUsers(taskDetails);
}