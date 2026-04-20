package templates;

public class BaseCursorDiagonalTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "--cd";
    }

    @Override
    public String getId() {
        return "017";
    }

    @Override
    public String getName() {
        return "Movimiento de Cursor en Diagonal";
    }

    @Override
    public String getDescription() {
        return "Simula una animación de desplazamiento al actualizar progresivamente las coordenadas de fila y columna en cada iteración.";
    }

    @Override
    public String getFileName() {
        return "cursor_diagonal_base";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE + CURSOR DIAGONAL ---\n"
            + "\n"
            + ".MODEL SMALL\n"
            + ".STACK 100h\n"
            + ".DATA\n"
            + ".CODE\n"
            + "\n"
            + "MAIN PROC\n"
            + "    etiqueta1:\n"
            + "        ; --- Posicion inicial ---\n"
            + "        MOV AH, 02H\n"
            + "        MOV BH, 00H\n"
            + "\n"
            + "        MOV DH, 0       \n"
            + "        MOV DL, 0       \n"
            + "        INT 10H\n"
            + "\n"
            + "        MOV CX, 20      \n"
            + "\n"
            + "    etiqueta2:\n"
            + "        ; --- Mover cursor en diagonal  ---\n"
            + "        INC DH          \n"
            + "        INC DL          \n"
            + "\n"
            + "        PUSH CX         \n"
            + "        PUSH DX         \n"
            + "\n"
            + "        ; --- Mover cursor ---\n"
            + "        MOV AH, 02H\n"
            + "        MOV BH, 00H\n"
            + "        INT 10H\n"
            + "\n"
            + "        ; --- Esperar 1 segundo ---\n"
            + "        MOV AH, 86H\n"
            + "        MOV CX, 000FH   \n"
            + "        MOV DX, 4240H   \n"
            + "        INT 15H\n"
            + "\n"
            + "        POP DX          ; Recuperamos la posicion\n"
            + "        POP CX          ; Recuperamos el contador\n"
            + "\n"
            + "        ; --- Repetir ---\n"
            + "        DEC CX\n"
            + "        JNZ etiqueta2\n"
            + "\n"
            + "        ; --- FIN ---\n"
            + "        MOV AH, 4CH\n"
            + "        INT 21H\n"
            + "\n"
            + "MAIN ENDP\n"
            + "END MAIN\n";
    }
}
