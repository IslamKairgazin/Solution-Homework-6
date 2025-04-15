import java.util.HashMap;

public class SmartHomeRemoteControl {
    private HashMap<String, Command> commandSlots = new HashMap<>();

    public void setCommand(String slot, Command command) {
        commandSlots.put(slot, command);
    }

    public void pressButton(String slot) {
        commandSlots.get(slot).execute();
    }

    public void undoButton(String slot) {
        commandSlots.get(slot).undo();
    }
}
