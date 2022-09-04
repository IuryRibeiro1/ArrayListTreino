public class Funcionario {

    int id;
    String name;
    double salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(int id, String name, double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem){
        salario = salario + salario * porcentagem / 100;
    }

    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f" , salario);
    }
}
