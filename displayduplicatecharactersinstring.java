public class displayduplicatecharactersinstring{

    public static void main(String[] args) {
        String original = "Banana";
    String str = original.toLowerCase();
    String result = "";
    for(int i=0;i<str.length();i++){
        int count =0;
        if(str.charAt(i)!=' ');
        for(int j=i+1; j<str.length();j++){
    if(str.charAt(i) == str.charAt(j) && i!=j){
         count++;
            }
        }
        if(count==1){
            result+=str.charAt(i);
        }
       
    }
    if(result.isEmpty()){
        System.out.println("No duplicate records are available in the given string");
    }else{
        System.out.println("These are the duplicate characters available in the given string: " + result);
    }
     
    }
    

}