public class Exercise {
    public static void main(String[] args) {

        // 1. int, char, String

        // 2.
        int x = 3, p = 5, y = -8;
        switch (x) {
            case 2: p++;
            case 3:
            case 4: y += (--p); break;
            case 5: y += (p++);
        }
        System.out.println(y); // -4

        // 3.
        int y3 = 0;
        char myChar = 'g';
        switch (myChar) {
            case 'G': case 'g': y3++; break;
            case 'M': case 'm': y3--; break;
            default: y3 += 100;
        }
        System.out.println(y3);

        // 4.
        String s = "Green";
        int q = 0;
        switch (s) {
            case "Red": q++;
            case "Green": q++;
            case "Blue": q++;
            case "Yellow": q++;
            default: q++;
        }
        System.out.println(--q); // 3

        // 5.
        char chr = 'z';
        System.out.println(chr);

        // 6.
        int x6 = 10, y6 = 12;
        System.out.println("The sum is " + x6 + y6);   // The sum is 1012
        System.out.println("The sum is " + (x6 + y6)); // The sum is 22

        // 7.
        int speed = 75;
        switch (speed) {
            case 75:
                System.out.println("Exceeding speed limit");
                break;
            case 69:
            case 70:
                System.out.println("Getting close");
                break;
            case 65:
                System.out.println("Cruising");
                break;
            default:
                System.out.println("Very slow");
        }

        // 8. No

        // 9.
        String sx = "X";
        char chr2 = sx.charAt(0);
        System.out.println(chr2);
    }
}
