package templates;

public class ParpadeoInfinitoTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "pl";
    }

    @Override
    public String getId() {
        return "013";
    }

    @Override
    public String getName() {
        return "Parpadeo sin limite";
    }

    @Override
    public String getDescription() {
        return "Crea una animación de alternancia entre bloques de color mediante un bucle infinito.";
    }

    @Override
    public String getFileName() {
        return "parpadeo_sin_limite";
    }

    @Override
    public String getContent() {
        return "; --- PARPADEO (INFINITO) ---\n"
            + "\n"
            + "\n"
            + "\n"
            + "    etiqueta1:\n"
            + "        ; --- CUADRO IZQUIERDO (color) / DERECHO ---\n"
            + "\n"
            + "            ; IZQUIERDO\n"
            + "                MOV AH, 06H\n"
            + "                MOV AL, 00H\n"
            + "                \n"
            + "                MOV BH, 1Eh    ; Color\n"
            + "\n"
            + "                ; ESQUINA SUPERIOR \n"
            + "                MOV CH, 05     \n"
            + "                MOV CL, 10  \n"
            + "\n"
            + "                ; ESQUINA INFERIOR\n"
            + "                MOV DH, 15     \n"
            + "                MOV DL, 30   \n"
            + "                \n"
            + "                INT 10H\n"
            + "\n"
            + "            ; DERECHO\n"
            + "                MOV AH, 06H\n"
            + "                MOV AL, 00H\n"
            + "\n"
            + "                MOV BH, 00H    ; Color\n"
            + "\n"
            + "                ; ESQUINA SUPERIOR \n"
            + "                MOV CH, 05\n"
            + "                MOV CL, 40\n"
            + "\n"
            + "                ; ESQUINA INFERIOR\n"
            + "                MOV DH, 15\n"
            + "                MOV DL, 60\n"
            + "                INT 10H\n"
            + "\n"
            + "        ; --- ESPERA 1 SEGUNDO ---\n"
            + "            MOV AH, 86H\n"
            + "            MOV CX, 000FH  \n"
            + "            MOV DX, 4240H \n"
            + "            INT 15H\n"
            + "\n"
            + "        ; --- CUADRO IZQUIERDO / DERECHO (color) ---\n"
            + "\n"
            + "            ; IZQUIERDO\n"
            + "            \n"
            + "                MOV AH, 06H\n"
            + "                MOV AL, 00H\n"
            + "                \n"
            + "                MOV BH, 00H    ; Color\n"
            + "\n"
            + "                ; ESQUINA SUPERIOR \n"
            + "                MOV CH, 05\n"
            + "                MOV CL, 10\n"
            + "\n"
            + "                ; ESQUINA INFERIOR\n"
            + "                MOV DH, 15\n"
            + "                MOV DL, 30\n"
            + "\n"
            + "                INT 10H\n"
            + "\n"
            + "            ; DERECHO\n"
            + "                MOV AH, 06H\n"
            + "                MOV AL, 00H\n"
            + "\n"
            + "                MOV BH, 4Fh    ; Color\n"
            + "\n"
            + "                ; ESQUINA SUPERIOR \n"
            + "                MOV CH, 05\n"
            + "                MOV CL, 40\n"
            + "\n"
            + "                ; ESQUINA INFERIOR\n"
            + "                MOV DH, 15\n"
            + "                MOV DL, 60\n"
            + "\n"
            + "                INT 10H\n"
            + "\n"
            + "\n"
            + "        ; --- ESPERA 1 SEGUNDO ---\n"
            + "        MOV AH, 86H\n"
            + "        MOV CX, 000FH\n"
            + "        MOV DX, 4240H\n"
            + "        INT 15H\n"
            + "\n"
            + "\t; --- CONTROL DEL CICLO ---\n"
            + "        JMP etiqueta1   ; Bucle infinito\n"
            + "\n"
            + "\n"
            + "        \n";
    }
}
