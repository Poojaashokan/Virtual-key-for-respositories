package iostreams;
import java.io.IOException;
import java.util.Scanner;
public class Filemain {
	
	public static void main(String[] args) throws IOException{
		System.out.println("\nWelcome to our Application  LockedMe.com--> File Handling\n");
		System.out.println("File Handling Application consists of features given below\n1.Displaying the all files in the Directory\n2.Add files to the Existing Directory\n3.Delete Files in the Existing Directory\n4.Search Files in the Existing Directory\n");
		Scanner sc=new Scanner(System.in);
		
		Displayfileex dis=new Displayfileex();
		Createfileex cr=new Createfileex();
		Deletefileex del=new Deletefileex();
		Searchfileex  se=new Searchfileex  ();
		String path="//E:project//";
		
		label:while(true) {
			 System.out.println("Enter your choice\n1.list the files in the Directory\n2.File Operations(Add,Delete,Search)\n3.Close Application ");
			 int choice=sc.nextInt();
			
			 switch(choice) {
			 case 1:dis.display(path);
			        break;
			 case 2:while(true) {
				
				  		System.out.println("Enter Which file operation you want\n1.Add File\n2.Delete File\n3.Search File\n4.Back to Our main choices");
				  		int choice1=sc.nextInt();
				  		
				  		switch(choice1){
				  		case 1:cr.create(path);
				  			   break;
				  		case 2:del.delete(path);
				  			   break;
				  		case 3:se.search(path);
				  			   break;
				  		case 4:continue label;
				  		
				  		}	
				}
			 
			 case 3:System.exit(0);
			        break;
			 default:System.out.println("invalid operation");
			}
		}

	}

}
