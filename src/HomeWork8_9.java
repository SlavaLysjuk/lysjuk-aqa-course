public class HomeWork8_9 {

    public boolean endsWith(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        return str1.endsWith(str2) || str2.endsWith(str1);
    }
}
