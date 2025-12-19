public class lastnonRepitativeCharingivenstring {
    public static void main(String[] args) {
        String str = "temperature";
        char result = '\0';
        for (int i = str.length() - 1; i >= 0; i--) {
            int count = 0;
            if (str.charAt(i) != ' ') {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && i != j) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    result = str.charAt(i);
                    break;
                }
            }
        }

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The last non-repeating character is: " + result);
        }
    }
}
