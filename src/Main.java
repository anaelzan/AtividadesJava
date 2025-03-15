//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Média de Três Números
        int num1 =50;
        int num2 =100;
        int num3 =125;
        int media = (num1+num2+num3)/3;
        double media01 = (num1+num2+num3)/3.0;
        float media02 = (num1+num2+num3)/3.0f;
        long media03 = (num1+num2+num3)/3;

        System.out.println("A média do inteiro é:"+ media);
        System.out.println("A média do número real é:"+ media01);
        System.out.println("A média do número float é:"+ media02);
        System.out.println("A média do número long é:"+ media03);

        System.out.println("---------------------------------------");

        //Declaração de Long
        long distancia = 149600000L;

        System.out.println("A distância da Terra ao Sol é: " + distancia + " km.");


    }
}