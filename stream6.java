import java.io.FileOutputStream;
class FileOutputStreamExample{
public static void main(String args[]){
try
{
FileOutputStream FileOutputStream =new FileOutputStream("c:\\hp\\textout.txt");

String msg ="welcome to java";
byte byteArray[]=msg.getBytes();
FileOutputStream.write(byteArray);
System.out.println("welcome to java");
}
catch(Exception e)
{
System.out.println(e);


}
}
}