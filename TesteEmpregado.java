public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Marco",58,1,5000,0,0);
        Empregado empregado2 = new Empregado("Ana",30,2,3000,5,0);
        System.out.println(empregado1.getNome());
        System.out.println(empregado2.getNome());
    }
}
