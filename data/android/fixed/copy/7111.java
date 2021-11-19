public void deleteOffer(backend.Offer deletedOffer) {
    offers.remove(deletedOffer.getId());
    try {
        databaseConnector.deleteOffer(deletedOffer);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}