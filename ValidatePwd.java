public class ValidatePwd {
	
	char letter;
	boolean isUpper = false;
	
	public static boolean validationMethod(String pwd) {
		
		for(int i=0; i < pwd.length(); i++) {
			
			letter = (char) pwd.charAt(i);
			
			System.out.println(letter);
			
			if(Character.isUpperCase(letter)) {
				isUpper = true;
				break;
				
			}else {
				isUpper = false;
			}
		}
		
		return isUpper;
	}

}
