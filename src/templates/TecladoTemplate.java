package templates;

public class TecladoTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "dt";
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
        return "detector_teclado";
    }

    @Override
    public String getContent() {
        return "; --- DETECTOR DE TECLADO ---\n"
            + "\n"
            + "\n"
            + "; --- DECLARACION DE VARIABLES ---\n"
            + "        \n"
 
            + "MAIN PROC\n"
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
            + "        jz etiqueta1      \n";
    }
}
