

public class test {
    private static int checkPrime (int number){
        int i  ;

        for (i = 2; i<=number/2 ; i++){
            if (number%i==0)
                System.out.println("tidak");
            else{
                System.out.println("ya");

            }
        } return number ;

    }
    public static void main (String[]args) {
        System.out.println(checkPrime(4));
    }
}