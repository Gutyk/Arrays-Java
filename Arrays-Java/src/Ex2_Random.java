import java.util.Random;
import java.util.Scanner;


public class Ex2_Random {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random r = new Random();

        int i, value;
        int VetX[] = new int[5];


        value = r.nextInt(3);


        for (i = 0; i < VetX.length; i++){
            System.out.println("Digite um valor de 0 a 100: ");
            VetX[i] = input.nextInt();

            if (VetX[i] <= 0 || VetX[i] >= 100){
                System.out.println("Erro");
                System.exit(0);
            }
        }

        value = 2;

        if(value == 0){
            System.out.println("End Program");
            System.exit(0);
        }
        else if (value == 1) {
            System.out.print("Array[]: ");
            for (i = 0; i < VetX.length; i++) {
                System.out.print(VetX[i]);
                if (i < 4) {
                    System.out.print(", ");
                } else {
                    System.out.print(";");
                }
            }
        }
        else{
            System.out.print("Array invertida[]: ");
            for(i = 4; i >= 0; i--){
                if(i > 0){
                    System.out.print(VetX[i] + ", ");
                }
                else{
                    System.out.print(VetX[i] + ";");
                }
            }
        }
    }
}
