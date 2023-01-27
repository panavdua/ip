public class ListCommand extends Command {

    public static final String COMMAND_WORD = "list";
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showLine();
        System.out.println("Here are the tasks in your list:");
        tasks.printAllTasks();
        ui.showLine();
    }

    @Override
    public String toString() {
        return ListCommand.COMMAND_WORD;
    }
}
