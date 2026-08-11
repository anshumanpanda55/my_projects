import java.util.Scanner;

class users{
    private int age;
    private String name;

    public void setname(String n){
        name=n;
    }

    public String getname(){
        return name;
    }

    public void setage(int i){
        age=i;
    }

    public int getage(){
        return age;
    }
}

public class modifiers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String a = sc.nextLine();
        users obj = new users();
        obj.setname(a);
        System.out.println("Enter your age");
        int b = sc.nextInt();
        users obj1 = new users();
        obj1.setage(b);
        System.out.println("Your name is: " + obj.getname());
        System.out.println("Your age is: " + obj1.getage());
    }
    }


  




