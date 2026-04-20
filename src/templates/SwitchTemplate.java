package templates;

public class SwitchTemplate implements AsmTemplate {
    @Override
    public String getCommand() {
        return "sw";
    }

    @Override
    public String getId() {
        return "004";
    }

    @Override
    public String getName() {
        return "Estructura Switch";
    }

    @Override
    public String getDescription() {
        return "Evalúa una variable contra varios valores usando comparaciones sucesivas.";
    }

    @Override
    public String getFileName() {
        return "estructura_Switch";
    }

    @Override
    public String getContent() {
        return "; --- SWITCH ---\n"
            + "\n"
            + "; --- DECLARACION DE VARIABLES ---\n"
            + "; OPCIONES...  \n"
            + "\n"
            + "opc db 1     \n"
            + "\n"
            + "\n"
            + "        ; --- SELECTOR (SWITCH) ---\n"
            + "        cmp opc,1      \n"
            + "            jz etiqueta1  \n"
            + "            \n"
            + "        cmp opc,2      \n"
            + "            jz etiqueta2          \n"
            + "            jmp etiqueta3         \n"
            + "\n"
            + "    etiqueta1:\n"
            + "        ; PRIMERA OPCION...\n"
            + "        jmp fin   \n"
            + "\n"
            + "\n"
            + "    etiqueta2:\n"
            + "        ; SEGUNDA OPCION...\n"
            + "        jmp fin        \n"
            + "\n"
            + "\n"
            + "    etiqueta3:\n"
            + "\t; TERCERA OPCION...\n";
    }
}
