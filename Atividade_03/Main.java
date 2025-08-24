public class Main {
    public static void main(String[] args) {
        Departamento ti = new Departamento("TI");
        Departamento rh = new Departamento("RH");

        Funcionario f1 = new Funcionario("Giovane", 5350.0, ti);
        Funcionario f2 = new Funcionario("Bruno", 4500.0, rh);
        Funcionario f3 = new Funcionario("Max", 9100.0, ti);
        Funcionario f4 = new Funcionario("Maria Clara", 4870.0, rh);
        Funcionario f5 = new Funcionario("Roberto", 3200.0, ti);
        Funcionario f6 = new Funcionario("Fernando", 1700.0, rh);

        ti.adicionarFuncionario(f1);
        ti.adicionarFuncionario(f3);
        ti.adicionarFuncionario(f5);
        rh.adicionarFuncionario(f2);
        rh.adicionarFuncionario(f4);
        rh.adicionarFuncionario(f6);

        ti.listarFuncionarios();
        rh.listarFuncionarios();
    }
}