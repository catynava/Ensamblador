# assembler-gen

Generador de plantillas de código ensamblador desde la terminal.

---

## Estructura del proyecto

```
assembler-gen/
│
├── run.bat                        <- Compila y ejecuta el programa (doble clic o terminal)
│
└── src/
    ├── Main.java                  <- Entrada del programa y loop de comandos
    ├── HelpCommand.java           <- Lógica del comando 'assembler --help str'
    ├── TemplateRegistry.java      <- Registro de todas las plantillas
    ├── FileGenerator.java         <- Crea y guarda el archivo .asm
    │
    └── templates/
        ├── AsmTemplate.java       <- Interfaz que implementan todas las plantillas
        └── BaseCodeTemplate.java  <- Plantilla 001: Codigo base
```

---

## Cómo ejecutar

1. Abre una terminal en la carpeta `assembler-gen/`
2. Ejecuta:
   ```
   run.bat
   ```
3. Una vez dentro del programa:
   ```
   assembler> assembler --help str
   ```

---

## Comandos disponibles dentro del programa

| Comando                  | Descripción                              |
|--------------------------|------------------------------------------|
| `assembler --help str`   | Muestra todas las plantillas disponibles |
| `<cmd> create`           | Crea el archivo .asm de esa plantilla    |
| `exit`                   | Cierra el programa                       |

**Ejemplo:**
```
assembler> assembler --help str

  [cb    ] Codigo base          001    Codigo base de ensamblador.

assembler> cb create

  created -> C:\Users\catyf\OneDrive\Escritorio\Programas\Notas\codigo_base.asm
```

---

## Cómo agregar una nueva plantilla

### Paso 1 — Crear la clase de la plantilla

Crea un nuevo archivo en `src/templates/`, por ejemplo `PrintTemplate.java`:

```java
package templates;

public class PrintTemplate implements AsmTemplate {

    @Override public String getCommand()     { return "pr"; }
    @Override public String getId()          { return "002"; }
    @Override public String getName()        { return "Imprimir cadena"; }
    @Override public String getDescription() { return "Imprime una cadena en pantalla."; }
    @Override public String getFileName()    { return "imprimir_cadena"; }

    @Override
    public String getContent() {
        return "; --- IMPRIMIR CADENA ---\n"
             + ".MODEL SMALL\n"
             + ".STACK 100h\n"
             + ".DATA\n"
             + "    MSG DB 'Hola Mundo$'\n"
             + ".CODE\n"
             + "MAIN PROC\n"
             + "    MOV AX, @DATA\n"
             + "    MOV DS, AX\n"
             + "    LEA DX, MSG\n"
             + "    MOV AH, 09h\n"
             + "    INT 21h\n"
             + "    MOV AH, 4Ch\n"
             + "    INT 21h\n"
             + "MAIN ENDP\n"
             + "END MAIN\n";
    }
}
```

### Paso 2 — Registrarla en TemplateRegistry.java

Abre `src/TemplateRegistry.java` y:

1. Agrega el import arriba:
   ```java
   import templates.PrintTemplate;
   ```

2. Agrega la instancia al array:
   ```java
   private static final AsmTemplate[] TEMPLATES = {
       new BaseCodeTemplate(),
       new PrintTemplate(),   // <- nueva plantilla
   };
   ```

### Paso 3 — Recompilar

Ejecuta `run.bat` de nuevo. ¡Listo!

---

## Cambiar la carpeta de destino

Abre `src/FileGenerator.java` y cambia el valor de `OUTPUT_FOLDER`:

```java
private static final String OUTPUT_FOLDER =
    "C:\\Users\\TuUsuario\\TuCarpeta\\Notas";
```
