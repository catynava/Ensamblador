package templates;

public class WhileTemplate implements AsmTemplate {
    @Override
    public String getCommand() {
        return "wl";
    }

    @Override
    public String getId() {
        return "005";
    }

    @Override
    public String getName() {
        return "Estructura While";
    }

    @Override
    public String getDescription() {
        return "Ejecuta un bloque de codigo mientras se cumpla una condicion.";
    }

    @Override
    public String getFileName() {
        return "estructura_While";
    }

    @Override
    public String getContent() {
        return "; --- WHILE ---\n"
            + "\n"
            + "\n"
            + "    ; --- DECLARACION DE VARIABLES ---\n"
            + "    \n"
            + "\n"
            + "\n"
            + "    ; --- INICIO DEL WHILE ---\n"
            + "    while_inicio:\n"
            + "\n"
            + "        ; --- EVALUAR LA CONDICIÓN ---\n"
            + "        CMP contador, 5\n"
            + "        JAE while_fin      \n"
            + "\n"
            + "        ; --- CUERPO DEL CICLO ---\n"
            + "        ; LO QUE SE QUIERE QUE SE REPITA...\n"
            + "\n"
            + "        ; --- ACTUALIZACIÓN ---\n"
            + "        INC contador       \n"
            + "        \n"
            + "        ; 4. REGRESAR AL INICIO\n"
            + "        JMP while_inicio\n"
            + "\n"
            + "    while_fin:\n"
            + "        ; El programa sale aquí cuando la condición ya no se cumple\n";
    }
}
