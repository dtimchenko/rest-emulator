@ECHO OFF
set JRE_HOME=%JAVA_HOME%

if exist "%JAVA_HOME%\bin\java.exe" goto okJava
echo The JAVA_HOME environment variable is not defined correctly
echo This environment variable is needed to run this program
goto end

:okJava

start %JRE_HOME%\bin\java.exe -Dserver.port=8090 -jar  rest-emulator.jar

:end


