public class PersegiPanjang extends LuasDanKeliling{//extend untuk deklarasi bahwa kelas persegi panjang anak dari luasdankeliling
    int a, t;//dekalirasi variable
    PersegiPanjang(int a, int t){//inisiasi variable
        this.a = a;
        this.t = t;
    }

    public int luas(){
        return a*t;
    }//logic luas persegipanjang

    public int keliling(){
        return (a*2)+(t*2);
    }//logic keliling persegi panjang
}


