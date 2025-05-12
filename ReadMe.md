תיאור כללי של הפרויקט:
בניתי תוכנית בגאווה שדומה לחלון "command prompt " של המחשב שמקבלת פקודות ממשתמש ומבצע פעולות על תיקיות וקבצים.
-----------------------------------------
הוראות כדי לקמפל את הקוד
באמצעות הפקודות הבאות:
לראות איפה אני נמצא כרגע בתןך התיקיה "pwd"  
להציג את כל התיקיות והקבצים שקיימים בתיקיה הנוכחית "ls"
לעבור לתיקיה אחרת "cd [dir]"
ליצור תיקיה חדשה "mkdir [dir]"
 ליצר קובץ חדש "touch [file] "
לקבל רשימת פקודות : 'help'
לצאת מהתוכנית "exit"
------------------------------------------
דוגמא לקוד:
C:\Users\user\.jdks\openjdk-23.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.1.1\lib\idea_rt.jar=58896:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.1.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\user\Desktop\MiniShellProject\out\production\MiniShellProject MiniShell
Welcome to MiniShell! Type 'help' for a list of commands.
C:\Users\user\Desktop\MiniShellProject > help
Supported commands:
pwd   - Show current directory path
ls    - List contents of the current directory
cd [dir] - Change to directory (.. to go back)
mkdir [dir] - Create a new directory
touch [file] - Create a new file
help  - Show this help message
exit  - Exit the shell
C:\Users\user\Desktop\MiniShellProject > pwd
C:\Users\user\Desktop\MiniShellProject
C:\Users\user\Desktop\MiniShellProject > 