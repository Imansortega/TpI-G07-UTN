package com.tp2.incidentes.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validador {
	
	// Valida que solo haya caracteres alfabéticos
	public static boolean validarTextInputs(String query) {
        // Expresión regular para validar solo caracteres alfabéticos
        String expRegSoloLetras = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ' ]+$";

        // Utilizar Pattern y Matcher para realizar la validación
        Pattern pattern = Pattern.compile(expRegSoloLetras);
        Matcher matcher = pattern.matcher(query);

        // Devolver true si hay match, de lo contrario, false
        return matcher.matches();
    }

}
