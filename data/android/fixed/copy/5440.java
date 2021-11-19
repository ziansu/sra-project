private void addToStock(at.sbc.firework.Part part) throws at.sbc.firework.service.ServiceException {
    at.sbc.firework.service.IFactoryTransaction t = service.startTransaction();
    t.addToStock(part);
    t.commit();
}