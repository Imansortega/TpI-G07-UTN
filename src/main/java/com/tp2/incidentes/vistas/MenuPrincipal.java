package com.tp2.incidentes.vistas;

import java.util.Scanner;

import com.tp2.incidentes.controllers.*;

public class MenuPrincipal {

	public void elMenu() {
		Scanner mainScanner = new Scanner(System.in);
		MenuOperadorMesa miMenuOperadorMesa = new MenuOperadorMesa();
		MenuRrhh miMenuRrhh = new MenuRrhh();
		int opcion;

		do {
			
			System.out.println("*********** Menu Principal ***********");
			System.out.println("Elija su perfil:\n1. Operador\n2. Tecnico\n3. " + "Empleado RRHH\n4. Salir");
			System.out.println("**************************************");
			System.out.print("Seleccione una opción: ---> ");

			opcion = mainScanner.nextInt();

			switch (opcion) {
			case 1:
				// System.out.printf("1\n");
				// cls();
				miMenuOperadorMesa.elMenuDeOperador(mainScanner);
				break;
			case 2:
				// System.out.printf("2\n");
				// cls();

				break;
			case 3:
				// System.out.printf("3\n");
				miMenuRrhh.elMenuDeRrhh(mainScanner);
				cls();
				break;
			case 4:
				System.out.println("Saliendo del programa. ¡Hasta luego!\n");
				break;
			default:
				System.out.println("Opción no válida. Por favor, seleccione una opción válida.\n2");
			}

			System.out.println("\n\n");

		} while (opcion != 4);

		mainScanner.close();

	}

	public void cls() {

		limpiarConsola();
		// System.out.println("¡Consola limpia!");
	}

	public static void limpiarConsola() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (final Exception e) {
			System.out.println("No se pudo limpiar la consola: " + e.getMessage());
		}
	}

}
