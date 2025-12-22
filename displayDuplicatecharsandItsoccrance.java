public class displayDuplicatecharsandItsoccrance{
    public static void main(String[] args){
        String original= "automation";
        String str= original.toLowerCase();
        
        //String result ="";
        for(int i=0; i<str.length();i++){
              if (str.charAt(i) == '0')
                 continue;
            int count =1;
            for(int j=i+1; j<str.length();j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    count++;
                    str = str.substring(0, j) + '0' + str.substring(j + 1);
                }
            }
            if(count>1){
               System.out.println(str.charAt(i) + " = " + count);
            }
          
        }
         
    }
}