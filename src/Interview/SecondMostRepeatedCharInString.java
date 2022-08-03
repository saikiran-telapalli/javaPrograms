package Interview;

public class SecondMostRepeatedCharInString {
    static int NumOf_Char =256;
    public static void main(String[] args) {
        String text = "saikiran telapalli QAexpert";
        int[] arr = new int[NumOf_Char];

        for(int i=0; i<text.length(); i++){
            arr[text.charAt(i)]++;
        }

        int first=0,second=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[first]){
                second = first;
                first = i;
            }
            else if(arr[i]>arr[second] && arr[i] != arr[first]){
                second = i;
            }
        }
        char res = (char) second;
        if(res!='\0'){
            System.out.println("Second most frequent character is: "+ res);
        }else{
            System.out.println("No second most frequent character");
        }
    }
}
