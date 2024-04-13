interface Fun{
public void draw();
}
class lambdaExpressionExample{
public static void main(String [] args){
int width=5;
Fun d=new Fun(){
public void draw(){
System.out.println("Fun"+width);
}
};
d.draw();
}
0
};                                                                                                                                                                             