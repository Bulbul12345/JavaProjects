import java.util.*;
class Operation{
    double a,b,result=0;
    public Operation(double a,double b)
    {
        this.a=a;
        this.b=b;
    }
    public double add()
    {
        result=a+b;
        return result;
    }
    public double Subtact()
    {
        result=a-b;
        return result;
    }
    public double Multiply()
    {
        result=a*b;
        return result;
    }
    public double Divide()
    {
        if(b!=0)
        {
        result=a/b;
        return result;
        }
        else
        {
            System.out.println("Enter non-zero numaric value: ");
            return Double.NaN;
        }

    }
    public double power()
    {
        result=Math.pow(a, b);
        return result;
    }
    public double sqrt()
    {
        result=Math.sqrt(a);
        return result;
    }
}
public class Calculator {
    public static double getvalidNumber(Scanner sc)
    {
         while (true) {
            if(sc.hasNextDouble())
            {
                return sc.nextDouble();
            }
            else{
                System.out.println("Invalid input: ");
                sc.next();
            }

         }
    }
    public static void showHistory(ArrayList<String> history)
    {
        System.out.println("Calculation History: ");
         for (String h : history) {
            System.out.println(h);
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String choice="yes";
        int Menu;
        double result=0;
        ArrayList<String> history=new ArrayList<>();
        while(choice.equalsIgnoreCase("yes"))
        {
       
        System.out.println("1. Addition: ");
        System.out.println("2. Subtraction: ");
        System.out.println("3. Multiplication: ");
        System.out.println("4. Division: ");
        System.out.println("5. Power: ");
        System.out.println("6. Square: ");
        System.out.println("7. show History: ");
        System.out.println("Enter Menu choice: ");
        Menu=sc.nextInt();
        if(Menu==1||Menu==2||Menu==3||Menu==4||Menu==5||Menu==6)
        {
        System.out.println("Enetr first number: ");
        double num1=getvalidNumber(sc);
        System.out.println("Enter 2 number: ");
        double num2=getvalidNumber(sc);
        Operation op=new Operation(num1,num2);
        switch (Menu) {
           case 1:result=op.add();
            System.out.println("Addition "+ result);
                 history.add(num1+"+"+num2+"="+result);break;
           case 2: result=op.Subtact();
                    System.out.println("Subract: "+result);
                    history.add(num1+"-"+num2+"="+result);break;
           case 3:result=op.Multiply();
                 System.out.println("Multiply: "+result);
                 history.add(num1+"*"+num2+"="+result);break;
           case 4: result=op.Divide();
                   System.out.println("divide: "+result);
                    history.add(num1+"/"+num2+"="+result);break;
            case 5:result=op.power();
            System.out.println("power: "+result);
                    history.add(num1+"^"+num2+"="+result);break;
           case 6: result=op.sqrt();
           System.out.println("Square: "+result);
                    history.add(num1+"~"+num2+"="+result);break;
        }
    }
        else if(Menu==7)
        {
            showHistory(history);
        }
        else{
           System.out.println("Invalid option: ");
        }
        
        System.out.println("Do you want to continue: ");
        choice=sc.next(); 
    } 
        }
}


