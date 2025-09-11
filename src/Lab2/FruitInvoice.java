package Lab2;
/**
 * Class declaring my FruitInvoice class so I can hard-code the answer
 * @author Kyle Leahy
 */
public class FruitInvoice {
    public static void main(String[] args) {

        String guava = "Guava", apple = "Apple";
        int guavaQuantity = 3, appleQuantity = 8;
        double guavaPrice = 0.98, applePrice = 0.27;
        double taxRate = 0.0825;
        double guavaSubTotal = (guavaPrice*guavaQuantity), appleSubTotal = (applePrice*appleQuantity);
        double guavaTotal = (guavaSubTotal*taxRate),  appleTotal = (appleSubTotal*taxRate);

        System.out.println("SUNY Orange Fruit Stand Receipt");
        System.out.println("Item  |  Quantity  |  Price  |  Subtotal  |  Total");
        System.out.println("--------------------------------------------------");
        System.out.printf(guava).printf("%5d", guavaQuantity).printf("%16.2f", guavaPrice)
                .printf("%10.2f", guavaSubTotal).printf("%13.2f", guavaTotal);
        System.out.printf("\n"+apple).printf("%5d", appleQuantity).printf("%16.2f", applePrice)
                .printf("%10.2f", appleSubTotal).printf("%13.2f", appleTotal);
    }
}