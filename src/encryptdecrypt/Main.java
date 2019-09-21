package encryptdecrypt;

/**
 * @author Arkadiusz Brych
 */
public class Main {

    public static void main(String[] args) {
        String example = "we found a treasure!";
        System.out.println(encryptMessage(example));
    }

    private static String encryptMessage(String originalMessage){
        StringBuilder encrypted = new StringBuilder();
        for(int i = 0; i < originalMessage.length(); i++){
            char temp = originalMessage.charAt(i);
            boolean isLetter = Character.isAlphabetic(temp);
            if (isLetter){
                int distance = Math.abs('z' - temp);
                char result = (char) ('a' + distance);
                encrypted.append(result);
            } else {
                encrypted.append(temp);
            }
        }
        return encrypted.toString();
   }
}