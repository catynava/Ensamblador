import templates.AsmTemplate;
import templates.BaseBucleTemplate;
import templates.BaseCaracterTemplate;
import templates.BaseCursorDiagonalTemplate;
import templates.BaseForTemplate;
import templates.BaseIfElseTemplate;
import templates.BaseMessageTemplate;
import templates.BasePantallaTemplate;
import templates.BaseParpadeoInfinitoTemplate;
import templates.BaseParpadeoLimiteTemplate;
import templates.BaseParpadeoSalidaEspecificaTemplates;
import templates.BaseParpadeoSalidaTemplate;
import templates.BaseRectanguloTemplate;
import templates.BaseSwitchTemplate;
import templates.BaseTecladoEspecificoTemplate;
import templates.BaseTecladoTemplate;
import templates.BaseWhileTemplate;
import templates.BucleTemplate;
import templates.CaracterTemplate;
import templates.CodeTemplate;
import templates.CursorDiagonalTemplate;
import templates.ForTemplate;
import templates.IfelseTemplate;
import templates.MessageTemplate;
import templates.PantallaTemplate;
import templates.ParpadeoInfinitoTemplate;
import templates.ParpadeoLimiteTemplate;
import templates.ParpadeoSalidaEspecificaTemplates;
import templates.ParpadeoSalidaTemplate;
import templates.RectanguloTemplate;
import templates.SwitchTemplate;
import templates.TecladoEspecificoTemplate;
import templates.TecladoTemplate;
import templates.WhileTemplate;


public class TemplateRegistry {

    /**
     * Lista de todas las plantillas
     */
    private static final AsmTemplate[] TEMPLATES = {
        // --- PLANTILLAS COMPLETAS (con codigo base) ---
        new CodeTemplate(),
        new BaseMessageTemplate(),
        new BaseIfElseTemplate(),
        new BaseSwitchTemplate(),
        new BaseWhileTemplate(),
        new BaseBucleTemplate(),
        new BaseForTemplate(),
        new BaseTecladoTemplate(),
        new BaseTecladoEspecificoTemplate(),
        new BaseCaracterTemplate(),
        new BasePantallaTemplate(),
        new BaseRectanguloTemplate(),
        new BaseParpadeoInfinitoTemplate(),
        new BaseParpadeoLimiteTemplate(),
        new BaseParpadeoSalidaTemplate(),
        new BaseParpadeoSalidaEspecificaTemplates(),
        new BaseCursorDiagonalTemplate(),

        // --- FRAGMENTOS DE CODIGO (solo el bloque) ---
        new MessageTemplate(),
        new IfelseTemplate(),
        new SwitchTemplate(),
        new WhileTemplate(),
        new BucleTemplate(),
        new ForTemplate(),
        new TecladoTemplate(),
        new TecladoEspecificoTemplate(),
        new CaracterTemplate(),
        new PantallaTemplate(),
        new RectanguloTemplate(),
        new ParpadeoInfinitoTemplate(),
        new ParpadeoLimiteTemplate(),
        new ParpadeoSalidaTemplate(),
        new ParpadeoSalidaEspecificaTemplates(),
        new CursorDiagonalTemplate(),
    };

    /**
     * Devuelve todas las plantillas
     */
    public static AsmTemplate[] getAll() {
        return TEMPLATES;
    }

    /**
     * Busca una plantilla por su comando
     * Devuelve null si no la encuentra
     */
    public static AsmTemplate findByCommand(String command) {
        for (AsmTemplate template : TEMPLATES) {
            if (template.getCommand().equalsIgnoreCase(command)) {
                return template;
            }
        }
        return null;
    }
}
