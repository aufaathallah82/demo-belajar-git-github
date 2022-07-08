public class Balok extends Volume{
    double a , b, c;//deklarasi variable

    Balok(double a,double b,double c) {//inisiasi variable
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double volume(){
        return a*b*c;
    }//logic volume balok
}
