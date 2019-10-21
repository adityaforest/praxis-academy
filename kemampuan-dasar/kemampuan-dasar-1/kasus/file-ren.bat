@ECHO OFF



SETLOCAL EnableDelayedExpansion

set /p path=Masukan directory path untuk dicari :

for /F "delims=" %%I in ('dir /S /B "%path%"\*.java') do (
	echo ada file java dengan nama "%%~nxI"
	set /P conf="Ganti nama file ? (y / t)"	
	if /i "!conf!" == "y" (
		
			set /P new= "Masukan nama baru (beserta ekstensi .java)= " 
		
			ren %%I "!new!" )


	)




PAUSE