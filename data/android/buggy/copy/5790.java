public com.qa.cinema.persistence.Ticket findTicket(java.lang.Long ticketId) {
    return manager.find(com.qa.cinema.persistence.Ticket.class, ticketId);
}