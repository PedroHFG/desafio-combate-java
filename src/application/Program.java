package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		Champion champion_1 = new Champion(name, life, attack, armor);
		
		sc.nextLine();
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		Champion champion_2 = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.print("Quantos turnos deseja executar? ");
		int turnQuantity = sc.nextInt();
		
		for (int i = 0; i < turnQuantity; i++) {
			champion_1.takeDamage(champion_2);
			champion_2.takeDamage(champion_1);
			
			System.out.println();
			System.out.printf("Resultado do turno %d:%n", i + 1);
			System.out.println(champion_1.status());
			System.out.println(champion_2.status());
			
			if (champion_1.getLife() == 0 || champion_2.getLife() == 0) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();

	}

}
