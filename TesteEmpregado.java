import java.util.ArrayList;
import java.util.Arrays;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Marco",58,1,5000,0,0,"M");
        Empregado empregado2 = new Empregado("Ana",30,2,3000,5,0,"F");
        Empregado empregado3 = new Empregado("João",25,3,10000,1,5000,"m");
        ArrayList<Empregado> empregados = new ArrayList<>(Arrays.asList(empregado1, empregado2, empregado3));
        ArrayList<Empregado> empregados2 = empregados;
        Empregado empregado4 = new Empregado("Carlos",45,2,6000,5,0,"M");
        empregados.add(empregado4);
        for (Empregado empregado : empregados2) {
            System.out.println("Nome: " + empregado.getNome());
            System.out.println("Salário: " + empregado.calcularSalario());
            System.out.println();
        }
    }
}
