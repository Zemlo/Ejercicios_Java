/*
1.- Tenemos la clase abstracta Persona. Dicha clase tiene un identificador que será una cadena de caracteres que corresponderá con NIF de la persona.
Dicha clase tendrá un método que será obtenerEstadoCivil(). (2 Puntos)
•	Tenemos la clase Asalariado que hereda de Persona. Tendrá los siguientes atributos nombre, apellidos, edad y salario.
•	Tenemos la clase PersonalAdmvo que hereda de la clase Asalariado. Tendrá un atributo que puesto. Y los métodos getter y setter de dichos atributos.
•	Tenemos la clase Porfesor que hereda de la clase Persona donde tendrá un atributo que se llamará departamento. Y los métodos getter y setter de dicho atributo.
•	Tenemos la clase ProfesorTitular que hereda de Profesor y que tiene como atributo materia que será la asignatura de la que es titular. Y los métodos getter y setter de dichos atributos.
•	Tenemos la clase ProfesorInterino que hereda de Profesor y que tiene 2 atributos con el tiempo que lleva trabajando para la administración (años y meses). Y los métodos getter
y setter de dichos atributos.
•	Tenemos una clase Voluntario que hereda de la clase Persona y que tendrá 3 atributos nombre, apellidos y edad. Y los métodos getter y setter de dichos atributos.
•	Tenemos la clase VoluntarioMiembro que hereda de la clase Voluntario y que tendrá el atributo identificadorMiembro. Este atributo será un entero y unívoco para cada miembro.
•	Por último tenemos la clase VoluntarioExterno que hereda de la clase Voluntario y que tendrá el atributo el identificadorExterno. Este atributo será un entero y unívoco para cada miembro.

Crear todos los constructores inicializándolos con el valor de los atributos y considerando que dichos atributos están encapsulados.
 */


package com.company;

public class Main {

    public static void main(String[] args) {
        Asalariado asalariado = new Asalariado("15968524L", "Ana", "Martínez Santana", 28, 1457.72);

        System.out.println(asalariado);
    }
}
