public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public Long buy(Ticket ticket){

        /**
         * 초대장 종류가 많아진다면 개선이 필요
         * */
        if( bag.hasInvitation()){
            bag.setTicket(ticket);
            return 0L;
        }

        bag.setTicket(ticket);
        bag.minusAmount(ticket.getFee());

        return ticket.getFee();
    }
}
