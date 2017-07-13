/**
 * @author: Nexusunsky on 17/7/12 17:20
 */
public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public int calculateEachPoint() {
        // add frequent renter points
        if ((movie.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
            return 2;// add bonus for a two day new release rental
        return 1;
    }

    public double chargeEach() {
        double result = 0;
        switch (movie.getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (daysRented > 3) {
                    result += (daysRented - 3) * 1.5;
                }
                break;
        }
        return result;
    }
}