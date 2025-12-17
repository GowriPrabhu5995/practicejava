public class ReversingString {
    public static void main(String[] args) {
        String name = "Gowri";
        String rev = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        System.out.println("The reversed name is: " + rev);
    }
}
