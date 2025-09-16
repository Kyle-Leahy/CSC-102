package Lab2;
// Kyle Leahy 102H
public class FruitInvoice {
    public static void main(String[] args) {

        String guava = "Guava", apple = "Apple";
        int guavaQuantity = 3, appleQuantity = 8;
        double guavaPrice = 0.98, applePrice = 0.27; // initialized some info for hard-coding the UI
        double taxRate = 0.0825;
        double guavaSubTotal = (guavaPrice*guavaQuantity), appleSubTotal = (applePrice*appleQuantity);
        double guavaTotal = (guavaSubTotal*taxRate),  appleTotal = (appleSubTotal*taxRate);
        // simple calculations for subtotal and totals of fruit.

        System.out.println("SUNY Orange Fruit Stand Receipt");
        System.out.println("Item  |  Quantity  |  Price  |  Subtotal  |  Total");
        System.out.println("--------------------------------------------------");
        System.out.printf(guava).printf("%5d", guavaQuantity).printf("%16.2f", guavaPrice) // all values are of same siz
                .printf("%10.2f", guavaSubTotal).printf("%13.2f", guavaTotal);
        System.out.printf("\n"+apple).printf("%5d", appleQuantity).printf("%16.2f", applePrice)
                .printf("%10.2f", appleSubTotal).printf("%13.2f", appleTotal);
    }
}