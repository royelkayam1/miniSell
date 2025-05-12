import java.util.Scanner;

public class MiniShell {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShellCommandHandler commandHandler = new ShellCommandHandler();

        System.out.println("Welcome to MiniShell! Type 'help' for a list of commands.");

        while (true) {
            System.out.print(commandHandler.getCurrentDirectory().getAbsolutePath() + " > ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            switch (command) {
                case "pwd":
                    commandHandler.printWorkingDirectory();
                    break;
                case "ls":
                    commandHandler.listDirectory();
                    break;
                case "cd":
                    if (parts.length > 1) {
                        commandHandler.changeDirectory(parts[1]);
                    } else {
                        System.out.println("cd: missing argument");
                    }
                    break;
                case "mkdir":
                    if (parts.length > 1) {
                        commandHandler.makeDirectory(parts[1]);
                    } else {
                        System.out.println("mkdir: missing argument");
                    }
                    break;
                case "touch":
                    if (parts.length > 1) {
                        commandHandler.createFile(parts[1]);
                    } else {
                        System.out.println("touch: missing argument");
                    }
                    break;
                case "help":
                    commandHandler.printHelp();
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Unknown command. Type 'help' to see available commands.");
            }
        }
    }
}