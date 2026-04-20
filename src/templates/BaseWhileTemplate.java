package templates;

public class BaseWhileTemplate implements AsmTemplate{
     @Override
    public String getCommand() {
        return "--wl";
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
        return "estructura_While_base";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE + WHILE ---\n"
            + "\n"
            + ".MODEL SMALL\n"
            + ".STACK 100h\n"
            + ".DATA\n"
            + "\n"
            + "    ; --- DECLARACION DE VARIABLES ---\n"
            + "    \n"
            + "\n"
            + ".CODE\n"
            + "\n"
            + "MAIN PROC\n"
            + "    MOV AX, @DATA\n"
            + "    MOV DS, AX\n"
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
            + "        ; El programa sale aquí cuando la condición ya no se cumple\n"
            + "\n"
            + "    ; --- SALIDA ---\n"
            + "    MOV AH, 4CH\n"
            + "    INT 21H\n"
            + "\n"
            + "\n"
            + "MAIN ENDP\n"
            + "END MAIN\n";
    }
}
