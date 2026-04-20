package templates;

public class RectanguloTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "prp";
    }

    @Override
    public String getId() {
        return "012";
    }

    @Override
    public String getName() {
        return "Pintar Rectangulo en Pantalla";
    }

    @Override
    public String getDescription() {
        return "Dibuja áreas rectangulares de color en la pantalla usando el servicio de scroll.";
    }

    @Override
    public String getFileName() {
        return "rectangulo_pantalla";
    }

    @Override
    public String getContent() {
        return "; --- PINTAR RECTANGULO EN PANTALLA ---\n"
            + "\n"
            + "\n"
            + "    etiqueta1:\n"
            + "        ; --- PRIMER RECTÁNGULO (Izquierda) ---\n"
            + "            MOV AH, 06H    \n"
            + "            MOV AL, 00H  \n"
            + "\n"
            + "            MOV BH, 4Fh    ;Color\n"
            + "            \n"
            + "            ; ESQUINA SUPERIOR \n"
            + "            MOV CH, 05     \n"
            + "            MOV CL, 05     \n"
            + "            \n"
            + "            ; ESQUINA INFERIOR \n"
            + "            MOV DH, 10     \n"
            + "            MOV DL, 15   \n"
            + "\n"
            + "            INT 10H   \n"
            + "\n"
            + "    etiqueta2:\n"
            + "        ; --- SEGUNDO RECTÁNGULO (Derecha) ---\n"
            + "            MOV AH, 06H    \n"
            + "            MOV AL, 00H    \n"
            + "\n"
            + "            MOV BH, 17h    ;Color\n"
            + "            \n"
            + "            ; ESQUINA SUPERIOR \n"
            + "            MOV CH, 05     \n"
            + "            MOV CL, 25     \n"
            + "            \n"
            + "            ; ESQUINA INFERIOR \n"
            + "            MOV DH, 10     \n"
            + "            MOV DL, 35   \n"
            + "\n"
            + "            INT 10H   \n"
            + "\n"
            + "    \n";
    }
}
