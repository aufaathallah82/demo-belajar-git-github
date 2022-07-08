public class Pembagian extends Kalkulator{
    double a , b ;//deklarasi variable

    Pembagian (double a,double b) {//inisiasi variable
        this.a = a;
        this.b = b;
    }
    double kalkulator(){
        return a/b;
    }//logic pembagian
}
