package ie.gmit.exercise;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {
	//Writes message to a file
	public void writeMessage(Formatter formatter, Message msg, String fileName) throws IOException
	{
		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName)))
		{
			//creates print writer
			writer.println(formatter.format(msg)); //formats and writes message
			writer.flush();
			writer.close();
		}
	}
}
