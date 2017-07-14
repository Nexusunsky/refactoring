import price.ChildrensPrice;
import price.NewReleasePrice;

/**
 * 程序测试入口
 *
 * @author: Nexusunsky on 17/7/13 16:36
 */
public class TestEnter {
    public static void main(String args[]) {
        Customer liuHao = new Customer("LiuHao");
        Movie transformers = new Movie("Transformers", new NewReleasePrice());
        Movie myBoy = new Movie("MyBoy", new NewReleasePrice());
        Movie beauty = new Movie("Beauty", new ChildrensPrice());
        Rental t1 = new Rental(transformers, 3);
        Rental t2 = new Rental(myBoy, 4);
        Rental t3 = new Rental(beauty, 5);
        liuHao.addRental(t1);
        liuHao.addRental(t2);
        liuHao.addRental(t3);
        String statement = liuHao.statement();
        System.out.println(statement);
        /*Rental record for LiuHao
        Transformers	9.0
        MyBoy	12.0
        Beauty	4.5
        Amount owed is 25.5
        You earned 5frequent renter points*/
    }
}
