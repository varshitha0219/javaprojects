class Demo 
{
int add(float a,float b)
{
int c = (int)(a+b);
return c;
}
public static void main(String[] args)
{
int d=new Demo().add(12,23);
System.out.println(d);
}
}