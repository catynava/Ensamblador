import java.util.Scanner;
import templates.AsmTemplate;

/**
 * Comandos:
 *   assembler --help str     Muestra las plantillas disponibles
 *   <comando> create         Crea el archivo .asm de la plantilla
 *   exit                     Cierra el programa
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("assembler-gen v1.0");
        System.out.println("escribe 'assembler --help str' para ver el menu de comandos.");

        while (true) {
            System.out.print("assembler> ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                continue;
            }

            // --- SALIR ---
            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
                System.out.println("bye.");
                break;
            }

            // --- MOSTRAR AYUDA ---
            if (input.equalsIgnoreCase("assembler --help str")) {
                HelpCommand.execute();
                continue;
            }

            // --- COMANDO DE PLANTILLA: <comando> create ---
            if (input.toLowerCase().endsWith(" create")) {
                String command = input.substring(0, input.length() - " create".length()).trim();
                AsmTemplate template = TemplateRegistry.findByCommand(command);

                if (template == null) {
                    System.out.println("error: comando desconocido -> '" + command + "'");
                    System.out.println("  usa 'assembler --help str' para ver los comandos disponibles.");
                } else {
                    FileGenerator.generate(template, scanner);
                }
                continue;
            }

            // --- COMANDO NO RECONOCIDO ---
            System.out.println("error: comando no reconocido -> '" + input + "'");
            System.out.println("  usa 'assembler --help str' para ver los comandos disponibles.");
        }

        scanner.close();
    }
}
