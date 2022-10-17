class Administrativo extends Funcionario {

  public Administrativo (String nome, double Salario){
    super(nome, Salario);
  }

  public double calcularSalario(int diasfaltado, double horaextra) {

    double valorDia = this.salario / 30;
    double valorhora = (this.salario / 30) / 8;
    double descontopordiasfaltados = valorDia * diasfaltado; 
    double totalextra = valorhora*1.5*horaextra;

    double salarioTotal = this.salario + totalextra - descontopordiasfaltados;

    return salarioTotal;
  }
  
}