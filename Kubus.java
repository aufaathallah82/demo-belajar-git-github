public class Kubus extends Volume{
    double a;//deklarasi variable

    Kubus(double a) {//inisiasi variable
        this.a = a;

    }

    double volume(){
        return a*a*a;
    }//logic volume kubus
}

