package templates;

public class BaseTecladoEspecificoTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "--dte";
    }

    @Override
    public String getId() {
        return "009";
    }

    @Override
    public String getName() {
        return "Detector de Teclado (especifico)";
    }

    @Override
    public String getDescription() {
        return "Captura y filtra la entrada del usuario para finalizar un proceso solo con una tecla determinada.";
    }

    @Override
    public String getFileName() {
        return "detector_teclado_especifico_base";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE + DETECTOR DE TECLADO (TECLA ESPECIFICA) ---\n"
            + "\n"
            + ".model small\n"
            + ".stack 100h\n"
            + ".data\n"
            + "\n"
            + "; --- DECLARACION DE VARIABLES ---\n"
            + "    \n"
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
            + "        ; --- REVISAR SI SE PRECIONO UNA TECLA ---\n"
            + "        mov ah, 0bh\n"
            + "        int 21h\n"
            + "        \n"
            + "        cmp al, 00     \n"
            + "        jz etiqueta1   \n"
            + "\n"
            + "\n"
            + "        ; --- IDENTIFICAR QUE TECLA ES ---\n"
            + "        mov ah, 07h    \n"
            + "        int 21h        \n"
            + "\n"
            + "\n"
            + "        ; --- COMPARAR CON NUESTRA TECLA ELEGIDA ---\n"
            + "        cmp al, ''  ; se coloca la tecla para identificar  \n"
            + "        jz fin         \n"
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
