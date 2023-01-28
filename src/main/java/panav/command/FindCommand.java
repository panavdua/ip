package panav.command;

import panav.storage.Storage;

import panav.task.TaskList;

import panav.ui.Ui;

/**
 * Class to represent the 'find' command.
 */
public class FindCommand extends Command {

    public static final String COMMAND_WORD = "find";

    String keyWord;

    public FindCommand(String keyWord) {
        this.keyWord = keyWord;
    }

    /**
     * Method represents the functionality when 'find' command is types.
     * @param tasks the tasks in the list.
     * @param ui ui to interact with user.
     * @param storage storage to read/write from files.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showLine();
        System.out.println("Here are the matching tasks in your list:");
        tasks.printTasksContainingKeyword(this.keyWord);
        ui.showLine();
    }

}