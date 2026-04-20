package templates;

public class IfelseTemplate implements AsmTemplate {
    @Override
    public String getCommand() {
        return "ifel";
    }

    @Override
    public String getId() {
        return "003";
    }

    @Override
    public String getName() {
        return "Estructura IF/ELSE";
    }

    @Override
    public String getDescription() {
        return "Compara un valor y usa JZ para la ruta verdadera (IF) y JMP para la ruta falsa (ELSE).";
    }

    @Override
    public String getFileName() {
        return "estructura_if_else";
    }

    @Override
    public String getContent() {
        return "; --- IF/ELSE ---\n"
         + "\n"
         + "\n"
         + "; --- DECLARACION DE VARIABLES ---\n"
         + "; OPCIONES...\n"
         + "\n"
         + "opc db 1   \n"
         + "\n"
         + "\n"
         + "\n"
         + "        ; --- LÓGICA DE DECISIÓN (IF/ELSE) ---\n"
         + "        cmp opc,1      \n"
         + "         \n"
         + "        jz etiqueta1         \n"
         + "        jmp etiqueta2       \n"
         + "\n"
         + "\n"
         + "    etiqueta1: ; --- RUTA SI ES 1 (IF) ---\n"
         + "        ; PRIMERA OPCION...\n"
         + "        jmp fin        \n"
         + "\n"
         + "\n"
         + "    etiqueta2: ; --- RUTA SI NO ES 1 (ELSE) ---\n"
         + "        ; SEGUNDA OPCION...\n";
    }
}
