

public class Tugas_Alterra_OOP {

    public static void main(String[] args) {
        //menginisiasi kelas persegi segitiga dan persegipanjang no 1
        Persegi kotak = new Persegi(4);
        Segitiga segi3 = new Segitiga(3,4);
        PersegiPanjang segipanjang = new PersegiPanjang(7,8);

        //menginisiasi kelas kubus balok dan tabung no 2
        Kubus box = new Kubus(10);
        Balok boxpanjang = new Balok (3,6,10);
        Tabung gentong = new Tabung(7,10);

        //menginisiasi kelas penjumlahan pengurangan perkalian dan pembagian no 3
        Penjumlahan tambah = new Penjumlahan(3,4);
        Pengurangan kurang = new Pengurangan(15,4);
        Perkalian kali = new Perkalian(10,10);
        Pembagian bagi = new Pembagian(12,3);

        //menginisiasi kelas ongkirbarang no 4
        OngkirBarang onkir = new OngkirBarang();


        //print luas soal no 1
        System.out.println("Luas");
        System.out.println("Persegi         "+kotak.titik2()+kotak.luas());
        System.out.println("Segitiga        "+segi3.titik2()+segi3.luas());
        System.out.println("Persegi Panjang :"+segipanjang.titik2()+segipanjang.luas());

        System.out.println();

        //print keliling soal no 1
        System.out.println("Keliling");
        System.out.println("Persegi         :"+kotak.titik2()+kotak.keliling());
        System.out.println("Segitiga        :"+segi3.titik2()+segi3.keliling());
        System.out.println("Persegi Panjang :"+segipanjang.titik2()+segipanjang.keliling());

        System.out.println();

        //print soal no 2
        System.out.println("Volume");
        System.out.println("Kubus  :"+box.volume());
        System.out.println("Balok  :"+boxpanjang.volume());
        System.out.println("Tabung :"+gentong.volume());

        System.out.println();

        //print soal no 3
        System.out.println("Penjumlahan :"+tambah.kalkulator());
        System.out.println("Pengurangan :"+kurang.kalkulator());
        System.out.println("Perkalian   :"+kali.kalkulator());
        System.out.println("Pembagian   :"+bagi.kalkulator());

        System.out.println();

        //print soal no 4
        System.out.println(onkir.hitungDimensi(5,4,2,1));

    }
}