public class Perkalian extends Kalkulator{
    double a , b ;//deklarasi variable

    Perkalian (double a,double b) {//inisiasi variable
        this.a = a;
        this.b = b;
    }
    double kalkulator(){
        return a*b;
    }//logic perkalian
}
