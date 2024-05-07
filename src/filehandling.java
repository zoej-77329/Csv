import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class filehandling {
    public static void main(String[] args)
    {
        try{
        String name="C:\\Users\\WC\\csp\\src\\email.csv";
        List<String> list= Files.readAllLines(Paths.get(name));


       /*for(String temp:list)
            System.out.println(temp);*/
            boolean loggedin=false;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your first name:");
            String fname=sc.nextLine();
            System.out.println("Enter 4 digit code:");
            String num=sc.nextLine();

            for(String line:list)
            {
                String[] parts=line.split(";");
                if(parts.length>=4)
                {
                    String firstname=parts[2];
                    String  code=parts[1];
                    if(firstname.equals(fname) && code.equals(num))
                    {
                        loggedin=true;
                        break;
                    }
                }
            }
            if(loggedin)
            {
                System.out.println("logged in successfully!...");
            }
            else
            {
                System.out.println("Unable to login .Invalid Firstname or code");
            }

    }
        catch(IOException e){
            System.out.println("Error reading from file" + e.getMessage());
        }
    }



}
