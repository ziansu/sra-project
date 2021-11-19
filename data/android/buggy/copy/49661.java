@java.lang.Override
public java.util.List<com.bookstore.domain.Order> getPaidOrder(int userID) {
    return orderDAO.findByUserIDandStats(userID, 1);
}