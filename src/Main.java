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
        System.out.println("---------------------------------------------------------------");

        //Valor Unicode de um Caractere
        char letra = 'J';
        char letra1= 'E';
        char letra2= 'A';
        char letra3= 'M';
        char letra4= 'N';
        int valorUnicode= letra;






        System.out.println("o valor Unicode de'"+letra+"'é: " + valorUnicode);
        System.out.println("o valor Unicode de'"+letra1+"'é: "+ valorUnicode);
        System.out.println("o valor Unicode de'"+letra2+"'é: "+ valorUnicode);
        System.out.println("o valor Unicode de'"+letra3+"'é: "+ valorUnicode);
        System.out.println("o valor Unicode de'"+letra4+"'é: "+ valorUnicode);

        System.out.println("-----------------");
        //tipos de boleanos
        int numero = 15;
        boolean maiorQueDez = numero > 10;

        System.out.println("O número " + numero + " é maior que 10? " + maiorQueDez);

        System.out.println("-----------------------------------------------");
        // Usando Arrays
        int[] numeros = {10, 20, 30, 40, 50,70,68};
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Primeiro número: " + numeros[3]);


        System.out.println("Último número: " + numeros[numeros.length - 1]);
        System.out.println("-----------------------------------------------------------------");
        // Calculando a Área de um Retângulo
        double largura = 15.0;
        double altura = 8.0;
        double area = largura * altura;

        System.out.println("A área do retângulo é: " + area);
        System.out.println("--------------------------------------------------------------------");
        // trabalhando Trabalhando com Strings

        String nome= "João";
        int idade= 52;
        double peso= 82.5;
        System.out.println("olá doutor, meu nome é "+ nome+" minha idade é "+ idade + " meu peso atual é " + peso);

        System.out.println("-------------------------------------");
        //Verificando Par ou Ímpar
        int num= 119;
        if (num% 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }



    }
}





















