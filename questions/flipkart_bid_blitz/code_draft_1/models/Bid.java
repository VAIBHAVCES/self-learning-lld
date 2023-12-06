package models;

public class Bid {
    private User user;
    private int amt;

    public Bid(User user, int amt) {
        this.user = user;
        this.amt = amt;
    }

    public User getUser() {
        return user;
    }

    public int getAmt() {
        return amt;
    }

    @Override
    public boolean equals(Object obj) {

        Bid otherBid = (Bid) obj;

        return amt == otherBid.amt && this.user.getId()==otherBid.getUser().getId();
    }
    @Override
    public int hashCode() {
        int result = Integer.hashCode(amt);
        result = 31 * result + user.hashCode();
        return result;
    }


}

