package templates;

public class PantallaTemplate implements AsmTemplate {
    @Override
    public String getCommand() {
        return "lpc";
    }

    @Override
    public String getId() {
        return "011";
    }

    @Override
    public String getName() {
        return "Limpiar Pantalla Completa";
    }

    @Override
    public String getDescription() {
        return "Restablece el área de visualización utilizando el servicio de video del BIOS.";
    }

    @Override
    public String getFileName() {
        return "limpiar_pantalla";
    }

    @Override
    public String getContent() {
        return "; --- LIMPIAR PANTALLA COMPLETA ---\n"
            + "\n"
            + "\n"
            + "    ; --- CONFIGURAR BORRADOR ---\n"
            + "    MOV AH, 06H    ; Servicio de scroll/limpieza\n"
            + "    MOV AL, 00H    ; 00 = Limpiar toda el área\n"
            + "    \n"
            + "    ; --- COLOR DE FONDO ---\n"
            + "    ; El primer número es fondo, el segundo es letra.\n"
            + "    MOV BH, 07H    ; 0 = Fondo Negro, 7 = Letra Blanca\n"
            + "\n"
            + "    ; --- ESQUINA SUPERIOR IZQUIERDA (0,0) ---\n"
            + "    MOV CH, 00     ; Fila inicial\n"
            + "    MOV CL, 00     ; Columna inicial\n"
            + "\n"
            + "    ; --- ESQUINA INFERIOR DERECHA (24, 79) ---\n"
            + "    MOV DH, 24     ; Fila final (Fin de pantalla)\n"
            + "    MOV DL, 79     ; Columna final (Fin de pantalla)\n"
            + "\n"
            + "    INT 10H        ; Ejecutar limpieza\n";
    }
}
