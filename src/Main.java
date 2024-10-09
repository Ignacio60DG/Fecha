import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Detector de fechas, escribe el día, el mes y el año en ese orden y te dirá si la fecha es correcta");

        Scanner sc = new Scanner(System.in);

        System.out.println("Día:");int dia = sc.nextInt();
        System.out.println("Mes:");int mes = sc.nextInt();
        System.out.println("Año:");int year = sc.nextInt();
        sc.close();

        if (mes == 1 && dia > 0 && dia <= 31 && year <= 2025 && year > 0) {
            System.out.println("Esta fecha está en el mes de enero y es valida");
        }else if (mes == 2 && dia > 0 && dia <= 29 && year <= 2025 && year > 0){
            System.out.println("Esta fecha está e el mes de febrero y es valida");
        }else if (mes == 3 && dia > 0 && dia <= 31 && year <= 2025 && year > 0) {
            System.out.println("Esta fecha está en el mes de marzo y es valida");
        }else if (mes == 4 && dia > 0 && dia <= 30 && year <= 2025 && year > 0){
            System.out.println("Esta fecha está en el mes de abril y es valida");
        }else if (mes == 5 && dia > 0 && dia <= 31 && year <= 2025 && year > 0){
            System.out.println("Esta fecha está en el mes de mayo y es valida");
        }else if (mes == 6 && dia > 0 && dia <= 30 && year <= 2025 && year > 0){
            System.out.println("Esta fecha está en el mes de junio y es valida");
        }else if (mes == 7 && dia > 0 && dia <= 31 && year <= 2025 && year > 0){
            System.out.println("Esta fecha está en el mes de julio y es valida");
        }else if (mes == 8 && dia > 0 && dia <= 31 && year <= 2025 && year > 0){
            System.out.println("Esta fecha está en el mes de agosto y es valida");
        }else if (mes == 9 && dia > 0 && dia <= 30 && year <= 2025 && year > 0){
            System.out.println("Esta fecha está en el mes de septiembre y es valida");
        }else if (mes == 10 && dia > 0 && dia <= 31 && year <= 2025 && year > 0){
            System.out.println("Esta fecha está en el mes de octubre y es valida");
        }else if (mes == 11 && dia > 0 && dia <= 30 && year <= 2025 && year > 0){
            System.out.println("Esta fecha está en el mes de noviembre y es valida");
        }else if (mes == 12 && dia > 0 && dia <= 31 && year <= 2025 && year > 0){
            System.out.println("Esta fecha está en el mes de diciembre y es valida");
        }else{
            System.out.println("Esta fecha no es valida ya sea por los días que no cuadran el mes que tiene que ir de 1 a 12 o el año que solo puede ir desde el 0 d.C hasta el 2025 d.c");
        }
    }
}