import templates.AsmTemplate;
import templates.BaseCodeTemplate;

// ============================================================
//  REGISTRO DE PLANTILLAS
// ============================================================
//  Para agregar una nueva plantilla:
//  1. Crea tu clase en src/templates/ implementando AsmTemplate
//  2. Importa la clase aquí arriba (import templates.MiNuevaPlantilla;)
//  3. Agrégala al array TEMPLATES abajo
// ============================================================

public class TemplateRegistry {

    /**
     * Lista de todas las plantillas disponibles.
     * Agrega nuevas instancias aquí para registrarlas.
     */
    private static final AsmTemplate[] TEMPLATES = {
        new BaseCodeTemplate(),

        // AGREGA MÁS PLANTILLAS AQUÍ:
        // new MiNuevaPlantilla(),
        // new OtraPlantilla(),
    };

    /**
     * Devuelve todas las plantillas registradas.
     */
    public static AsmTemplate[] getAll() {
        return TEMPLATES;
    }

    /**
     * Busca una plantilla por su comando corto (ej: "cb").
     * Devuelve null si no la encuentra.
     */
    public static AsmTemplate findByCommand(String command) {
        for (AsmTemplate template : TEMPLATES) {
            if (template.getCommand().equalsIgnoreCase(command)) {
                return template;
            }
        }
        return null;
    }
}
