public static models.OrderItems addOrderItem(models.OrderItems ordItem) {
    models.DBAccessClass db = new models.DBAccessClass();
    db.connectMeIn();
    models.OrderItems addOrderItem = db.DBaddOrderItem(ordItem);
    db.closeConnection();
    return addOrderItem;
}