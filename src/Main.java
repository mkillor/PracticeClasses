public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Apple amalzApple = new Apple("red","large");
        Apple brettzApple = new Apple("purple","tiny");
        Apple mrkApple = new Apple();

        mrkApple.setColor("rainbow");
        mrkApple.setSize("Ginormous!!!!!!");
        System.out.println(mrkApple);

        System.out.println(brettzApple);
        System.out.println(amalzApple);

    }
}