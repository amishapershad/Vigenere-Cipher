
public class VigenereCipher {

	
	public static int alphToNum(char s) {
		int base=(int)'a';
		int convertedint= (int) s;
		return convertedint-base;
	}
	
	public static char numToAlph(int mychar) {
		int base1=(int)'a';
		int thischar=mychar+base1;
		char convertedChar= (char) thischar;
		return convertedChar;
	}
	
	public static String makeWord(String myString, String keyword) {
		String myReplicated= "";
		int i=0;
		while(myReplicated.length()< myString.length()) {
			myReplicated+=keyword.charAt(i);
			i++;
			if(i>=keyword.length()) {
				i=0;
			}
			
			
			
	}
		
		return myReplicated;
		
	}
	

	 public static boolean isThisLowerCase(String mystr){
	        
	        
	        char[] myArray = mystr.toCharArray();
	        
	        for(int i=0; i < myArray.length; i++){
	            
	            
	            if(!Character.isLowerCase( myArray[i] ))
	                return false;
	        }
	        
	        return true;
	 
	  }
	 
	 /*
	  *	Referenced 'Java Code examples' while writing isThisLowerString 
	  */
	
	//theKey is the extended key
	public static String encrypt(String s, String theKey) {
		//String extended = makeWord(s,theKey);
		int a;
		s.toCharArray();
		theKey.toCharArray();
		
		StringBuilder ourResult= new StringBuilder();
		
		for(a=0;a<s.length();a++) {
			int converted= alphToNum(s.charAt(a));
			int converted1=alphToNum(theKey.charAt(a));
			
			int encoded= ((converted + converted1)% 26);
			
			char encoded2 = numToAlph(encoded);
			
			ourResult.append(encoded2);
			
			
		}
		
		return ourResult.toString();
	}
	
	
	public static String decrypt(String r, String ourKey) {
		int a;
		r.toCharArray();
		
		StringBuilder originalResult= new StringBuilder();
		
		for(a=0;a<r.length();a++) {
			int decoded;
			int deconverted= alphToNum(r.charAt(a));
			int deconverted1=alphToNum(ourKey.charAt(a));
			if((deconverted-deconverted1)<0) {
			decoded= ((deconverted - deconverted1 + 26)% 26);
			}
			else {
				decoded=(deconverted - deconverted1)% 26;
			}
			char decoded2 = numToAlph(decoded);
			
			originalResult.append(decoded2);
			
			
		}
		
		return originalResult.toString();
		
	}
	
	
	
	
}
