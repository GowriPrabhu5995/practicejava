public class firstnonRepitativechar {
public static void main(String[] args){
    String original = "Software services";
    String str = original.toLowerCase();
    String result = "";
    for(int i=0; i<str.length();i++){
        int count=0;
        if(str.charAt(i) !=' '){
            for(int j = 0;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j) && i!=j){
                    count++;
                    break;
                }
            }
            if(count ==0){
                result += str.charAt(i);
                break;
            }
        }
        
    }
if(result.isEmpty()){
        System.out.println("No non-repeating character found.");
    } else {
        System.out.println("The first non-repeating character is: " + result);
    }
}
}