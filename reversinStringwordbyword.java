public class reversinStringwordbyword{
    public static void main(String[] args) {
        String name = "Gowri Prabhu Kiran";
    String rev = "";
    String words[]= name.split(" ");
    
     for(int i= 0; i<=words.length-1; i++){
         String splittedname =words[i];
         for(int j=splittedname.length()-1;j>=0;j--){
            rev += splittedname.charAt(j) + " ";  
         }
     }
     System.out.println("The reversed name is: " + rev);
    }

}