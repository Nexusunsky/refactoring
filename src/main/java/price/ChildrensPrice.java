package price;

/**
 * @author: Nexusunsky on 17/7/14 13:45
 */
public class ChildrensPrice extends Price {
    public ChildrensPrice() {
        mPriceCode = CHILDRENS;
    }

    @Override
    public double eachPrice(int daysRented) {
        double result = 0;
        result += 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }

    @Override
    public int eachPoint(int daysRented) {
        return 1;
    }
}
