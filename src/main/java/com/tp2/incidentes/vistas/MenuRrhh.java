package com.tp2.incidentes.vistas;

import java.util.Scanner;

import com.tp2.incidentes.controllers.VerDatosCliente;
import com.tp2.incidentes.controllers.VerDatosTecnico;

public class MenuRrhh {
	public void elMenuDeRrhh(Scanner scanner) {
		//Scanner rrhhScanner = new Scanner(System.in);
		VerDatosCliente miVistaDatosCliente = new VerDatosCliente();
		VerDatosTecnico datosTecnico = new VerDatosTecnico();

		int opcion;

		do {
			System.out.println("\n\n******* Menu area RRHH *******");
			System.out.println("Menú:\n1. Ver datos del cliente\n2. Ver lista de técnicos\n"
					+ "3. Alta de técnico\n4. Reporte Incidentes\n5. Salir");
			System.out.println("*********************************************");
			System.out.print("\nSeleccione una opción: ---> ");

			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				miVistaDatosCliente.datosCliente();
				System.out.println("Presione una tecla para continuar...");
				scanner.nextLine();
				scanner.nextLine();
				break;
			case 2:
				datosTecnico.datosTecnico();
				System.out.println("Presione una tecla para continuar...");
				scanner.nextLine();
				scanner.nextLine();
				break;
			case 3:			
				break;
			case 4:
				break;
			case 5:
				System.out.println("\n\nSaliendo del programa. ¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida. Por favor, seleccione una opción válida.\n2");
			}

			System.out.println("\n\n");

		} while (opcion != 5);

		//rrhhScanner.close(); //<---- No lo cierrro para habilitar menú principal. Ver !!!

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
