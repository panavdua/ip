package panav.command;

import panav.exception.DukeException;
import panav.storage.Storage;
import panav.task.TaskList;
import panav.ui.Ui;

/**
 * Class to encapsulate a 'mark' command, extends from EditCommand.
 */
public class UnmarkCommand extends EditCommand {

    public static final String COMMAND_WORD = "unmark";
    private final String fullCommand;

    public UnmarkCommand(String fullCommand) {
        this.fullCommand = fullCommand;
    }


    /**
     * Specifies the behaviour of 'mark' or 'unmark' command when called to execute. Reads from the user
     * input the task index, and either marks or unmarks the task in the list.
     * @param tasks the list of tasks.
     * @param ui ui to interact with user.
     * @param storage storage to read/write text in file.
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        String text = "";
        try {
            int lengthTasks = tasks.getLength();
            // ArrayList of tasks has to be non-empty to be able to mark/unmark a task.
            assert (lengthTasks > 0);
            int editIndex = super.readNumber(fullCommand, lengthTasks);
            if (tasks.isNotMarked(editIndex - 1)) {
                return "The task you are trying to unmark is already not marked!!";
            }
            text = tasks.unmarkTask(editIndex - 1);
        } catch (DukeException e) {
            return e.getMessage();
        }
        return text;

    }

    @Override
    public String toString() {
        return UnmarkCommand.COMMAND_WORD;
    }
}
