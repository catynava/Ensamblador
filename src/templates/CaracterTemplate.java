package templates;

public class CaracterTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "cter";
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
        return "impresion_caracter";
    }

    @Override
    public String getContent() {
        return "; --- CARACTER ---\n"
            + "\n"
            + "\n"
            + "    MOV ah,09h    ; Escribir un carácter con un color (atributo) específico\n"
            + "    MOV al,64     ; carácter, ya sea código o entre ''\n"
            + "    MOV cx,03     ; Contador de repetición\n"
            + "    MOV bh,00     ; Número de página\n"
            + "    MOV bl,14     ; Atributo de Color\n"
            + "    int 10h\n";
    }
}
