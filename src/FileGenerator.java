import templates.AsmTemplate;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Se encarga de crear el archivo .asm y guardarlo en la carpeta de destino.
 */
public class FileGenerator {

    // ============================================================
    //  CARPETA DE DESTINO
    //  Cambia esta ruta si quieres guardar los archivos en otro lugar.
    // ============================================================
    private static final String OUTPUT_FOLDER =
        "C:\\Users\\catyf\\OneDrive\\Escritorio\\Programas\\Notas";

    /**
     * Genera el archivo .asm de la plantilla indicada.
     */
    public static void generate(AsmTemplate template) {
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
        String fileName = template.getFileName() + ".asm";
        File outputFile = new File(folder, fileName);

        // Si ya existe, avisar al usuario y preguntar si sobreescribir
        if (outputFile.exists()) {
            System.out.println("warning: el archivo ya existe -> " + outputFile.getAbsolutePath());
            System.out.println("  el archivo fue sobreescrito.");
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
