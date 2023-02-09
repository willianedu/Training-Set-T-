package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;
import entities.TerceirizadoFuncionario;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		 List <Funcionario> list = new ArrayList <>();
		System.out.print("Digite o número de funcionários:");
		 int n = sc.nextInt();
		 
		 for (int i=1 ; i <=n; i++) {
			 System.out.println("Funcionário #" + i + " data:");
			 System.out.print("Terceirado? (y/n)");
			 char x = sc.next().charAt(0);
			 System.out.print("Nome:");
			 sc.nextLine();
			 String nome = sc.nextLine();
			 System.out.print("Horas:");
			 int horas = sc.nextInt();
			 System.out.print("Valor por hora:");
			 double valorPorHora = sc.nextDouble();
			 if (x == 'y') {
				 System.out.print("Taxa adicional:");
				 double taxaAdicional = sc.nextDouble();
				 Funcionario func = new TerceirizadoFuncionario(nome,horas,valorPorHora,taxaAdicional);
				 list.add(func);
			 }
			 else {
				 Funcionario func = new Funcionario(nome,horas,valorPorHora);
				 list.add(func);
			 }
		 }
			 System.out.println();
			 System.out.println("Pagamentos:");
			 for (Funcionario func : list) {
				 System.out.println(func.getNome() + " - $" + func.pagamento());
				 sc.close();
			 }
		 }
	}