public class TestingOrderedPair {
    public static void main(String[] args) {

        OrderedPair<String> aPair = new OrderedPair<>("apple", "banana");

        System.out.println(aPair);
        aPair.changeOrder();
        System.out.println(aPair);
        String firstFruite = aPair.getFirst();
        System.out.println(firstFruite + " has length " + firstFruite.length());


    }
}
