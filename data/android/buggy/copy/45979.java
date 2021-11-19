@java.lang.Override
public bcccp.tickets.adhoc.IAdhocTicket issueAdhocTicket() {
    return adhocTicketDAO.createTicket(this.carparkId);
}