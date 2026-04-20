package templates;

public class BaseParpadeoLimiteTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "--pcl";
    }

    @Override
    public String getId() {
        return "014";
    }

    @Override
    public String getName() {
        return "Parpadeo con Limite";
    }

    @Override
    public String getDescription() {
        return "Ejecuta una secuencia de parpadeo alternado entre dos áreas de color por un número determinado de repeticiones.";
    }

    @Override
    public String getFileName() {
        return "parpadeo_con_limite_base";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE + PARPADEO (CON LIMITE) ---\n"
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
            + "        ; --- CONFIGURAR EL CONTADOR ---\n"
            + "        MOV CX, 5          \n"
            + "\n"
            + "    etiqueta1:\n"
            + "        PUSH CX            \n"
            + "\n"
            + "        ; --- CUADRO IZQUIERDO (color) / DERECHO ---\n"
            + "\n"
            + "            ; IZQUIERDO\n"
            + "                MOV AH, 06H\n"
            + "                MOV AL, 00H\n"
            + "                \n"
            + "                MOV BH, 1Eh    ; Color Azul\n"
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
            + "                MOV BH, 00H    ; Color Negro (Apagado)\n"
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
            + "                MOV BH, 00H    ; Color Negro (Apagado)\n"
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
            + "                MOV BH, 4Fh    ; Color Rojo\n"
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
            + "        ; --- CONTROL DEL CICLO ---\n"
            + "        POP CX             \n"
            + "        LOOP etiqueta1     \n"
            + "\n"
            + "        ; --- SALIDA ---\n"
            + "        MOV AH, 4CH\n"
            + "        INT 21H\n"
            + "\n"
            + "MAIN ENDP\n"
            + "END MAIN\n";
    }
}
