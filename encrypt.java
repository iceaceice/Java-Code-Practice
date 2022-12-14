public class encrypt {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(encryptText(str));
    }

    static String encryptText(String str){

        String result = "";

        //Split the string by space delimiter
        for(String i: str.split(" ")){
            //call the string function swap()
            String temp = swap(i, 1, i.length() - 1);
            //store the result with converting the first letter of the word to ASCII and adding the remaining word of the string
            result += Integer.toString((int)i.charAt(0)) + temp.substring(1, temp.length()) + " ";
        }

        return result;
    }

    static String swap(String str, int i, int j)
    {
        //swap the position of second letter and last letter of the word
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
}

//Problem

// Description:
// Encrypt this!

// You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

// Your message is a string containing space separated words.
// You need to encrypt each word in the message using the following rules:
// The first letter must be converted to its ASCII code.
// The second letter must be switched with the last letter
// Keepin' it simple: There are no special characters in the input.

// Examples:
// Kata.encryptThis("Hello") => "72olle"
// Kata.encryptThis("good") => "103doo"
// Kata.encryptThis("hello world") => "104olle 119drlo"
