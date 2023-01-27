public class TodoCommand extends Command {

    public static final String COMMAND_WORD = "todo";
    private String todoMessage;
    public TodoCommand(String todoMessage) {
        this.todoMessage = todoMessage;
    }

    public void execute(TaskList tasks, Ui ui, Storage storage) {
        try {
            Task curr = new ToDo(this.todoMessage);
            tasks.addTask(curr);
            ui.showAddTaskMessage(tasks, curr);
        } catch (ToDoDescriptionException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return TodoCommand.COMMAND_WORD;
    }
}
