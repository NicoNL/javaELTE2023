:: These tests check the names/types of
:: packages/classes/constructors/methods/parameters.
:: They do not check how the code works.
:: They do even refer to the code directly.

@ECHO OFF
set PROPS=%~1
set OPTS=%~2
set TARGET1="time\TimeStructureTest.java"
set TARGET2="time.TimeStructureTest"
if not "%~3"=="" (
    set TARGET1="%~3"
    set TARGET2="%~4"
)
@ECHO ON


:: Here, you need to compile the tested classes separately
:: if you use the structural tests but not the full suite.
:: Like this but without the comment:

: javac time\Time.java


javac -cp ".;junit5all.jar;checkthat.jar" %TARGET1%

: Stops the batch file if there was a compilation error
@if %ERRORLEVEL% NEQ 0 exit /b %ERRORLEVEL%

java %PROPS% -javaagent:checkagent.jar -jar junit5all.jar execute %OPTS% -E junit-vintage --disable-banner -cp . -cp checkthat.jar -c %TARGET2%
