package inheritance;
class A{
    int a;
    int b;
    double c;
    public A(){            // no argument constuctor
        a=1;
        b=2;
        c=3.0;
    }
    public A(int a,int b){ // parameterized constuctor
        this.a=a;
        this.b=b;
    }
    public A(int a,int b, double c){ // parameterized constuctor
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public String toString(){
        return "A:"+a+" B:"+b+" c:"+c;
    }
}
public class constructor {

    public static void main(String args[]){

        A obj1=new A();
        A obj2=new A(5467,7457);
        A obj3=new A(6543,63461,23.325);

        System.out.println(obj1.toString());

        System.out.println(obj2.toString());

        System.out.println(obj3.toString());
    }
}
