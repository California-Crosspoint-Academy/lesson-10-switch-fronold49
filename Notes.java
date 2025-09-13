public class Notes {
    public static void main(String[] args) {
        int choice = 1;
        // add: 1, sub: 2, multiplication: 3, division: 4
        double op1 = 10, op2 = 5;

        switch (choice) {
            case 1: System.out.println(op1 + " + " + op2 + " = " + (op1 + op2)); break;
            case 2: System.out.println(op1 + " - " + op2 + " = " + (op1 - op2)); break;
            case 3: System.out.println(op1 + " * " + op2 + " = " + (op1 * op2)); break;
            case 4: System.out.println(op1 + " / " + op2 + " = " + (op1 / op2)); break;
            default: System.out.println("Invalid choice");
        }

        int j = 2;
        String s = "";
        switch (j) {
            case 1: case 2: case 3: s = "low"; break;
            case 4: case 5: case 6: s = "high"; break;
            case 7: s = "lucky";
        }
        System.out.println(s);
        
        char c1 = 'h', c2 = '6', c3 = '@';
        System.out.println(c1 + ", " + c2 + ", " + c3);
    }
}
