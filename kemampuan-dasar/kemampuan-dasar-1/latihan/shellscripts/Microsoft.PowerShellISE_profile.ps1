set-location c:


$shell.BackgroundColor = “Black”
$shell.ForegroundColor = “White”

$Shell.WindowTitle=”ForestGeek”
$Shell = $Host.UI.RawUI
$size = $Shell.WindowSize
$size.width=70
$size.height=25
$Shell.WindowSize = $size
$size = $Shell.BufferSize
$size.width=70
$size.height=5000
$Shell.BufferSize = $size

new-item alias:np -value C:WindowsSystem32notepad.exe

Clear-Host