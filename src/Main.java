import java.util.Scanner;
public class Main {

    public static Scanner teclado =new Scanner(System.in);
    public static void main(String[] args) {

        int op1 = menu();
        do {
            switch (op1) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;

                case 5:

                    break;
            }

        }while (op1!=4);
    }
    public static int menu() {
        System.out.println("Bienvenido a la sistemas de Altas Escolar");
        System.out.println("seleccione una categoria de su interes.");

        System.out.println("1 - Alta especialidad");
        System.out.println("2 - Alta estudiante");
        System.out.println("3 - Alta Catedratico");
        System.out.println("4 - Alta materia");
        System.out.println("5 - Alta grupo");
        System.out.println("6 - Salir");
        return teclado.nextInt();
    }

    String grupo;
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo){
        this.grupo=grupo;
    }

}
