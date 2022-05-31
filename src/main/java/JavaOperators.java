public class JavaOperators {
    public static void main(String[] args) {
        int a = 100 + 10;
        byte b = 50 - 2;
        long l = 50000;
        short s = 700;
        double d = 56.6d;
        float f = 10.5f;
        char c = 'A';
        boolean bol = a == b;
        boolean bol2 = b < l;
        boolean bol3 = (s * 20) < l;
        System.out.println("example of int " + "= " + (a - l + 100));
        System.out.println("example of byte " + "= " + (b * 2) / 4);
        System.out.println("example of long " + "= " + (l / 10 + 100) * 2);
        System.out.println("example of short " + "= " + (s % 15 * s) / 5);
        System.out.println("example of double " + "= " + (d - 22.22) * 0.5);
        System.out.println("example of char " + c + (c * 2));
        System.out.println("example of mixed types " + "= " + a % b + l / 2 + (d - f) + c);
        System.out.println(bol);
        System.out.println(bol2);
        System.out.println(bol3);

        if (a != 100 && b < 48) {
            System.out.println("All good!");
        } else if (a == b) {
            System.out.println("They are equal");
        } else if (a <= f || l > d) {
            System.out.println("That is true");
        } else {
            System.out.println("All is false");
        }

        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println("int max " + " = " + intMax + ", int overflow " + " = " + (intMax + 777777000));
        System.out.println("int min " + " = " + intMin + ", int overflow " + " = " + (intMin - 1000000000));

    }
}