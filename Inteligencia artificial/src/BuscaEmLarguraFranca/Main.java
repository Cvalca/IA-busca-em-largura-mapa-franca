package BuscaEmLarguraFranca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int partida, chegada;
		Cidade inicio = null, fim = null;
		Scanner sc = new Scanner(System.in);
		Cidade c1 = new Cidade("Paris");
		Cidade c2 = new Cidade("Amiens");
		Cidade c3 = new Cidade("Rouen");
		Cidade c4 = new Cidade("Orleans");
		Cidade c5 = new Cidade("Chalons-en-Champagne");
		Cidade c6 = new Cidade("Lyon");
		Cidade c7 = new Cidade("Lille");
		Cidade c8 = new Cidade("Caen");
		Cidade c9 = new Cidade("Rennes");
		Cidade c10 = new Cidade("Nantes");
		Cidade c11 = new Cidade("Poitiers");
		Cidade c12 = new Cidade("Limoges");
		Cidade c13 = new Cidade("Bordeaux");
		Cidade c14 = new Cidade("Toulouse");
		Cidade c15 = new Cidade("Montpellier");
		Cidade c16 = new Cidade("Besancon");
		Cidade c17 = new Cidade("Strasbourg");
		Cidade c18 = new Cidade("Metz");
		Cidade c19 = new Cidade("Marselha");
		Cidade c20 = new Cidade("Dijon");
		
		
		
		ArrayList<Cidade> c1Conex = new ArrayList<Cidade>();
		c1Conex.add(c3);
		c1Conex.add(c5);
		c1Conex.add(c8);
		c1Conex.add(c4);
		c1Conex.add(c6);
		c1Conex.add(c20);
		c1Conex.add(c2);
		ArrayList<Cidade> c2Conex = new ArrayList<Cidade>();
		c2Conex.add(c3);
		c2Conex.add(c5);
		c2Conex.add(c7);
		ArrayList<Cidade> c3Conex = new ArrayList<Cidade>();
		c3Conex.add(c2);
		c3Conex.add(c1);
		c3Conex.add(c8);
		ArrayList<Cidade> c4Conex = new ArrayList<Cidade>();
		c4Conex.add(c9);
		c4Conex.add(c1);
		ArrayList<Cidade> c5Conex = new ArrayList<Cidade>();
		c5Conex.add(c1);
		c5Conex.add(c2);
		c5Conex.add(c20);
		c5Conex.add(c18);
		ArrayList<Cidade> c6Conex = new ArrayList<Cidade>();
		c6Conex.add(c15);
		c6Conex.add(c19);
		c6Conex.add(c1);
		c6Conex.add(c16);
		ArrayList<Cidade> c7Conex = new ArrayList<Cidade>();
		c7Conex.add(c2);
		ArrayList<Cidade> c8Conex = new ArrayList<Cidade>();
		c8Conex.add(c1);
		c8Conex.add(c3);
		c8Conex.add(c9);
		ArrayList<Cidade> c9Conex = new ArrayList<Cidade>();
		c9Conex.add(c10);
		c9Conex.add(c8);
		c9Conex.add(c4);
		ArrayList<Cidade> c10Conex = new ArrayList<Cidade>();
		c10Conex.add(c11);
		c10Conex.add(c9);
		ArrayList<Cidade> c11Conex = new ArrayList<Cidade>();
		c11Conex.add(c10);
		c11Conex.add(c12);
		ArrayList<Cidade> c12Conex = new ArrayList<Cidade>();
		c12Conex.add(c13);
		c12Conex.add(c11);
		c12Conex.add(c14);
		ArrayList<Cidade> c13Conex = new ArrayList<Cidade>();
		c13Conex.add(c12);
		c13Conex.add(c14);
		ArrayList<Cidade> c14Conex = new ArrayList<Cidade>();
		c14Conex.add(c12);
		c14Conex.add(c13);
		c14Conex.add(c15);
		ArrayList<Cidade> c15Conex = new ArrayList<Cidade>();
		c15Conex.add(c14);
		c15Conex.add(c19);
		c15Conex.add(c6);
		ArrayList<Cidade> c16Conex = new ArrayList<Cidade>();
		c16Conex.add(c20);
		c16Conex.add(c17);
		c16Conex.add(c6);
		ArrayList<Cidade> c17Conex = new ArrayList<Cidade>();
		c17Conex.add(c18);
		c17Conex.add(c16);
		ArrayList<Cidade> c18Conex = new ArrayList<Cidade>();
		c18Conex.add(c5);
		c18Conex.add(c17);
		c18Conex.add(c20);
		ArrayList<Cidade> c19Conex = new ArrayList<Cidade>();
		c19Conex.add(c15);
		c19Conex.add(c6);
		ArrayList<Cidade> c20Conex = new ArrayList<Cidade>();
		c20Conex.add(c18);
		c20Conex.add(c5);
		c20Conex.add(c16);
		c20Conex.add(c1);
		
		c1.setConexoes(c1Conex);
		c2.setConexoes(c2Conex);
		c3.setConexoes(c3Conex);
		c4.setConexoes(c4Conex);
		c5.setConexoes(c5Conex);
		c6.setConexoes(c6Conex);
		c7.setConexoes(c7Conex);
		c8.setConexoes(c8Conex);
		c9.setConexoes(c9Conex);
		c10.setConexoes(c10Conex);
		c11.setConexoes(c11Conex);
		c12.setConexoes(c12Conex);
		c13.setConexoes(c13Conex);
		c14.setConexoes(c14Conex);
		c15.setConexoes(c15Conex);
		c16.setConexoes(c16Conex);
		c17.setConexoes(c17Conex);
		c18.setConexoes(c18Conex);
		c19.setConexoes(c19Conex);
		c20.setConexoes(c20Conex);
		
		
		System.out.println("*****Busca em Largura - Mapa da Franca*****\nSelecione as cidades de partida e chegada dentre as cidades da lista abaixo:\n1.Paris\n"
				+ "2.Amiens\n3.Rouen\n4.Orleans\n5.Chalons-en-Champagne\n6.Lyon\n7.Lille\n8.Caen\n9.Rennes\n10.Nantes\n11.Poitiers\n12.Limoges\n13.Bordeaux\n14.Toulouse\n"
				+ "15.Montpellier\n16.Besancon\n17.Strasbourg\n18.Metz\n19.Marselha\n20.Dijon\n");
		
		do {
			System.out.println("Digite o numero da cidade de partida: ");
			partida = sc.nextInt();
		}while(partida < 1 || partida > 20);
		
		switch (partida) {
		case 1:
			inicio = c1;
			break;
		case 2:
			inicio = c2;
			break;
		case 3:
			inicio = c3;
			break;
		case 4:
			inicio = c4;
			break;
		case 5:
			inicio = c5;
			break;
		case 6:
			inicio = c6;
			break;
		case 7:
			inicio = c7;
			break;
		case 8:
			inicio = c8;
			break;
		case 9:
			inicio = c9;
			break;
		case 10:
			inicio = c10;
			break;
		case 11:
			inicio = c11;
			break;
		case 12:
			inicio = c12;
			break;
		case 13:
			inicio = c13;
			break;
		case 14:
			inicio = c14;
			break;
		case 15:
			inicio = c15;
			break;
		case 16:
			inicio = c16;
			break;
		case 17:
			inicio = c17;
			break;
		case 18:
			inicio = c18;
			break;
		case 19:
			inicio = c19;
			break;
		case 20:
			inicio = c20;
			break;
			
		}
		
		System.out.println();
		
		do {
			System.out.println("Digite o numero da cidade de chegada: ");
			chegada = sc.nextInt();
		}while(chegada < 1 || chegada > 20 || chegada == partida);
		
		switch (chegada) {
		case 1:
			fim = c1;
			break;
		case 2:
			fim = c2;
			break;
		case 3:
			fim = c3;
			break;
		case 4:
			fim = c4;
			break;
		case 5:
			fim = c5;
			break;
		case 6:
			fim = c6;
			break;
		case 7:
			fim = c7;
			break;
		case 8:
			fim = c8;
			break;
		case 9:
			fim = c9;
			break;
		case 10:
			fim = c10;
			break;
		case 11:
			fim = c11;
			break;
		case 12:
			fim = c12;
			break;
		case 13:
			fim = c13;
			break;
		case 14:
			fim = c14;
			break;
		case 15:
			fim = c15;
			break;
		case 16:
			fim = c16;
			break;
		case 17:
			fim = c17;
			break;
		case 18:
			fim = c18;
			break;
		case 19:
			fim = c19;
			break;
		case 20:
			fim = c20;
			break;
			
		}
		System.out.println();
		
		BuscaEmLargura bl = new BuscaEmLargura(inicio, fim);
		bl.principal(1);
	}
}
