
package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Numeral n1=new Numeral(10); //10
        Square s1=new Square(n1);   //10 binh phuong
        Numeral n2= new Numeral(-1);
        Numeral n3= new Numeral(2);
        Numeral n4= new Numeral(3);
        Multiplication m1=new Multiplication(n3,n4);
        Addition a1=new Addition(s1,n2);
        Addition a2=new Addition(a1,m1);
        Square s2=new Square(a2);
        System.out.println(s2+"="+s2.evaluate());
        
        Numeral n5= new Numeral(2);
        Numeral n6= new Numeral(0);
        Division d=new Division(n5,n6);
        try{
            d.evaluate();
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
