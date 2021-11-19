@java.lang.Override
public void refundChecked(long orderId) {
    java.lang.String sql = "UPDATE SG_SubjectOrder SET Status=? WHERE Id=? AND Status=?";
    update(sql, new java.lang.Object[]{ Order.Status.REFUND_CHECKED , orderId , Order.Status.TO_REFUND });
}