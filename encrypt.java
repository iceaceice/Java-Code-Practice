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

//Problem
// Implement a pseudo-encryption algorithm which given a string S and an integer N concatenates all the 
// odd-indexed characters of S with all the even-indexed characters of S, this process should be repeated N times.

// Examples:
// encrypt("012345", 1)  =>  "135024"
// encrypt("012345", 2)  =>  "135024"  ->  "304152"
// encrypt("012345", 3)  =>  "135024"  ->  "304152"  ->  "012345"

// encrypt("01234", 1)  =>  "13024"
// encrypt("01234", 2)  =>  "13024"  ->  "32104"
// encrypt("01234", 3)  =>  "13024"  ->  "32104"  ->  "20314"

// Together with the encryption function, you should also implement a decryption function which reverses the process.

// If the string S is an empty value or the integer N is not positive, return the first argument without changes.
