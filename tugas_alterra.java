import java.util.Scanner;


public class tugas_alterra {
    private static boolean primenumber(int number){ // private boolean yang bernama primenumber
        int i  ; // mengidentifikasi interger bernama i
        boolean primenumber = true ; // membuat status boolean awal sebelum di proses

            for (i = 2; i<=number/2 ; i++){ // untuk i bernilai 2, i lebih kecil sama dengan interger number dibagi 2, i bertambah terus setiap dipanggil
                if (number%i==0) // jika number dibagi i habis maka
                    primenumber = false ; // prime number adalah salah

            }
            return primenumber; // kembali ke kondisi awal primenumber
    }


    private static boolean palindrome(String value){ // private boolean bernama palidrome

        int i = 0, j = value.length() - 1; // i bernilai 0 , j bernilai i dan berkurang ke 1

        while (i < j) { //ketika i lebih kecil daripada j

            if (value.charAt(i) != value.charAt(j)) // jika i tidak sama denga j maka
                return false; // kembali dengan status false

            i++; //i bertambah terus tiap dipanggil
            j--; //j berkurang terus tiap dipanggil
        }
        return true; // kembali dengan status true
    }

    private static void DrawXYZ(int n){ //private class Draw XYZ

        for(int j = 1; j <= n*n; j++){ // untuk interger j bernilai 1, j lebih kecil samadengan n kuadrat, j bertambah terus tiap dipanggil
            if(j % 3 == 0 )  { // jika j habis dibagi 3
                System.out.print("X"); // maka print x
            }
            else if(j % 2 == 0)  {  //jika j habis dibagi 2
                System.out.print("Z"); // maka print z
            }
            else if(j % 2 == 1)  {  //jika j dibagi 2 menghasilkan 1
                System.out.print("Y"); // makan print z
            }
            if(j % n == 0){ //jika j habis dibagi n
                System.out.println(); // makan ganti baris
            }
        }





    }

    private static float Mean(float[] numbers){ // private float bernama mean
        float total = 0; //mengidentifikasi float bernama res yang bernilai 0
        float res = 0; //mengidentifikasi res bernama res yang bernilai 0
        for (float item : numbers) { // untuk float
            total += item; // total bernilai total + item
        }
        res = total / numbers.length; //total dibagi number.length
        return res; // kembali ke res
    }


    public static void main(String[] args) {
        // input no 1
        float alas = 20;
        float tinggi = 25;

        // kode no 1 mengeprint alas dikali tinggi dibagi 2
      System.out.println(alas*tinggi/2 );
        //input no 2
        float studentScore = 80;
        //kode no 2
        if (studentScore >=80){ //jika studenscore diatas samadengan 80 maka
            System.out.println("A");// print A
        } else if (studentScore >= 65) { //jika studenscore diatas samadengan 65 maka
            System.out.println("B+"); // print B+
        } else if (studentScore >= 50) { //jika studenscore diatas samadengan 50 maka
            System.out.println("B"); // print B
        }else if (studentScore >= 35) { //jika studenscore diatas samadengan 35 maka
            System.out.println("C"); // print C
        }else { // jika semua kodisi diatas tidak sesuai
            System.out.println("D"); // print D
        }
        //kode no 3
        //memasukan scanner untuk menerina input dari user
        Scanner a = new Scanner(System. in );
        System.out.println("Masukkan angka"); // print masukan angka
        int nilai = a.nextInt(); //menggunakan scanner berbentuk interger
        System.out.println("Faktor-faktornya:"); //print faktor-faktornya
        int bilangan = 0; //mendefinisikan interger yang bernama bilangan dengan nilai 0
        for (int z = 0; z <= nilai; z++) { // untuk int z bernilai 0, int z lebih kecil samadengan int nilai( yang di input oleh user), dan z bertambah terus setiap dipanggil
            bilangan++ ; // interger bernama bilangan bertambah terus setiap dipangginl
            if (nilai % bilangan == 0) { //jika nilai habis dibagi bilangan maka
                System.out.println(bilangan + " "); // print interger bilangan
            }
        }
        System.out.println("---------------------------"); // untuk pemisah

        //print no 4
        //untuk mengeprint hasil eksekusian prime number
        System.out.println(primenumber(11));
        System.out.println(primenumber(13));
        System.out.println(primenumber(17));
        System.out.println(primenumber(20));
        System.out.println(primenumber(35));

        System.out.println(""); // pemisah
        System.out.println("");

        //print no 5
        // untuk mengeprint hasil eksekusian palindrome
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));

        System.out.println("");
        System.out.println("");

        //print no 6
        //untuk mengeprint hasil eksekusian DrawXYZ
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);


        System.out.println();
        System.out.println();

        //print dan kode no 7
        float[] value ={1,2,3,4}; //objek dari method mean
        System.out.println(Mean(value)); //untuk mengeprint hasil eksekusian mean
    }
}
