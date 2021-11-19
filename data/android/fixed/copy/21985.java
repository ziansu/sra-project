@java.lang.Override
public void deregisterSeasonTicket(bcccp.tickets.season.ISeasonTicket seasonTicket) {
    seasonTicketDAO.deregisterTicket(seasonTicket);
}