package templates;

public class ParpadeoSalidaEspecificaTemplates implements AsmTemplate{
    @Override
    public String getCommand() {
        return "pcse";
    }

    @Override
    public String getId() {
        return "016";
    }

    @Override
    public String getName() {
        return "Parpadeo con Salida por Tecla Específica";
    }

    @Override
    public String getDescription() {
        return "Establece un ciclo de animación continua que alterna colores en pantalla hasta que se detecta la pulsación de una tecla concreta.";
    }

    @Override
    public String getFileName() {
        return "parpadeo_salida_especifica";
    }

    @Override
    public String getContent() {
        return "; --- PARPADEO (CON SALIDA ESPECIFICA) ---\n"
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
            + "            INT 21H            \n"
            + "            CMP AL, 00H        \n"
            + "            JZ etiqueta1       \n"
            + "\n"
            + "            MOV AH, 07H        \n"
            + "            INT 21H     \n"
            + "\n"
            + "            CMP AL, 'q'        \n"
            + "            JNE etiqueta1      \n";
    }
}
