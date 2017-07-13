/**
 * 程序测试入口
 *
 * @author: Nexusunsky on 17/7/13 16:36
 */
public class TestEnter {
    public static void main(String args[]) {
        Customer liuHao = new Customer("LiuHao");
        String statement = liuHao.statement();
        System.out.println(statement);
    }
}
