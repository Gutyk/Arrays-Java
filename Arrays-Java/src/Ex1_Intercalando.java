import java.util.Scanner;

public class Ex1_Intercalando{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        int VetI[] = new int[10];
        int VetA[] = new int[5];
        int VetB[] = new int[5];
        for(i = 0; i < VetA.length; i++){
            System.out.println("Informe o " + (i+1) + " elemento");
            VetA[i] = input.nextInt();
        }


        for(i = 0; i < VetB.length; i++){
            System.out.println("Informe o " + (i+1) + " elemento");
            VetB[i] = input.nextInt();
        }

        for(i = 0; i < VetA.length; i++){
            VetI[2*i] = VetA[i];
            VetI[2*i+1] = VetB[i];
        }

        System.out.print("VetI[]: ");
        for(i = 0; i < VetI.length; i++){
            if(i < 9){
                System.out.print(VetI[i] + ", ");
            }
            else{
                System.out.print(VetI[i] + ";");
            }
        }


    }
}