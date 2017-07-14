package price;

/**
 * ${TODO}
 *
 * @author: Nexusunsky on 17/7/14 13:54
 * @note:
 */
public class NewReleasePrice extends Price {
    public NewReleasePrice() {
        mPriceCode = NEW_RELEASE;
    }

    @Override
    public double eachPrice(int daysRented) {
        double result = 0;
        result += daysRented * 3;
        return result;
    }

    @Override
    public int eachPoint(int daysRented) {
        // add frequent renter points
        return (daysRented > 1) ? 2 : 1; // add bonus for a two day new release rental
    }
}
