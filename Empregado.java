public class Empregado {
    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;
    private String sexo;

    public Empregado(String nome, int idade, int tipo, double salario, double comissao, double bonus, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.salario = salario;
        this.comissao = comissao;
        this.bonus = bonus;
        this.sexo = sexo;
    }

    public double calcularSalario() {
        if (tipo == 1) {
            return salario;
        } else if (tipo == 2) {
            return salario + salario * comissao;
        } else if (tipo == 3) {
            return salario + bonus;
        } else {
            return 0;
        }


    }



    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}