import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import templates.AsmTemplate;

/**
 * Se encarga de crear el archivo .asm y guardarlo en la carpeta
 */
public class FileGenerator {

    //  CARPETA DE DESTINO
    private static final String OUTPUT_FOLDER =
        "C:\\Users\\catyf\\OneDrive\\Escritorio\\Programas\\Notas";

    /**
     * Genera el archivo .asm de la plantilla elegida
     */
    public static void generate(AsmTemplate template, Scanner scanner) {
        // Crear la carpeta si no existe
        File folder = new File(OUTPUT_FOLDER);
        if (!folder.exists()) {
            boolean created = folder.mkdirs();
            if (!created) {
                System.out.println("error: no se pudo crear la carpeta de destino:");
                System.out.println("  " + OUTPUT_FOLDER);
                System.out.println("verifica que la ruta sea correcta y tengas permisos.");
                return;
            }
        }

        // Nombre del archivo con extensión .asm
        String baseName = template.getFileName();
        File outputFile = new File(folder, baseName + ".asm");

        // Si ya existe preguntar si quiere guardarla con otro nombre
        if (outputFile.exists()) {
            System.out.println("warning: el archivo ya existe -> " + outputFile.getAbsolutePath());
            System.out.print("  ¿deseas guardarlo con un nombre diferente? (s/n): ");
            String respuesta = scanner.nextLine().trim();

            if (respuesta.equalsIgnoreCase("s")) {
                String nuevoNombre = "";
                while (nuevoNombre.isEmpty()) {
                    System.out.print("  ingresa el nuevo nombre (sin extension): ");
                    nuevoNombre = scanner.nextLine().trim();
                    if (nuevoNombre.isEmpty()) {
                        System.out.println("  el nombre no puede estar vacio.");
                    }
                }
                outputFile = new File(folder, nuevoNombre + ".asm");
                if (outputFile.exists()) {
                    System.out.println("  warning: ese nombre tampoco esta disponible, se sobreescribira.");
                }
            } else {
                System.out.println("  operacion cancelada.");
                return;
            }
        }

        // Escribir el contenido
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(template.getContent());
            System.out.println();
            System.out.println("  created -> " + outputFile.getAbsolutePath());
            System.out.println();
        } catch (IOException e) {
            System.out.println("error: no se pudo escribir el archivo.");
            System.out.println("  " + e.getMessage());
        }
    }
}
