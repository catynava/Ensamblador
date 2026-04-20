package templates;

public class BaseParpadeoSalidaTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "--pcs";
    }

    @Override
    public String getId() {
        return "015";
    }

    @Override
    public String getName() {
        return "Parpadeo con Interrupción de Teclado";
    }

    @Override
    public String getDescription() {
        return "Genera una animación de parpadeo infinito que se mantiene activa hasta que el usuario presiona cualquier tecla.";
    }

    @Override
    public String getFileName() {
        return "parpadeo_interrupcion_Teclado_base";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE + PARPADEO (CON SALIDA) ---\n"
            + "\n"
            + "\n"
            + ".MODEL SMALL\n"
            + ".STACK 100h\n"
            + ".DATA\n"
            + ".CODE\n"
            + "\n"
            + "MAIN PROC\n"
            + "        MOV AX, @DATA\n"
            + "        MOV DS, AX\n"
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
            + "        ; --- ESPERA 1 SEGUNDO ---\n"
            + "            MOV AH, 86H\n"
            + "            MOV CX, 000FH\n"
            + "            MOV DX, 4240H\n"
            + "            INT 15H\n"
            + "\n"
            + "        ; --- REVISAR SI SE PRESIONÓ UNA TECLA ---\n"
            + "            MOV AH, 0Bh        \n"
            + "            INT 21H         \n"
            + "               \n"
            + "            CMP AL, 00H        \n"
            + "            JZ etiqueta1       \n"
            + "\n"
            + "        ; --- SALIDA ---\n"
            + "        MOV AH, 4CH\n"
            + "        INT 21H\n"
            + "\n"
            + "MAIN ENDP\n"
            + "END MAIN\n";
    }
}