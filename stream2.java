import java.io.FileOutputStream;
class FileOutputStreamExample{
public static void main(String args[]){
String s="hello weuii java";
try{
FileOutputStream fout=new FileOutputStream("C:\Users\bonal_9qyr80g\Desktop\java\testout.txt");
byte[] b =s.getBytes();
fout.write(b);
fout.flush();
fout.close();
System.out.println("Success..");
}
catch(Exception e){
System.out.println(e);
}
}
}
