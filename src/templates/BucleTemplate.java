package templates;

public class BucleTemplate implements AsmTemplate{
    @Override
    public String getCommand() {
        return "bcl";
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
        return "estructura_bucle";
    }

    @Override
    public String getContent() {
        return "; --- CODIGO BASE + BUCLE ---\n"
            + "\n"
            + "\n"
            + "\n"
            + "; --- DECLARACION DE VARIABLES ---\n"
            + "\n"
            + "\n"
            + "MAIN PROC\n"
            + "    inicio:\n"
            + "       \n"
            + "\n"
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
            + "        \n";
    }
}
