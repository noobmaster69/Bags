public class ArrayBagDemo1 {
    public static void main(String[] args)  {
        
        //Adding to an initially empty bag with sufficient capacity
        System.out.println("Testing an initially empty bag with" +
                "sufficient capacity");
        
        BagInterface<String> aBag = new ArrayBag<>();
        
        String[] contentsOfBag1 = {"A", "A", "B", "C", "A"};
        
        testAdd(aBag, contentsOfBag1);
    }

    private static void testAdd(BagInterface<String> aBag, String[] contentsOfBag1) {

        System.out.print("Adding the following strings to the bag");
        for (int i = 0; i < contentsOfBag1.length; i++) {
            if(aBag.add(contentsOfBag1[i]))
                System.out.print(contentsOfBag1[i] + " ");
            else
                System.out.println("\nUnable to add " + contentsOfBag1[i] +
                        " to the bag");
            
        }
        System.out.println();
        
        displayBag(aBag);
        
    }

    private static void displayBag(BagInterface<String> aBag) {

        System.out.println("The bag contains the following string(s)");
        Object[] bagArray = aBag.toArray();
        for (int i = 0; i < bagArray.length; i++) {
            System.out.print(bagArray[i] + " ");

        }

        System.out.println();
    }
}
