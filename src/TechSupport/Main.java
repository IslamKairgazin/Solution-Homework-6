public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        
        Command lightOn = new TurnOnLightCommand(light);
        Command setThermostat = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("lightOn", lightOn);
        remote.setCommand("setThermostat", setThermostat);

        remote.pressButton("lightOn");
        remote.pressButton("setThermostat");
        remote.undoButton("setThermostat");
    }
}
