
import Help.Encryption;
import Help.Factorial;
import Help.ScannerSUmOfTwoNumbers;
import Numbers.Palindrome;

public class Main {

    public static void main(String[] args) throws Exception {

        Encryption myEncryption = new Encryption();

        String stringToEncrypt = "awwalsoft.com";
        String encrypted = myEncryption.encrypt(stringToEncrypt);
        String decrypted = myEncryption.decrypt(encrypted);

        System.out.println("String to Encrypt: " + stringToEncrypt);
        System.out.println("Encrypted Value: " + encrypted);
        System.out.println("Decrypted Value: " + decrypted);

    }
}
