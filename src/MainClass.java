
public class MainClass {
	
	enum Command{
		LIST,
		CHECKHOUT,
		CHECKIN,
		REGISTER,
		DEREGISTER,
		INFO,
		QUIT,
		UNKNOWN
	}
	
	public static Command parseCommand(String userInput) {
		String commandString = userInput.split(" ")[0];
		switch(commandString) {
		case "list":
			return Command.LIST;
		case "checkout":
			return Command.CHECKOUT;
		case "checkin":
			return Command.CHECKIN;
		case "register":
			return Command.REGISTER;
		case "deregister":
			return Command.DEREGISTER;
		case "info":
			return Command.INFO;
		case "quit":
			return Command.QUIT;
		default:
			return Command.UNKNOWN;
		}
	}
	
	public static String[] parseArguments(String userInput) {
		String[] commandAndArguments = userInput.split(" ");
		String[] arguments = new String[commandAndArguments.length - 1];
		for(int i=1; i < commandAndArguments.length; i++) {
			arguments[i-1] = commandAndArguments[i];
		}
		return arguments;
	}

	public static void main(String[] args) {
		
	}

}
