/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */

import java.util.Arrays;

public class CaesarCipher {

	private char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k' ,'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	private char[] shifted;
	private int shift;

    public CaesarCipher() {
    shifted = new char [26];
    shift = 2;
    shifter(shift);
    }

    public CaesarCipher(int num){
    shifted = new char [26];
    shift = num;
    shifter(shift);
    }

    public String encrypt(String message){
        String outputEncrypt = "";
        boolean found = false;
        //go through message position
        for(int i =0; i<message.length(); i++)
        {
             found = false;
            // go through alphabet position
            for(int z =0; z<alphabet.length; z++)
            {
                if(message.charAt(i) == alphabet[z])
                {
                    found = true;
                    outputEncrypt += shifted[z];
                }
            }
            if(!found)
              outputEncrypt += message.charAt(i);
            
        }
     
        return "" + outputEncrypt;
    }

    public String decrypt(String message){
        String outputDecrypt = "";
        boolean found = false;
        for(int i =0; i<message.length(); i++)
        {
         found = false;
            // go through alphabet position
            for(int z =0; z<shifted.length; z++)
            {
                if(message.charAt(i) == shifted[z])
                {
                    found = true;
                    outputDecrypt += alphabet[z];
                }
            }
            if(!found)
                outputDecrypt += message.charAt(i);
            
        }
    
        return "" + outputDecrypt;
    }

    public void shifter(int num){
        for(int i = 0; i<alphabet.length; i++)
        {
            shifted[(i+num)%alphabet.length] = alphabet[i];
        }
       //tested to see if it shifted System.out.println(Arrays.toString(shifted));
    }


}