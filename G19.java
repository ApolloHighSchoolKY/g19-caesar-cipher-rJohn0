/**
 * @(#)G19.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */

import java.util.Arrays;
public class G19 {

    public static void main(String[] args) {

    	CaesarCipher cipher = new CaesarCipher(4);

    	System.out.println(cipher.encrypt("hello world!"));
    	System.out.println(cipher.decrypt("ukq zez ep!"));
		
    	//Create a new cipher using the shifter(#) method
    	//Encrypt and decrypt a message with your new cipher

		cipher.shifter(8);
		System.out.println(cipher.encrypt("i dont like timed frqs!"));
		System.out.println(cipher.decrypt("a vav al!"));

		CaesarCipher wow = new CaesarCipher();
		System.out.println(wow.encrypt("i forgot default existed oops"));
		System.out.println(wow.decrypt("fg!"));
    }


}