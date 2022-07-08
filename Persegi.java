public class Persegi extends LuasDanKeliling{//extend untuk deklarasi bahwa kelas persegi anak dari luasdankeliling
        int a;//dekalirasi variable
        Persegi(int a){
            this.a = a;
        }//inisiasi variable

        public int luas(){
            return a*a;
        }//logic luas persegi

        public int keliling(){
            return a*4;
        }//logic keliling persegi
}
