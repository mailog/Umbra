package Security;

import java.io.UnsupportedEncodingException;


import java.io.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.DecoderException;

import static org.apache.commons.codec.binary.Hex.*;
import static org.apache.commons.io.FileUtils.*;

public class EncryptMethod{
			
	private static SecretKey myDesKey;
	private static Cipher aesCipher;
	
	
	public EncryptMethod(){
		try{
		myDesKey = loadKey(new File("keygenerate.txt"));
		aesCipher = Cipher.getInstance("AES");	
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public byte[] encrypt(String secret){
		try{
			
			byte[] text = secret.getBytes("UTF8");
			aesCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
			
			return (aesCipher.doFinal(text));
			
		}catch(Exception e)
		{
			byte[] exc = {0,0};
			e.printStackTrace();
			return exc;
		}
	}
	
	public String decrypt(byte[] secret){
		try{
			
			aesCipher.init(Cipher.DECRYPT_MODE, myDesKey);
			byte[] textDecrypted = aesCipher.doFinal(secret);
		
			String s = new String(textDecrypted);
			return s;
		}
		catch(Exception e){
			return e + "";
		}
	}
	
	public static SecretKey loadKey(File file) throws IOException
	{
	    String data = new String(readFileToByteArray(file));
	    byte[] encoded;
	    try {
	        encoded = decodeHex(data.toCharArray());
	    } catch (DecoderException e) {
	        e.printStackTrace();
	        return null;
	    }
	    return new SecretKeySpec(encoded, "AES");
	}
}
