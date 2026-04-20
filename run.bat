@echo off
:: ============================================================
::  assembler-gen - Script de compilacion y ejecucion
:: ============================================================

:: Cambiar al directorio donde esta este .bat
cd /d "%~dp0"

:: Crear carpeta de clases compiladas si no existe
if not exist "out" mkdir out

:: Compilar todos los archivos Java
echo Compilando...
javac -d out -sourcepath src src\Main.java

if %errorlevel% neq 0 (
    echo.
    echo ERROR: La compilacion fallo. Revisa los errores de arriba.
    pause
    exit /b 1
)

echo Compilacion exitosa.
echo.

:: Ejecutar el programa
java -cp out Main
