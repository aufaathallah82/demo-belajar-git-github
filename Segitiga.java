public class Segitiga extends LuasDanKeliling{//extend untuk deklarasi bahwa kelas persegi anak dari luasdankeliling
    int a, t;//deklarasi variable
    Segitiga(int a, int t){//inisiasi variable
        this.a = a;
        this.t = t;
    }

    public int luas(){//logic luas segitiga
        return a*t/2;
    }

    public int keliling(){//logic keliling segitiga
        return a*t;
    }
}
