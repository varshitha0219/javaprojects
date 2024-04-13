class Demo{
void fun()
{
System.out.println("my name is varshitha");
}
static void fun2(){
System.out.println("my rollnum is 423");
}
}
class Person{
public static void main(String args[]){
Demo obj=new Demo();
obj.fun();
Demo.fun2();
}
}