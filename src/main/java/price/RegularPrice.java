package price;

/**
 * ${TODO}
 *
 * @author: Nexusunsky on 17/7/14 13:52
 * @note:
 */
public class RegularPrice extends Price {

    public RegularPrice() {
        mPriceCode = REGULAR;
    }

    @Override
    public double eachPrice(int daysRented) {
        double result = 0;
        result += 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }

    @Override
    public int eachPoint(int daysRented) {
        return 1;
    }
}
