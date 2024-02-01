@echo off
cd /d "C:\path\to\your\folder"  REM Change this to the path of your folder

echo Deleting .class files...

for /r %%i in (*.class) do (
    del "%%i"
)

echo Deletion complete.
pause