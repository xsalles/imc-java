import javax.swing.JOptionPane;

public class imcJOPTION {
    public static void main(String[] args) {
        double imc, peso, altura;
        String aux1, aux2, genero;

        aux1 = JOptionPane.showInputDialog("Qual a sua altura (Digite com ponto, EX: 1.90)?");
        altura = Double.parseDouble(aux1);

        aux2 = JOptionPane.showInputDialog("Qual o seu peso?");
        peso = Double.parseDouble(aux2);

        imc = peso / (altura * altura);

        genero = JOptionPane.showInputDialog("O seu gênero é masculino ou feminino?");
        genero.toLowerCase();


        switch (genero) {
            case "masculino":
                if (imc > 43.0)
                    JOptionPane.showMessageDialog(null, "\nObesidade Mórbida");
                else if (imc >= 30 && imc <= 42.9)
                    JOptionPane.showMessageDialog(null, "\nObesidade Moderada");
                else if (imc >= 25 && imc <= 29.9)
                    JOptionPane.showMessageDialog(null, "\nObesidade Leve");
                else if (imc >= 20 && imc <= 24.9)
                    JOptionPane.showMessageDialog(null, "\nNormal");
                else if (imc < 20)
                    JOptionPane.showMessageDialog(null, "\nAbaixo do Normal");
                break;
            case "feminino":
                if (imc > 39)
                    JOptionPane.showMessageDialog(null, "\nObesidade mórbida");
                else if (imc >= 30 && imc <= 38.9)
                    JOptionPane.showMessageDialog(null, "\nObesidade Moderada");
                else if (imc >= 24 && imc <= 28.9)
                    JOptionPane.showMessageDialog(null, "\nObesidade Leve");
                else if (imc >= 19 && imc <= 23.9)
                    JOptionPane.showMessageDialog(null, "Normal");
                else if (imc < 19)
                    JOptionPane.showMessageDialog(null, "\nAbaixo do normal");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Gênero não reconhecido");

        }

    }
}
