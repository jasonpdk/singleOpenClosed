package ie.gmit.exercise;

import java.io.IOException;

public class MainMessageApp {

	public static void main(String[] args) throws IOException {

		Message msg = new Message("This is a message");

		MessagePrinter printer = new MessagePrinter();

		Formatter jsonFormatter = new JSONFormatter();
		printer.writeMessage(jsonFormatter, msg, "test_msg.txt");

		// the method can be reused with a different kind of Formatter
		Formatter textFormatter = new TextFormatter();
		printer.writeMessage(textFormatter, msg, "test_msg.txt");
	}

}
