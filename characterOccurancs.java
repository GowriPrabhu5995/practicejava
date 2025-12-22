public class characterOccurancs {
    public static void main(String[] args){
        String original = "automation";
        String str=original.toLowerCase();

        for(int i=0; i<str.length();i++){
            int count=1;
            if(str.charAt(i)=='0')
                continue;
            
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    // Mark as counted
                    str = str.substring(0, j) + '0' + str.substring(j + 1);
                }
            }

            System.out.println(str.charAt(i) + " = " + count);

        }
    }
    }

