@nl.b3p.viewer.admin.stripes.Before
public void setUpdatable() {
    javax.persistence.EntityManager em = org.stripesstuff.stripersist.Stripersist.getEntityManager();
    updatable = (service) instanceof nl.b3p.viewer.config.services.Updatable;
}