## Automation project in youtube with Screenplay, serenity, cucumber in Java

## Estructura del Proyecto

```bash
screenplay-serenity-cucumber/
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── fdymain
    │               ├── interactions     (Clases de Interactions del patrón Screenplay)
    │               ├── questions        (Clases de Questions del patrón Screenplay)
    │               ├── tasks            (Clases de Tasks del patrón Screenplay)
    │               └── ui               (Mapeo de elementos de la UI)
    └── test
        ├── java
        │   └── com
        │       └── fdymain
        │           ├── runners
        │           │   └── RunnerTest.java            (Clase Runner para ejecutar Cucumber + Serenity)
        │           └── stepDefinitions
        │               └── PlaySongStepDefinition.java (Clases de Step Definitions de Cucumber)
        └── resources
            ├── features
            │   └── playSong.feature                   (Archivos .feature con escenarios de prueba)
            └── serenity.config                        (Archivo de configuración de Serenity)
