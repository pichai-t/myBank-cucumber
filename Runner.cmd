@Echo off

::
:: OscarRunner
::
:: Input Story folder: G:\AutomationTest\Oscar\feature\%Proj%
::      Output folder: *TBD*
::

:: cd /d C:\Automation\workspace\AT-master

:: Oscar Only - connect  to a drive. for path below.
:: net use g: \\DEVNCSMEL\dev
::

IF [%1]==[] GOTO Error
IF [%2]==[] GOTO Error

IF [%2]==[UAT] SET GDRIVE=\\basdev.aurdev.national.com.au\app_data\NCSOnline\test_automation\Automation_Data
IF [%2]==[SIT] SET GDRIVE=\\basdev.aurdev.national.com.au\app_data\NCSOnline\test_automation\Automation_Data
IF [%2]==[E2E] SET GDRIVE=\\bastest.aurtest.national.com.au\app_data\NCSOnline\test_automation\Automation_Data
IF [%2]==[PPTE] SET GDRIVE=\\bastest.aurtest.national.com.au\app_data\NCSOnline\test_automation\Automation_Data


mvn test -Dsuitexml=OscarRunner.xml -DProj=%1 -DEnv=%2 -Dcucumber.options="%GDRIVE%\AutomationTest\Oscar\features\%1" -Dmaven.repo.local=.m2\repository -offline

Exit 0

:Error
echo.
echo   Please enter "Project Name" and then "Environment"
echo.
echo   Example: C:\OscarRunner.cmd  Project1  UAT
echo.
