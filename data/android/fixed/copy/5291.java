public void setup() {
    this.entityManagerFactory = javax.persistence.Persistence.createEntityManagerFactory("snel-transport");
    setEntityManagerFactory(this.entityManagerFactory);
}