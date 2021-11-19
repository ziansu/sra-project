private void visorCurrentTicketLine() {
    int index = m_ticketlines.getSelectedIndex();
    if (index >= 0) {
        visorTicketLine(m_oTicket.getLine(index));
    }
}