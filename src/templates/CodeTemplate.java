package templates;


public class CodeTemplate implements AsmTemplate {

    @Override
    public String getCommand() {
        return "cb";
    }

    @Override
    public String getId() {
        return "001";
    }

    @Override
    public String getName() {
        return "Codigo base";
    }

    @Override
    public String getDescription() {
        return "Codigo base de ensamblador.";
    }

    @Override
    public String getFileName() {
        return "codigo_base";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE ---\n"
             + ".MODEL SMALL\n"
             + ".STACK 100h\n"
             + ".DATA\n"
             + "; --- DECLARACION DE VARIABLES ---\n"
             + "    \n"
             + ".CODE\n"
             + "MAIN PROC\n"
             + "    ; --- INICIALIZACION ---\n"
             + "    MOV AX, @DATA\n"
             + "    MOV DS, AX\n"
             + "    \n"
             + "    ; TU CODIGO AQUI...\n"
             + "    \n"
             + "    ; --- SALIDA ---\n"
             + "    MOV AH, 4Ch\n"
             + "    INT 21h\n"
             + "MAIN ENDP\n"
             + "END MAIN\n";
    }
}
