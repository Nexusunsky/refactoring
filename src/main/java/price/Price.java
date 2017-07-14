package price;

/**
 * 使用state模式来让子类实现  取代switch语句；
 *
 * @author: Nexusunsky on 17/7/14 11:41
 */
public abstract class Price {
    static final int CHILDRENS = 2;
    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;
    int mPriceCode;

    public int getPriceCode() {
        return mPriceCode;
    }

    public abstract double eachPrice(int daysRented);

    public abstract int eachPoint(int daysRented);
}
