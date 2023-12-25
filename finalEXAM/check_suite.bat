:: This test groups both structural and functional tests.




@ECHO OFF
set PROPS=%~1
set OPTS=%~2
set TARGET1="time\TimeTestSuite.java"
set TARGET2="time.TimeTestSuite"
if not "%~3"=="" (
    set TARGET1="%~3"
    set TARGET2="%~4"
)
@ECHO ON


javac -cp ".;junit5all.jar;checkthat.jar" %TARGET1%

: Stops the batch file if there was a compilation error
@if %ERRORLEVEL% NEQ 0 exit /b %ERRORLEVEL%

java %PROPS% -javaagent:checkagent.jar -jar junit5all.jar execute %OPTS% -E junit-vintage --disable-banner -cp . -cp checkthat.jar -c %TARGET2%
