package templates;

public class BaseTecladoTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "--dt";
    }

    @Override
    public String getId() {
        return "008";
    }

    @Override
    public String getName() {
        return "Detector de Teclado";
    }

    @Override
    public String getDescription() {
        return "Mantiene el programa en ejecución hasta que se presiona cualquier tecla.";
    }

    @Override
    public String getFileName() {
        return "detector_teclado_base";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE + DETECTOR DE TECLADO ---\n"
            + "\n"
            + ".model small\n"
            + ".stack 100h\n"
            + ".data\n"
            + "\n"
            + "; --- DECLARACION DE VARIABLES ---\n"
            + "        \n"
            + "\n"
            + ".code\n"
            + "\n"
            + "\n"
            + "MAIN PROC\n"
            + "\n"
            + "    inicio:\n"
            + "        mov ax, @data\n"
            + "        mov ds, ax\n"
            + "\n"
            + "\n"
            + "    etiqueta1:\n"
            + "               \n"
            + "\t; TU CODIGO AQUI...\n"
            + "\n"
            + "    etiqueta2:\n"
            + "        ; --- DETECCIÓN DE TECLADO ---\n"
            + "        mov ah, 0bh    \n"
            + "        int 21h        \n"
            + "        \n"
            + "        cmp al, 00     \n"
            + "        jz etiqueta1      \n"
            + "\n"
            + "\n"
            + "    fin:\n"
            + "        mov ah, 4ch    \n"
            + "        int 21h\n"
            + "\n"
            + "\n"
            + "MAIN ENDP\n"
            + "END MAIN\n";
    }
}
