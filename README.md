# Solution Homework 6

## Overview
This project demonstrates the use of **Behavioral Design Patterns** in Java. The two patterns implemented are:
- **Chain of Responsibility**: Used to handle support requests with various levels of escalation.
- **Command Pattern**: Used to control smart devices like lights and thermostats with undo functionality.

## Classes and their Purpose

### TechSupport
- **SupportHandler**: Abstract class for the chain of responsibility, where each handler can either process the request or pass it to the next handler.
- **FAQBotHandler**: Handles simple issues such as "password_reset".
- **JuniorSupportHandler**: Handles issues like "refund_request" or "billing_issue".
- **SeniorSupportHandler**: Handles complex issues like "account_ban" or "data_loss".
- **Main**: This class tests the chain of responsibility by simulating various support requests.

### SmartHome
- **Command**: Interface for the command pattern, with `execute` and `undo` methods.
- **Light**: Represents a light device that can be turned on or off.
- **Thermostat**: Represents a thermostat that can be set to a specified temperature and reverted to a previous one.
- **TurnOnLightCommand**: Command for turning on the light.
- **SetThermostatCommand**: Command for setting the thermostat's temperature.
- **SmartHomeRemoteControl**: Controls the devices using the command pattern.
- **Main**: This class tests the command pattern by simulating turning on a light and setting a thermostat.

## Conclusion
This project demonstrates two key design patterns in Java: **Chain of Responsibility** for handling support tickets and **Command Pattern** for controlling smart devices. It showcases how these patterns can be used to organize and decouple responsibilities in a clean and efficient way.
