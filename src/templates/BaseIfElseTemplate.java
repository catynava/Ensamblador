package templates;

public class BaseIfElseTemplate implements AsmTemplate {
    @Override
    public String getCommand() {
        return "--ifel";
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
        return "estructura_if_else_base";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE + IF/ELSE ---\n"
            + "\n"
            + ".model small\n"
            + ".stack 100h\n"
            + ".data\n"
            + "\n"
            + "; --- DECLARACION DE VARIABLES ---\n"
            + "; OPCIONES...\n"
            + "\n"
            + "opc db 1   \n"
            + "\n"
            + ".code \n"
            + "\n"
            + "MAIN PROC\n"
            + "\n"
            + "    Inicio:\n"
            + "\n"
            + "\t; --- INICIALIZACIÓN ---\n"
            + "        mov ax,@data\n"
            + "        mov ds, ax\n"
            + "        \n"
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
            + "        ; SEGUNDA OPCION...\n"
            + "\n"
            + "\n"
            + "    fin:\n"
            + "        mov ah,4ch\n"
            + "        int 21h\n"
            + "\n"
            + "MAIN ENDP\n"
            + "END MAIN\n";
    }
}
