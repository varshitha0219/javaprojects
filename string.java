class main{
int x = 5;
void show() {
System.out.println(this.x);
}
public static void main(String[] args) {
main d =new main();
main d1=new main();
d.x = d1.x+5;
d.show();
d1.show();
}
}