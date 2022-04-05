/*
El directorio de los clientes de una empresa está organizado en una cadena de texto como la de más abajo,
donde cada línea contiene la información del nombre, email, teléfono, nif, y el descuento que se le aplica.
Las líneas se separan con el carácter de cambio de línea \n y la primera línea contiene los nombres de los campos con la información contenida en el directorio.

"nif;nombre;email;teléfono;descuento\n
01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n
71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n
63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n
98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"

Escribir un programa que genere un HashMap con la información del directorio, donde cada elemento corresponda a un cliente
y tenga por clave su nif y por valor una clase con el resto de la información del cliente.
 */

package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Datos> cliente = new HashMap<>();

        try {
            BufferedReader miArchivo = new BufferedReader(new FileReader(
                    "H:\\Users\\Javier Sánchez\\OneDrive\\1º Grado " +
                            "Superior Desarrollo Aplicaciones Web" +
                            "\\2. Programación\\Clases de apoyo (ordenar)" +
                            "\\EjercicioHashMap4abril\\src\\com\\company\\contenido.txt"));

            String linea = miArchivo.readLine();
            linea = miArchivo.readLine();
            while (linea != null) {
                String[] palabras = linea.split(";");
                int telefono = Integer.parseInt(palabras[3]);
                double descuento = Double.parseDouble(palabras[4]);
                cliente.put(palabras[0], new Datos(palabras[1], palabras[2], telefono, descuento));
                linea = miArchivo.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (String e: cliente.keySet()) {
            int valor = cliente.keySet(e);
            System.out.println(valor);
        }
    }
}

