class StudentApp
{
int rollNo;
String name;
String branch;
static String collegeName;
public static void main(String[] args)
{
StudentApp varshi=new StudentApp();
StudentApp sathish=new StudentApp();
StudentApp nikhil=new StudentApp();
StudentApp samyu=new StudentApp();

varshi.name="varshi";
varshi.rollNo=123;
varshi.branch="cse";
varshi.collegeName="Spec";
sathish.name="sathish";
sathish.rollNo=133;
sathish.branch="ece";
sathish.collegeName="Spec";
nikhil.name="nikhil";
nikhil.rollNo=143;
nikhil.branch="cse";
nikhil.collegeName="Spec";
samyu.name="samyu";
samyu.rollNo=153;
samyu.branch="ece";
samyu.collegeName="Spec";

System.out.println(varshi.name+" "+varshi.rollNo+" "+varshi.branch+" "+varshi.collegeName);
System.out.println(sathish.name+" "+sathish.rollNo+" "+sathish.branch+" "+sathish.collegeName);
System.out.println(nikhil.name+" "+nikhil.rollNo+" "+nikhil.branch+" "+nikhil.collegeName);
System.out.println(samyu.name+" "+samyu.rollNo+" "+samyu.branch+" "+samyu.collegeName);
}
}
