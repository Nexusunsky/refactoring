import java.util.Enumeration;
import java.util.Vector;

/**
 * 用户类
 *
 * @author: Nexusunsky on 17/7/12 17:25
 */
public class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {

        Enumeration elements = rentals.elements();
        String result = "Rental record for " + getName() + "\n";
        while (elements.hasMoreElements()) {
            Rental each = (Rental) elements.nextElement();
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.chargeEach()) + "\n";
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(chargeTotal()) + "\n";
        result += "You earned " + String.valueOf(calculateTotalPoint()) + "frequent renter points \n";
        return result;
    }

    private int calculateTotalPoint() {
        int result = 0;
        Enumeration elements = this.rentals.elements();
        while (elements.hasMoreElements()) {
            Rental each = (Rental) elements.nextElement();
            result += calculateEachPoint(each);
        }
        return result;
    }

    private int calculateEachPoint(Rental rental) {
        return rental.calculateEachPoint();
    }

    private double chargeTotal() {
        double result = 0;
        Enumeration elements = this.rentals.elements();
        while (elements.hasMoreElements()) {
            Rental each = (Rental) elements.nextElement();
            result += chargeEach(each);
        }
        return result;
    }

    private double chargeEach(Rental each) {
        return each.chargeEach();
    }
}