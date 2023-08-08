package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			Set<Aluno> set = new HashSet<>();
			System.out.print("How many students for course A?");
			int a = sc.nextInt();
			for (int i = 0; i < a; i++) {
				Long id = sc.nextLong();
				set.add(new Aluno(id));
			}
			System.out.print("How many students for course B?");
			int b = sc.nextInt();
			for (int i = 0; i < b; i++) {
				Long id = sc.nextLong();
				set.add(new Aluno(id));
			}
			System.out.print("How many students for course C?");
			int c = sc.nextInt();
			for (int i = 0; i < c; i++) {
				Long id = sc.nextLong();
				set.add(new Aluno(id));
			}
			System.out.println("Total students: " + set.size());
		} catch (RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

	}

}