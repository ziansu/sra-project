public static void cancelPayment(it.unical.pizzamanager.persistence.dto.Booking booking, it.unical.pizzamanager.persistence.dao.PaymentDAO paymentDAO) {
    it.unical.pizzamanager.persistence.dto.Payment payment = booking.getPayment();
    if (payment != null) {
        payment.setToken(null);
        paymentDAO.update(payment);
    }
}