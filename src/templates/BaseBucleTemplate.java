package templates;

public class BaseBucleTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "--bcl";
    }

    @Override
    public String getId() {
        return "006";
    }

    @Override
    public String getName() {
        return "Estructura de Bucle";
    }

    @Override
    public String getDescription() {
        return "Estructura para procesos continuos que no deben terminar.";
    }

    @Override
    public String getFileName() {
        return "estructura_bucle_base";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE + BUCLE ---\n"
            + "\n"
            + ".model small\n"
            + ".stack 100h\n"
            + ".data\n"
            + "\n"
            + "; --- DECLARACION DE VARIABLES ---\n"
            + "\n"
            + ".code\n"
            + "\n"
            + "MAIN PROC\n"
            + "    inicio:\n"
            + "        mov ax, @data\n"
            + "        mov ds, ax\n"
            + "\n"
            + "    etiqueta1:\n"
            + "        \n"
            + "\t; TU CODIGO AQUI...\n"
            + "\n"
            + "    etiqueta2:\n"
            + "                   \n"
            + "        jmp etiqueta1  \n"
            + "\n"
            + "\n"
            + "    fin:\n"
            + "        mov ah, 4ch\n"
            + "        int 21h\n"
            + "\n"
            + "MAIN ENDP\n"
            + "END MAIN\n";
    }
}
