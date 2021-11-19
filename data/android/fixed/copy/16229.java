@javax.ws.rs.GET
@io.dropwizard.hibernate.UnitOfWork
public java.util.List<nl.projectsmile.api.v1.db.CardRegistration> getCardRegistrations(@javax.ws.rs.PathParam(value = "cardId")
java.lang.String cardId) {
    if ("-".equals(cardId)) {
        return cardRegistrationDAO.getAllCardRegistrations();
    }
    return cardRegistrationDAO.getCardRegistrationsByCardId(cardId);
}