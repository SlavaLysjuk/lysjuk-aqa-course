public class HomeWork8_6 {

    public String doubleChars(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append(c).append(c);
        }

        return result.toString();
    }
}
