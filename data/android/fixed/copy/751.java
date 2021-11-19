void printAllTickets() {
    for (com.packt.ticketMachine.tickets.Ticket ticket : ticketsList) {
        java.lang.System.out.format(((ticket.getName()) + "\n"));
    }
    java.lang.System.out.println("Proszę odebrać bilety");
}