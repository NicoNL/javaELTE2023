@ECHO OFF
set TARGET1="textfile\StatisticsTest.java"
set TARGET2="textfile.StatisticsTest"
if not "%~3"=="" (
    set TARGET1="%~3"
    set TARGET2="%~4"
)
@ECHO ON

javac -cp ".;junit5all.jar;checkthat.jar" %TARGET1%
java %~1 -javaagent:checkagent.jar -jar junit5all.jar execute %~2 -E junit-vintage --disable-banner -cp . -cp checkthat.jar -c %TARGET2%
