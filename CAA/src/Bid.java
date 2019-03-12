import java.time.LocalDateTime;

public class Bid {

    private CarAdvert carAdvert;
    private Buyer buyer;
    private String bid;
    private LocalDateTime date;
    private Boolean agreedToBuy;

    public Bid(CarAdvert carAdvert, Buyer buyer, String bid, LocalDateTime date, Boolean agreedToBuy) {
        this.carAdvert = carAdvert;
        this.buyer = buyer;
        this.bid = bid;
        this.date = date;
        this.agreedToBuy = agreedToBuy;
    }

}
