import Exception.InvalidDateException;
import java.util.Scanner;

import Command.*;
import Enums.Command;
import Exception.InvalidInputException;
import Exception.InvalidTimeException;
import Exception.InvalidCommandException;
import Exception.MissingArgumentException;
import Parser.CommandParser;
import Parser.Time;
import Task.Events;
import Task.TaskList;
import Task.ToDo;
import Ui.Reply;

public class Duke {

    private static TaskList tasks = TaskList.init();
    private static Reply reply = Reply.init();
    public static void main(String[] args) {
        //Start user interaction
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                String input = scanner.nextLine();
                if (input.toLowerCase().equals(Command.BYE.getCommand())) {
                    reply.printDialog("Bye. Hope to see you again soon!");
                    return;
                } else if (input.toLowerCase().equals(Command.LIST.getCommand())) {
                    tasks.printTasks();
                } else if (input.startsWith(Command.MARK.getCommand())) {
                    MarkCommand.start(input);
                } else if (input.startsWith(Command.UNMARK.getCommand())) {
                    UnmarkCommand.start(input);
                } else if (input.toLowerCase().equals(Command.TODO.getCommand())) {
                    ToDoCommand.start();
                } else if (input.toLowerCase().equals(Command.DEADLINE.getCommand())) {
                    DeadlineCommand.start();
                } else if (input.toLowerCase().equals(Command.EVENT.getCommand())) {
                    EventCommand.start();
                } else if (input.startsWith(Command.DELETE.getCommand())) {
                    DeleteCommand.start(input);
                } else {
                    throw new InvalidCommandException();
                }
            } catch (InvalidInputException e) {
                reply.printDialog(e.toString());
            } catch (MissingArgumentException e) {
                reply.printDialog(e.toString());
            } catch (InvalidCommandException e) {
                reply.printDialog(e.toString());
            }
        }
    }


}