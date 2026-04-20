import templates.AsmTemplate;

/**
 * Maneja el comando: assembler --help str
 * Muestra todas las plantillas en el menu.
 */
public class HelpCommand {

    public static void execute() {
        AsmTemplate[] templates = TemplateRegistry.getAll();

        System.out.println();
        System.out.println("Para crear una plantilla: <comando> create");
        System.out.println();
        System.out.println("plantillas disponibles:");
        System.out.println();

        for (AsmTemplate t : templates) {
            if (t.getCommand().startsWith("--")) continue;
            System.out.printf("  [%-6s] %-20s %-6s %s%n",
                t.getCommand(), t.getName(), t.getId(), t.getDescription());
        }

        System.out.println();
        System.out.println("Si deceas crear la plantilla con el codigo base incluido, solo añade -- al inicio del comando de la plantilla");
        System.out.println();
        
    }
}
