package templates;

public class BaseCaracterTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "--cter";
    }

    @Override
    public String getId() {
        return "010";
    }

    @Override
    public String getName() {
        return "Impresion de Caracter";
    }

    @Override
    public String getDescription() {
        return "Escribe un carácter repetidas veces con un color de fondo y fuente específico.";
    }

    @Override
    public String getFileName() {
        return "impresion_caracter_base";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE + CARACTER ---\n"
            + "\n"
            + ".model small\n"
            + ".stack 100h\n"
            + ".data\n"
            + ".code\n"
            + "\n"
            + "MAIN PROC\n"
            + "\n"
            + "    inicio:\n"
            + "\n"
            + "    MOV ah,09h    ; Escribir un carácter con un color (atributo) específico\n"
            + "    MOV al,64     ; carácter, ya sea código o entre ''\n"
            + "    MOV cx,03     ; Contador de repetición\n"
            + "    MOV bh,00     ; Número de página\n"
            + "    MOV bl,14     ; Atributo de Color\n"
            + "    int 10h       \n"
            + "\n"
            + "    MOV ah,4ch    \n"
            + "    int 21h\n"
            + "    end\n"
            + "\n"
            + "MAIN ENDP\n"
            + "END MAIN\n";
    }
}
