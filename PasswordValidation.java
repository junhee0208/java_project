
public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validatePwd validpwd = new validatePwd();
		
		String password = "sfsdffsdTsdf";
		
		if(validpwd.validationMethod(password)) {
			System.out.println("Welcome to the AIS");
		}else {
			System.out.println("Please enter the valid password");
		}
	}
	
	
	

}