import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CarAdvert {
    private String askingPrice;
    private String brand;
    private String type;
    private String distance;
    private LocalDate buildyear;
    private Enum<fuel> fuel;
    //private Arraylist<Image> Images;
    private LocalDateTime offerSinds;
    private ArrayList<Bid> offers;
    private Retailer retailer;

    public enum fuel{
        DIESEL, PETROL, GAS, ELECTRICITY
    }

    public CarAdvert(String askingPrice, String brand, String type, Enum<fuel> fuel, String distance, LocalDate buildyear, LocalDateTime offerSinds, ArrayList<Bid> offers, Retailer retailer) {
        this.askingPrice = askingPrice;
        this.brand = brand;
        this.type = type;
        this.fuel = fuel;
        this.distance = distance;
        this.buildyear = buildyear;
        this.offerSinds = offerSinds;
        this.offers = offers;
        this.retailer = retailer;
    }


}
