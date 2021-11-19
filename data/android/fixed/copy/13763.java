@javax.annotation.PostConstruct
public void init() {
    if ((emFactory) != null) {
        em = emFactory.createEntityManager();
    }
}