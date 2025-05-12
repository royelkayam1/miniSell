import java.io.File;
import java.io.IOException;
public class ShellCommandHandler {

    private File currentDirectory; // שומר את התיקיה הנוכחית שהמשתמש נמצא בה.

    public ShellCommandHandler() { // ShellCommandHandler בנאי של המחלקה
        // מאתחל את התיקייה הנוכחית לתיקיית העבודה של התוכני
        currentDirectory = new File(System.getProperty("user.dir"));  // אתחול לספרייה הנוכחית של המשתמש
    }

    public void printWorkingDirectory() { // מציג את הנתיב המלא של התיקייה הנוכחית (כמו פקודת 'pwd' בלינוקס)
        System.out.println(currentDirectory.getAbsolutePath());
    }

    public void listDirectory() {
        File[] files = currentDirectory.listFiles();  // מציג את כל הקבצים והתיקיות בתיקייה הנוכחית (כמו פקודת 'ls' בלינוקס).
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Could not list directory contents.");
        }
    }

    public void changeDirectory(String name) { //משנה את התיקייה הנוכחית לתיקייה שצוינה בשם
        if (name.equals("..")) {
            if (currentDirectory.getParentFile() != null) {
                currentDirectory = currentDirectory.getParentFile();
            } else {
                System.out.println("Already at the root directory.");
            }
        } else {
            File newDirectory = new File(currentDirectory, name);
            if (newDirectory.exists() && newDirectory.isDirectory()) {
                currentDirectory = newDirectory;
            } else {
                System.out.println("Directory does not exist.");
            }
        }
    }

    public void makeDirectory(String name) { // צר תיקייה חדשה בשם שצוין
        File newDirectory = new File(currentDirectory, name);
        if (newDirectory.mkdir()) {
            System.out.println("Directory created: " + name);
        } else {
            System.out.println("Failed to create directory: " + name);
        }
    }
    public void createFile(String name) {
        try {
            File newFile = new File(currentDirectory, name);
            if (newFile.createNewFile()) {
                System.out.println("File created: " + name);
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void printHelp() {
        System.out.println("Supported commands:");
        System.out.println("  pwd   - Show current directory path");
        System.out.println("  ls    - List contents of the current directory");
        System.out.println("  cd [dir] - Change to directory (.. to go back)");
        System.out.println("  mkdir [dir] - Create a new directory");
        System.out.println("  touch [file] - Create a new file");
        System.out.println("  help  - Show this help message");
        System.out.println("  exit  - Exit the shell");
    }

    public File getCurrentDirectory() {
        return currentDirectory;
    }
}

