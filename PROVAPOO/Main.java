/*1. Faça um programa Orientado a Objetos em Java que calcule o salário do mès de funcionarios em uma Escola e quanto será a folha de pagamento do més. A escola deve solicitar no cadastramento que seja informado o valor do salário base do funcionário, quantos dias este faltou de trabalho, a quantidade de horas extras efetuadas durante. Para os funcionários administrativos considere que o valor descontado por dia de trabalho é calculado sobre o total de 30 dias de trabalho no mês e que o valor da hora extra é 1.5 da hora normal do funcionário (tomando em consideração 30x8 horas mensais). No caso dos professores não existem descontos por causa de faltas, já que estes sempre terão de repor as aulas não ministradas. Além disso, os professores trabalham apenas 12 dias por mês com uma carga horária de 8 horas por dia e o valor da hora extra deles é 2.5 da hora normal.*/


class Main {

  public static void main(String[] args) {

    Administrativo pessoa1 = new Administrativo("Pedro", 1200);
    Professor professor1 = new Professor("Ricardo", 5000);
    Funcionario gerente = new Funcionario("Paulo", 3000);
    
    System.out.println(pessoa1.nome);
    System.out.println(pessoa1.salario);

    System.out.println(pessoa1.calcularSalario(1, 5));

    System.out.println(professor1.nome);
    System.out.println(professor1.salario);
    
    System.out.println(professor1.calcularSalario(10));

    System.out.println(gerente.nome);
    System.out.println(gerente.salario);

    System.out.println(gerente.calcularSalario());

    double totalFolha = pessoa1.calcularSalario(1, 5) + professor1.calcularSalario(10) + gerente.calcularSalario();

    System.out.println("total da folha foi :" + totalFolha);
  }
}