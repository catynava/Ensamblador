package templates;

/**
 * Interfaz base para todas las plantillas de ensamblador.
 * 
 * Para agregar una nueva plantilla:
 * 1. Crea una nueva clase en esta carpeta (src/templates/)
 * 2. Implementa esta interfaz
 * 3. Rellena los 4 métodos con los datos de tu plantilla
 * 4. Registra la clase en TemplateRegistry.java
 */
public interface AsmTemplate {

    /**
     * El comando corto que usará el usuario, ej: "cb"
     */
    String getCommand();

    /**
     * Número o identificador de la plantilla, ej: "001"
     */
    String getId();

    /**
     * Nombre descriptivo de la plantilla, ej: "Codigo base"
     */
    String getName();

    /**
     * Descripción breve de lo que hace la plantilla.
     */
    String getDescription();

    /**
     * El contenido completo del archivo .asm que se va a generar.
     */
    String getContent();

    /**
     * Nombre del archivo .asm que se creará, sin extensión.
     * ej: "codigo_base" → genera "codigo_base.asm"
     */
    String getFileName();
}
