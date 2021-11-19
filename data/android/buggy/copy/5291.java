public void setup() {
    java.lang.System.out.println("nee ik mag hier niet komen tijdens test");
    this.entityManagerFactory = javax.persistence.Persistence.createEntityManagerFactory("snel-transport");
    setEntityManagerFactory(this.entityManagerFactory);
}