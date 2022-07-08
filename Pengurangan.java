public class Pengurangan extends Kalkulator{
    double a , b ;//deklarasi variable

    Pengurangan (double a,double b) {//inisiasi variable
        this.a = a;
        this.b = b;
    }
    double kalkulator(){//logic pengurangan
        return a-b;
    }
}
