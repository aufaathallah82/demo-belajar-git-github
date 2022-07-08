public class OngkirBarang {

    public float hitungDimensi(float a, float b, float c, float d) {
        float beratdandimensiMin = 50; //cm3 per kg
        int hargaMin = 5000; //Rp

        float res = a * b * c * d;//logic perkalian dimensi dan berat


        if (res <= beratdandimensiMin) {//bila res lebih kecil samadengan beratdandimensimin maka
            System.out.println(hargaMin);//print hargamin
        } else {//bila tidak maka
            System.out.println("tidak menerima order");//print tidak menerima orader
        }
        return 0;
    }
}

