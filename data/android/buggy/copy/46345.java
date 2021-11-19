private void extractForEntity(DataAccess.Entity.Order order) {
    id = order.getId();
    date = order.getDate();
    userId = order.getUserId();
    totalPrice = order.getTotalPrice();
    solditemsCollection = getSolditemsCollection();
}