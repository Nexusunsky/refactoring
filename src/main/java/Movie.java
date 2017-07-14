import price.Price;

/**
 * @author: Nexusunsky on 17/7/12 16:59
 */
public class Movie {

    private String mTitle;
    private int mPriceCode;
    private Price mPrice;

    public Movie(String title, Price price) {
        this.mTitle = title;
        this.mPrice = price;
        this.mPriceCode = price.getPriceCode();
    }

    public String getTitle() {
        return mTitle;
    }

    public double eachPrice(int daysRented) {
        return mPrice.eachPrice(daysRented);
    }

    public int eachPoint(int daysRented) {
        return mPrice.eachPoint(daysRented);
    }
}
