import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "Hola!! grupo · 32");
        
        String nombre = JOptionPane.showInputDialog("Escriba su nombre..");
        JOptionPane.showMessageDialog(null, "Nombre .: " + nombre + " :.");

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite numero_2"));

        JOptionPane.showMessageDialog(null, "n1=" + n1 + " n2=" + n2);
        JOptionPane.showMessageDialog(null, "La suma es: " + (n1 + n2));
        JOptionPane.showMessageDialog(null, "La resta es: " + (n1 - n2));
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + (n1 * n2));
        JOptionPane.showMessageDialog(null, "La division es: " + (n1 / n2));
    }
}
