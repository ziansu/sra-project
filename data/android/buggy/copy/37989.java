private java.util.List<com.netcracker.cinema.model.Ticket> getTicketsByCode(java.lang.Long code) {
    com.netcracker.cinema.web.cashier.TestData data = new com.netcracker.cinema.web.cashier.TestData();
    java.util.List<com.netcracker.cinema.model.Ticket> tickets = data.getTicketListByCode(code);
    return data.getTicketListByCode(code);
}