@echo off
REM Set paths
set BACKUP=C:\Users\ashis\backup-repo
set MAIN=C:\Users\ashis\Basic-Java-Practice-Questions-

echo Copying files from backup to main repo...
xcopy "%BACKUP%\*.java" "%MAIN%" /s /y

cd %MAIN%

echo Adding files to Git...
git add .

echo Committing changes...
git commit -m "Restore all Java files from backup"

echo Pushing to GitHub...
git push origin main

echo.
echo ✅ Restore complete! All files copied and pushed.
pause
