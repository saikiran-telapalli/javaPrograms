package Interview;

public class printBirthSeatBasedNum {
    public static void main(String[] args) {
        int num = 3;
        switch (num % 8) {
            case 1:
                System.out.println("l1");
                break;
            case 2:
                System.out.println("l2");
                break;
            case 3:
                System.out.println("l3");
                break;
            case 4:
                System.out.println("l4");
                break;
            case 5:
                System.out.println("l5");
                break;
            case 6:
                System.out.println("l6");
                break;
            case 7:
                System.out.println("l7");
                break;
            case 8:
                System.out.println("l8");
                break;
        }

        System.out.println(num % 8);
    }
}
