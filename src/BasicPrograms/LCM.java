package BasicPrograms;

public class LCM {
	
	public static long lcm(int[] numbers) {
        long lcm = 1;
        int divisor = 2;
        while (true) {
            int cnt = 0;
            boolean divisible = false;
            for (int i = 0; i < numbers.length; i++) {
                /**
                 * lcm (n1,n2,... 0)=0.For negative number we convert into
                 * positive and calculate lcm.
                 */
                if (numbers[i] == 0) {
                    return 0;
                } else if (numbers[i] < 0) {
                    numbers[i] = numbers[i] * (-1);
                }
                if (numbers[i] == 1) {
                    cnt++;
                    System.out.println("cnt: "+cnt);
                }
                /**
                 * divide numbers by devisor if complete division i.e. without
                 * remainder then replace number with quotient; used for find
                 * next factor
                 */
                if (numbers[i] % divisor == 0) {
                    divisible = true;
                    numbers[i] = numbers[i] / divisor;
                    System.out.println("numbers[i]: "+numbers[i]);
                }
            }
            /**
             * If divisor able to completely divide any number from array
             * multiply with lcm and store into lcm and continue to same divisor
             * for next factor finding. else increment divisor
             */
            if (divisible) {
                lcm = lcm * divisor;
            } else {
                divisor++;
            }
            /**
             * Check if all numbers is 1 indicate we found all factors and
             * terminate while loop.
             */
            if (cnt == numbers.length) {
                return lcm;
            }
        }
    }

    public static int lcm2(int num1, int num2) {
        if(num1==0 || num2==0){
            return 0;
        }else if(num1<0){
            num1=num1*(-1);
        }else if(num2<0){
            num2=num2*(-1);
        }
        int m = num1;
        int n = num2;
        while (num1 != num2) {
            if (num1 < num2) {
                num1 = num1 + m;
            } else {
                num2 = num2 + n;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 7};
        System.out.println("*** Least Common Multiple ***");
        System.out.println("LCM(Least Common Multiple) of N numbers using Table method ");
        System.out.println(lcm(numbers));
        System.out.println("LCM of two numbers using repetative addition");
        System.out.println(lcm2(24, 36));

    }

}
