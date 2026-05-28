public class Operation {
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

