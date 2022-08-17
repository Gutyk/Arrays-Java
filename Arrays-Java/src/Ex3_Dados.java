import java.util.Random;

public class Ex3_Dados {
    public static void main(String[] args) {
        Random random = new Random();

        int i;
        int dado[] = new int[10];
        int face[] = new int[6];

        for(i = 0; i < dado.length; i++){
            dado[i] = random.nextInt(6)+1;
            face[dado[i]-1]++;
        }
        System.out.print("Dado: ");
        for(i = 0; i < dado.length; i++){
            if(i < 9){
                System.out.print(dado[i] + ", ");
            }
            else{
                System.out.print(dado[i] + ";");
            }
        }

        System.out.println();

        System.out.print("Face: ");
;        for(i = 0; i < face.length; i++){
            if(i < 5){
                System.out.print(face[i] + ", ");
            }
            else{
                System.out.print(face[i] + ";");
            }

        }


    }
}
