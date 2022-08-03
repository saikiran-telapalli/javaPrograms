package Interview;

public class SecondLargestNumInArrayWithOutSorting {
    public static void main(String[] args) {
        int[] arr = {2,6,10,3,8,10,5};

        int firstMax = 0,secondMax=0;
        for (int value : arr) {
            if (value > firstMax) {
                secondMax = firstMax;
                firstMax = value;
            } else if (value > secondMax && value!=firstMax) {
                secondMax = value;
            }
        }
        System.out.println(secondMax);
    }
}
