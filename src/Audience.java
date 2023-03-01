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
        return bag.hold(ticket);
    }
}
