public void submitTicket(java.lang.String yourName) {
    serviceNum = classify();
    Ticket q = new Ticket(yourName, types[serviceNum], nextTicket, serviceNum);
    (nextTicket)++;
    queue.add(q);
}