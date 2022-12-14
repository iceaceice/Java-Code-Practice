public class encrypt {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(encryptText(str));
    }

    static String encryptText(String str){

        String result = "";
        for(String i: str.split(" ")){
            String temp = swap(i, 1, i.length() - 1);
            result += Integer.toString((int)i.charAt(0)) + temp.substring(1, temp.length()) + " ";
        }

        return result;
    }

    static String swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
}
