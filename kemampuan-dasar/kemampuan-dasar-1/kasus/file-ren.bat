@ECHO OFF
SETLOCAL EnableDelayedExpansion

for /F "delims=" %%I in ('dir /S /B *.java') do ( 
	
	echo ada file "%%~nxI" 
	set /P conf="Ganti nama file ? (y / t)"		
	if /i "!conf!" == "y" (
		set /P new= "Masukan nama baru = " 
		ren %%I "!new!" )

	)

PAUSE