package week2.task2;

//import week2.task1.Task1;


public class Fraction {

    // TODO: khai báo các thuộc tính
    int numerator;
    int denominator;

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator=numerator;
        this.denominator=denominator;
    }
    
    /*public Fraction simply(Fraction x){
        int i=Task1.gcd(x.numerator,x.denominator);
        Fraction s=new Fraction(x.numerator,this.denominator);
        s.numerator=x.numerator/i;
        s.denominator=x.denominator/i;
        return s;
    }*/
    
    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction x=new Fraction(this.numerator,this.denominator);
        if(x.denominator==other.denominator) {
            x.numerator+=other.numerator;
        }
        else{
            x.numerator=x.numerator*other.denominator+other.numerator*x.denominator;
            x.denominator*=other.denominator;
            
        }
		return x;
        //return simply(x);
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction x=new Fraction(this.numerator,this.denominator);
        if(x.denominator==other.denominator) {
            x.numerator-=other.numerator;
        }
        else{
            
            x.numerator=x.numerator*other.denominator-other.numerator*x.denominator;
            x.denominator*=other.denominator;
        }
		return x;
        //return simply(x);
        
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction x=new Fraction(this.numerator,this.denominator);
        x.numerator*=other.numerator;
        x.denominator*=other.denominator;
		return x;
        //return simply(x);
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction x=new Fraction(this.numerator,this.denominator);
        Fraction o=new Fraction(other.denominator,other.numerator);
		return x.multiply(o);
        //return simply(x.multiply(o));
    }
    
    public boolean equals(Object obj){
		if(this.numerator/((Fraction)obj).numerator==this.denominator/((Fraction)obj).denominator) return true;
		else return false;
        //return simply(this).numerator==simply((Fraction) obj).numerator&&simply(this).denominator==simply((Fraction) obj).denominator;
    }
    /*public static void main(String[] args) {
       Fraction f=new Fraction(1,2);
       Fraction other = new Fraction(3,4);
       System.out.println("ADD: "+f.add(other).numerator+'/'+f.add(other).denominator);
       System.out.println("subtract: "+f.subtract(other).numerator+'/'+f.subtract(other).denominator);
       System.out.println("Multiply: "+f.multiply(other).numerator+'/'+f.multiply(other).denominator);
       System.out.println("Divide: "+f.divide(other).numerator+'/'+f.divide(other).denominator);
    }*/
}