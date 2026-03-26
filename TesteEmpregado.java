public class TesteEmpregado {
    public static void main(String[] args) {
        String nome = "João";
        String apelido = nome;
        nome = "Maria";
        System.out.println(apelido);
        System.out.println(nome);
        Empregado empregado1 = new Empregado("Marco",58,1,5000,0,0);
        Empregado empregado2 = empregado1;
        empregado2.setNome("Ana");
        System.out.println(empregado1.getNome());
        System.out.println(empregado2.getNome());
    }
}
