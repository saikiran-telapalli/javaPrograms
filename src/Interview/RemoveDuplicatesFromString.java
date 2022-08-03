package Interview;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "sai kiran telapalli";
        String result ="";
        for(int i=0; i<str.length(); i++){
            if(result.indexOf(str.charAt(i))<0){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
