import org.junit.test;
import static org.junit.Assert.*;



public class visionTest {
    
    // Test 1
    @Test
    public static  double calcValidation(String m, double p, int quantity, double currentTotal) {
        double total = currentTotal;
        
        try {
            p = p * quantity;
            total += p;
        } catch (ArithmeticException a) {
            System.out.println("**** Invalid number calculation ****");
        }
        return total;
    }
    
    // Test 2
    @Test
    public static int inputHandling(int input, int currentAddState) {
        int addState = currentAddState;
        
        try {
                addState = input;
            } catch (InputMismatchException e) {
                System.out.println("\n");
        }
        return addState;
    }
    
    // Test 3
    @Test
    public static void orderHistory(ArrayList<OrderList> OrderData) {
        for (int i = 0; i < OrderData.size(); i++) {
            System.out.println((i + 1) + ". " + OrderData.get(i).getMenuName() + " \t\tRM " + OrderData.get(i).getPrice() + " \t\t" + OrderData.get(i).getQuantity());
        }
    }
    
    // Test 4
    @Test
    public static String[] getMenu(char inputMenu) {
        String m = "";
        double p = 0;
        
        switch (inputMenu) {
            case 'A' | 'a':
                m = Menu.MENU1.getMenuName();
                p = Menu.MENU1.getPrice();
                break;
            case 'B' | 'b':
                m = Menu.MENU2.getMenuName();
                p = Menu.MENU2.getPrice();
                break;
            case 'C' | 'c':
                m = Menu.MENU3.getMenuName();
                p = Menu.MENU3.getPrice();
                break;
            case 'D' | 'd':
                m = Menu.MENU4.getMenuName();
                p = Menu.MENU4.getPrice();
                break;
            case 'E' | 'e':
                m = Menu.MENU5.getMenuName();
                p = Menu.MENU5.getPrice();
                break;
            case 'F' | 'f':
                m = Menu.MENU6.getMenuName();
                p = Menu.MENU6.getPrice();
                break;
            case 'G' | 'g':
                m = Menu.MENU7.getMenuName();
                p = Menu.MENU7.getPrice();
                break;
        }
        
        return new String[] {m, String.valueOf(p)};
    }

    // Test 5
    @Test
    public double calcTotal()
    {
        double totalPrice = 0.0;
        if (current > balance) {
            current = 0;
        } else {
            double total = current + (current * TOTAL_TAX);
            totalPrice = total;
        }
        return totalPrice;
    }

    // Test 6
    @Test
    public void displayTotalPayment()
    {
        if (balance < calcTotal() || calcTotal() == 0)
        {
            System.out.println("\nInsufficient Balance! ");

        }

        else
        {
            System.out.println("\nTotal Payment (inc. TAX): RM " + calcTotal());
            balance -=  calcTotal();
            System.out.println("Balance After Order: RM " + balance );
        }
    }
}
