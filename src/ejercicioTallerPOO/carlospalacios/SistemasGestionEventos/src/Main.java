import java.util.Scanner

public class Main {
    public static void main(String[] args) {

        // Crear instancia de Conferencia
        Asistente[] asistentesConferencia = {
                new Asistente("Carlos", "Perez", "carlos.perez@example.com"),
                new Asistente("Ana", "Gomez", "ana.gomez@example.com")
        };

        Persona[] ponentes = {
                new Persona("Juan", "Rodriguez"),
                new Persona("Laura", "Fernandez")
        };

        Conferencia conferencia = new Conferencia(
                "Conferencia de Tecnología",
                "2023-11-01",
                "2023-11-03",
                "Centro de Convenciones",
                200, asistentesConferencia,
                "Inteligencia Artificial",
                ponentes);

        // Crear instancia de Taller
        Asistente[] asistentesTaller = {
                new Asistente("Luis", "Martinez", "luis.martinez@example.com"),
                new Asistente("Maria", "Lopez", "maria.lopez@example.com")
        };

        String[] materialesTaller = {"Laptop", "Cuaderno", "Pluma"};

        Taller taller = new Taller(
                "Taller de Programación",
                "2023-12-01",
                "2023-12-02",
                "Sala de Reuniones",
                30,
                asistentesTaller,
                materialesTaller,
                4
        );

        // Imprimir detalles de los eventos
        System.out.println("Detalles de la Conferencia:");
        System.out.println("Nombre: " + conferencia.getNombre());
        System.out.println("Fecha de Inicio: " + conferencia.getFechaInicio());
        System.out.println("Fecha de Fin: " + conferencia.getFechaFin());
        System.out.println("Lugar: " + conferencia.getLugar());
        System.out.println("Capacidad Máxima: " + conferencia.getCapacidadMaxima());
        System.out.println("Tema: " + conferencia.getTema());

        System.out.println("\nDetalles del Taller:");
        System.out.println("Nombre: " + taller.getNombre());
        System.out.println("Fecha de Inicio: " + taller.getFechaInicio());
        System.out.println("Fecha de Fin: " + taller.getFechaFin());
        System.out.println("Lugar: " + taller.getLugar());
        System.out.println("Capacidad Máxima: " + taller.getCapacidadMaxima());
        System.out.println("Duración: " + taller.getDuracion() + " horas");
        System.out.println("Materiales Necesarios: " + String.join(", ", taller.getMaterialesNecesarios()));

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion = 5;
        while (!salir) {
            System.out.println("****************Menu*************");
            System.out.println("1. Crear evento");
            System.out.println("2. Agregar asistente a un evento");
            System.out.println("3. Mostrar informacion detallada de un evento.");
            System.out.println("4. Buscar eventos por nombre o fecha");
            System.out.println("5. Salir");
            scanner.nextInt();

            // Aqui se haria la logica del menu

            if(opcion > 5 || opcion < 1) {
                throw new IllegalArgumentException("Seleccion invalida");
            } else {
                switch (opcion) {
                    case 1:

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
            }

        }
    }
}
