import java.io.FileIutputStream;
class FileIutputStreamExample{
public static void main(String args[]){
try
{
FileIutputStream FileIutputStream =new FileIutputStream("c:\\hp\\textout.txt");

String msg ="welcome to java";
byte byteArray[]=msg.getBytes();
FileIutputStream.read(byteArray);
System.out.println("welcome to java");
}
catch(Exception e)
{
System.out.println(e);


}
}
}c