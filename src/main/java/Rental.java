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

    public int calculateEachPoint() {
        return movie.eachPoint(daysRented);
    }

    public double chargeEach() {
        double result = 0;
        result += movie.eachPrice(daysRented);
        return result;
    }
}