package templates;


public class BaseMessageTemplate implements AsmTemplate {

    @Override
    public String getCommand() {
        return "--im";
    }

    @Override
    public String getId() {
        return "002";
    }

    @Override
    public String getName() {
        return "Impresión de Cadena";
    }

    @Override
    public String getDescription() {
        return "Muestra un texto completo en pantalla.";
    }

    @Override
    public String getFileName() {
        return "impresion_de_adena_base";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE + IMPRESIÓN DE MENSAJE ---\n"
            + "\n"
            + "\n"
            + ".MODEL SMALL\n"
            + ".STACK 100h\n"
            + ".DATA\n"
            + "\n"
            + "    ; --- DECLARACION DE VARIABLES ---\n"
            + "    msg DB 'Mensaje...', 13, 10, '$'\n"
            + "\n"
            + ".CODE\n"
            + "\n"
            + "MAIN PROC\n"
            + "\n"
            + "    ; --- CONFIGURACIÓN INICIAL ---\n"
            + "    MOV AX, @DATA\n"
            + "    MOV DS, AX\n"
            + "\n"
            + "    ; --- BLOQUE DE IMPRESIÓN ---\n"
            + "    MOV AH, 09H          \n"
            + "    LEA DX, msg     ; Apunta a la variable (cambia 'msg' por tu variable)     \n"
            + "    INT 21H         ; Imprime en pantalla     \n"
            + "\n"
            + "    ; --- SALIDA ---\n"
            + "    MOV AH, 4CH          \n"
            + "    INT 21H\n"
            + "\n"
            + "MAIN ENDP\n"
            + "END MAIN\n";
    }
}