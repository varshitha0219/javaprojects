import java.io.FileOutputStream;
class FileOutputStreamExample{
public static void main(String args[]){
try{
FileOutputStream fout=new FileOutputStream("c:\\hp\\textout.txt");
fout.write(65);
fout.flush();
fout.close();
System.out.println("Success..");
}
catch(Exception e){
System.out.println(e);
}
}
}
