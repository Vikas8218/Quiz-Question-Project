package Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
		 private static int marks;
		 private static final String url ="jdbc:mysql://127.0.0.1:3306/Quiz";
		 private  static final String user ="root";
		 private  static final String pass ="vikas1234";
		 static Scanner sc =new Scanner(System.in);
		 private static   Connection conn;
		 public static void java() {
			try {
				conn =DriverManager.getConnection(url,user,pass);
				String sql ="Select * from Corejava";
				PreparedStatement pst =conn.prepareStatement(sql);
				ResultSet rs =pst.executeQuery();
					 while(rs.next()) {
			                System.out.println("\n"+rs.getInt(1)+" "+rs.getString(2));
			                System.out.println("1. "+rs.getString(3));
			                System.out.println("2. "+rs.getString(4));
			                System.out.println("3. "+rs.getString(5));
			                System.out.println("4. "+rs.getString(6));
			                System.out.print("\nYour Answer : ");
			                int ans = sc.nextInt();
			                if(ans==rs.getInt(7))
			                    marks++;
			            }
			            System.out.println("Your Score : "+marks+" Out of 6\n");
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		public static void main(String[] args) {
			System.out.println("********Quiz Application*******");
			System.out.println("1. JAVA");
			System.out.println("2.DSA");
			System.out.println("3.DBMS");
			System.out.println("4.advaned JAVA");
			System.out.println("Exit");
			System.out.println("Your choice :");
			int choice =sc.nextInt();
			switch(choice) {
			case 1 :
				java();
				break;
			case 2 :
				break;
			case 3 :
				break;
			case 4 :
				break ;
			case 5 :
				System.exit(0);
				break;
				default :
					System.out.println("Wrong Choice in student!!!");
				
		}
	}	 
}
