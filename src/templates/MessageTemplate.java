package templates;


public class MessageTemplate implements AsmTemplate {

    @Override
    public String getCommand() {
        return "im";
    }

    @Override
    public String getId() {
        return "002";
    }

    @Override
    public String getName() {
        return "Impresion de Cadena";
    }

    @Override
    public String getDescription() {
        return "Muestra un texto completo en pantalla.";
    }

    @Override
    public String getFileName() {
        return "impresion_de_adena";
    }

    @Override
    public String getContent() {
        return "; --- IMPRESIÓN DE MENSAJE ---\n"
            + "\n"
            + "\n"
            + "\n"
            + "; --- DECLARACION DE VARIABLES ---\n"
            + "    msg DB 'Mensaje...', 13, 10, '$'\n"
            + "\n"
            + "\n"
            + "; --- BLOQUE DE IMPRESIÓN ---\n"
            + "    MOV AH, 09H         \n"
            + "    LEA DX, msg         ; Apunta a la variable (cambia 'msg' por tu variable)\n"
            + "    INT 21H             ; Imprime en pantalla\n";
    }
}