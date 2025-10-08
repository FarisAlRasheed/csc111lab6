import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter User Login");
		String username = input.next();
		System.out.println("Enter User Password");
		String password = input.next();
		
		if(username.equalsIgnoreCase("csc111") && password.equals("CCIS123")){
			System.out.println("Login is correct.");
		}
		else{
			System.out.println("Either login ID or password is wrong.");
		}
		
	}

}
