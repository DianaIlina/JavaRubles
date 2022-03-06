public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int topUp = 2000;
        int bonusRuble = topUp>=1000 ? topUp/100 : 0;

        System.out.println("Бонусные рубли: " + bonusRuble);
    }
}
