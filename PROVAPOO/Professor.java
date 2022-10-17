class Professor extends Funcionario {

  public Professor (String nome, double Salario){
    super(nome, Salario);
  }

  public double calcularSalario(double horaextra) {

    double valorhora = (this.salario / 12) / 8;
    double totalextra = valorhora*2.5*horaextra;

    double salarioTotal = this.salario + totalextra;

    return salarioTotal;
  }
  
}