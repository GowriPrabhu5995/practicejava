public class firstnonRepitativechar {
public static void main(String[] args){
    String original = "Software services";
    //normalize for case-insensitive comparison
    String str = original.toLowerCase();
    String result = "";
    //Outer loop: for each index i over str
    for(int i=0; i<str.length();i++){
        int count=0;
      //  Skip spaces (if str.charAt(i) != ' ')
        if(str.charAt(i) !=' '){
            //Inner loop: check every character j; if same char at a different index found, increment count and break (indicates repeat)
            for(int j = 0;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j) && i!=j){
                    count++;
                    break;
                }
            }
            //If count stays 0 after inner loop, the character at i is non-repeating → append to result and break (stop after first found)
            if(count ==0){
                result += str.charAt(i);
                break;
            }
        }
        
    }
    //After loops: if result is empty print "No non-repeating character found." else print the found character
if(result.isEmpty()){
        System.out.println("No non-repeating character found.");
    } else {
        System.out.println("The first non-repeating character is: " + result);
    }
}
}