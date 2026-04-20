package templates;

public class ForTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "fr";
    }

    @Override
    public String getId() {
        return "007";
    }

    @Override
    public String getName() {
        return "Estructura For";
    }

    @Override
    public String getDescription() {
        return "Repite un bloque de código un número específico de veces usando el registro CX.";
    }

    @Override
    public String getFileName() {
        return "estructura_for";
    }

    @Override
    public String getContent() {
        return "; --- FOR ---\n"
            + "\n"
            + "\n"
            + "        ; --- INICIALIZACIÓN DEL FOR ---\n"
            + "        MOV CX, 5          \n"
            + "\n"
            + "    etiqueta1:\n"
            + "\n"
            + "        PUSH CX            ; Guardar el contador en la pila\n"
            + "\n"
            + "                \n"
            + "\t; TU CODIGO AQUI...\n"
            + "\t\n"
            + "        \n"
            + "        POP CX             ; Recuperamos nuestro contador\n"
            + "        LOOP etiqueta1     ; si no es 0 salta a etiqueta1\n";
    }
}
