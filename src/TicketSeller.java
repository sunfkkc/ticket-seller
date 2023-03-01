public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience){
        if( audience.getBag().hasInvitation()) {
            audience.getBag().setTicket(ticketOffice.getTickets());
        }
        else {
            Ticket ticket = ticketOffice.getTickets();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
        }
}
