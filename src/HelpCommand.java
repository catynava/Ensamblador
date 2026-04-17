import templates.AsmTemplate;

/**
 * Maneja el comando: assembler --help str
 * Muestra todas las plantillas disponibles en formato de terminal.
 */
public class HelpCommand {

    public static void execute() {
        AsmTemplate[] templates = TemplateRegistry.getAll();

        System.out.println();
        System.out.println("usage: <command> create");
        System.out.println();
        System.out.println("available templates:");
        System.out.println();

        for (AsmTemplate t : templates) {
            // Formato: [cb] Codigo base 001  Codigo base de ensamblador.
            System.out.printf("  [%-6s] %-20s %-6s %s%n",
                t.getCommand(),
                t.getName(),
                t.getId(),
                t.getDescription()
            );
        }

        System.out.println();
        System.out.println("example:");
        System.out.println("  cb create    ->  creates 'codigo_base.asm' in output folder");
        System.out.println();
    }
}
