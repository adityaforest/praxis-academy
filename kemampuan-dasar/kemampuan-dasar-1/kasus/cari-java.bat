@ECHO OFF



SETLOCAL EnableDelayedExpansion

set /p path=Masukan directory path untuk dicari :

for /F "delims=" %%I in ('dir /S /B "%path%"\*.java') do echo ada file java pada directory "%%I" 




PAUSE