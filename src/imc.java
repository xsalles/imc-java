import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imc, peso, altura;
        String genero;

        System.out.println("\nDigite o valor da sua altura");
        altura = sc.nextDouble();

        System.out.println("\nDigite o valor do seu peso");
        peso = sc.nextDouble();

        imc = peso / (Math.pow(altura, altura));

        System.out.println("O seu sexo é masculino ou feminino?");
        genero = sc.next();
        genero.toLowerCase();


        if(genero.equals("masculino")) {
           if (imc > 43.0) System.out.println("\nObesidade Mórbida");
           else if (imc >= 30 && imc <= 42.9) System.out.println("\nObesidade Moderada");
           else if (imc >= 25 && imc <= 29.9) System.out.println("\nObesidade Leve");
           else if (imc >= 20 && imc <= 24.9) System.out.println("\nNormal");
           else if (imc < 20) System.out.println("\nAbaixo do Normal");
        } else if (genero.equals("feminino")){
           if (imc > 39) System.out.println("\nObesidade mórbida");
           else if (imc >= 30 && imc <= 38.9) System.out.println("\nObesidade Moderada");
           else if (imc >= 24 && imc <= 28.9) System.out.println("\nObesidade Leve");
           else if (imc >= 19 && imc <= 23.9) System.out.println("\nNormal");
           else if (imc < 19) System.out.println("\nAbaixo do normal");
        }
        
        sc.close();
    }
}
