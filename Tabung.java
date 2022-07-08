public class Tabung extends Volume{

    double r , t ;//deklarasi variable

    Tabung (double r,double t) {//inisiasi variable
        this.r = r;
        this.t = t;
    }
    double volume(){
        return 3.14*r*r*t;
    }//logic volume tabung
}

