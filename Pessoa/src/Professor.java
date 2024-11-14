public class Professor extends Pessoa{
    private  String especialidade;
    private double salario;
    private float aum;

    public void receberAum(float aum){
        setSalario(getSalario() + aum);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
