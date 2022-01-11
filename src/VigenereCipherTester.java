import java.util.Scanner;

public class VigenereCipherTester {
public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("This program encrypts and decrypts messages using the Vigenere Cipher. " + '\n' +
		"Would you like to encode or decode a message? ");
		
		String response = in.nextLine();
		
		if (response.equals("decode") || response.equals("encode"))	{
			
				
			
			
				
				if(response.equals("encode")) {
					
					Scanner scan=new Scanner(System.in);
					
					System.out.println("Enter the string to encode: ");
					
					String str=in.nextLine();
					
					
					if(VigenereCipher.isThisLowerCase(str)) {
					Scanner key1=new Scanner(System.in);
					System.out.println("Enter the key: ");
					String myKey=in.nextLine();
						if(VigenereCipher.isThisLowerCase(myKey)) {
							String extended = VigenereCipher.makeWord(str,myKey);
							System.out.println( VigenereCipher.encrypt(str,extended)+ '\n');
						}
						else {
							System.out.println("Key must consist of only lowercase characters");
						}
			
			
			
				}
					else {
						System.out.println("String to be encoded muct contain of only lowercase characters");}
					}
				else {
					
					
					Scanner scan=new Scanner(System.in);
					
					System.out.println("Enter the string to decode: ");
					
					String str=in.nextLine();
					
					if(VigenereCipher.isThisLowerCase(str)) {
					
					Scanner deckey1=new Scanner(System.in);
					
					if(VigenereCipher.isThisLowerCase(str)) {
					System.out.println("Enter the key: ");
					String myDecKey=in.nextLine();
					if(VigenereCipher.isThisLowerCase(myDecKey)) {
					String extended1 = VigenereCipher.makeWord(str,myDecKey);
						
						System.out.println(VigenereCipher.decrypt(str,extended1));
						
						}
					
					else {
						System.out.println("Key must consist of only lowercase characters");}
					}
					}
					else {
						System.out.println("String to be decoded must consist of only lowercase characters");
					}
				}
		}
					
				
		
		
			
		else {
			
			System.out.println("Valid options are encode or decode");
		//how to get in red and how to get quotations???
		}
	
	}
	
}
