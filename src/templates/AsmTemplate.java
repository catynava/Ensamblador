package templates;


public interface AsmTemplate {

    /**
     * El comando corto que usará el usuario
     */
    String getCommand();

    /**
     * Número o identificador de la plantilla
     */
    String getId();

    /**
     * Nombre descriptivo de la plantilla
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
     * Nombre del archivo .asm que se creará
     */
    String getFileName();
}
