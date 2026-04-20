package templates;

public class BaseForTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "--fr";
    }

    @Override
    public String getId() {
        return "007";
    }

    @Override
    public String getName() {
        return "Estructura For";
    }

    @Override
    public String getDescription() {
        return "Repite un bloque de código un número específico de veces usando el registro CX.";
    }

    @Override
    public String getFileName() {
        return "estructura_for_base";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE + FOR ---\n"
            + "\n"
            + ".MODEL SMALL\n"
            + ".STACK 100h\n"
            + ".DATA\n"
            + "    \n"
            + "    ; --- DECLARACION DE VARIABLES ---\n"
            + "\n"
            + ".CODE\n"
            + "\n"
            + "MAIN PROC\n"
            + "        MOV AX, @DATA\n"
            + "        MOV DS, AX\n"
            + "\n"
            + "        ; --- INICIALIZACIÓN DEL FOR ---\n"
            + "        MOV CX, 5          \n"
            + "\n"
            + "    etiqueta1:\n"
            + "\n"
            + "        PUSH CX            ; Guardar el contador en la pila\n"
            + "\n"
            + "                \n"
            + "\t; TU CODIGO AQUI...\n"
            + "\t\n"
            + "        \n"
            + "        POP CX             ; Recuperamos nuestro contador\n"
            + "        LOOP etiqueta1     ; si no es 0 salta a etiqueta1\n"
            + "\n"
            + "        ; --- SALIDA ---\n"
            + "        MOV AH, 4CH\n"
            + "        INT 21H\n"
            + "\n"
            + "MAIN ENDP\n"
            + "END MAIN\n";
    }
}
