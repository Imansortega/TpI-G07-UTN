package com.tp2.incidentes.vistas;

import java.util.Scanner;

import com.tp2.incidentes.controllers.AltaIncidente;
import com.tp2.incidentes.controllers.VerDatosCliente;
import com.tp2.incidentes.controllers.VerDatosTecnico;
import com.tp2.incidentes.modelos.Incidente;

public class MenuOperadorMesa {

	public void elMenuDeOperador() {
		Scanner scanner = new Scanner(System.in);
		AltaIncidente miAltaIncidente = new AltaIncidente();
		VerDatosCliente miVistaDatosCliente = new VerDatosCliente();
		VerDatosTecnico datosTecnico = new VerDatosTecnico();

		Incidente incidente = new Incidente(2, 777, 999, "Internet", "No importa", "2023-11-30", "2023-11-30", true);

		int opcion;

		do {
			System.out.println("\n\n******* Menu Operadores Mesa de Ayuda *******");
			System.out.println("Menú:\n1. Ver datos del cliente\n2. Ver lista de técnicos\n3. Alta de incidente\n4. "
					+ "Cierre Incidente\n5. Salir");
			System.out.println("*********************************************");
			System.out.print("\nSeleccione una opción: ---> ");

			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				miVistaDatosCliente.datosCliente();
				System.out.println("Presion una tecla para continuar...");
				scanner.nextLine();
				scanner.nextLine();
				break;
			case 2:
				datosTecnico.datosTecnico();
				scanner.nextLine();
				scanner.nextLine();
				break;
			case 3:
				datosTecnico.datosTecnico();
				miAltaIncidente.altaDeUnIncidente(incidente);
				break;
			case 4:
				break;
			case 5:
				System.out.println("\n1Saliendo del programa. ¡Hasta luego!\n");
				break;
			default:
				System.out.println("Opción no válida. Por favor, seleccione una opción válida.\n2");
			}

			System.out.println("\n\n");

		} while (opcion != 5);

		// scanner.close(); //<---- No lo cierrro para habilitar menú principal. Ver !!!

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
