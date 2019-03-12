import java.util.ArrayList;

public class Buyer {
    private String name;
    private String email;
    private ArrayList<CarAdvert> favourites;
    private ArrayList<Bid> bids;


    public Buyer(String name, String email, ArrayList<CarAdvert> favourites, ArrayList<Bid> bids) {
        this.name = name;
        this.email = email;
        this.favourites = favourites;
        this.bids = bids;
    }
}
