package Simple.Bank;
/*@Ganesha c
 * java program to checking username , password , phone number, and email from user to check those valid or not 
 * user name,password,phone number and email will display in sign up success */
import java.util.Scanner;
import static java.lang.System.*;
public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bs=new Scanner(System.in);
		data_validations dv=new data_validations();
		out.println("Enter Username");
		String username=bs.next();
	
		try {
			if(dv.checkUsername(username)) {//checking username 
			
				out.println("Enter Password");
				String password=bs.next();
					try {
						if(dv.checkPassword(password))//checking password
						{ 
							try
							{
								out.println("enter the number :");
								String num=bs.next();
								if(dv.checkPhonumber(num))// checking phone number
								{
									try
									{
										out.println("enter the email:");
										String email=bs.next();
										if(dv.checkEmail(email))//checking mail id
										{										
						              	try
						                	{
							                 if(dv.logincheck(username, password)) //checking for signup
							                  {//checking for login
							                  	out.println("SingUp Success");
							                  	out.println("UserName:- "+username);
							                  	out.println("Password:- "+password);
							                  	out.println("phone number:- "+num);
							                  	out.println("mail id:- "+email);
							 	
							                    }
						                       }
						                 catch(Exception e) 
						                {
								        out.println(e.getMessage());
							           }
						             }
					               }
					            catch(Exception e) {
						        out.println(e.getMessage());
					           }				
			                 }
			
		                  }
		                 catch(Exception e) {
			            out.println(e.getMessage());
		                 }
						}
					}
		           catch(Exception e) {
					out.println(e.getMessage());
				}

	}
			}catch(Exception e) {
				out.println(e.getMessage());
			}
		bs.close();//close scanner
	}
}
			
	
