package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* The ColorConverter class is the actual program. 
* This is the class that should contain the main method.
* It is responsible for opening and reading the data file, obtaining user input, 
* performing some validation and handling all errors that may occur.
*
*/

public class ColorConverter {
	
	public static Scanner input;
	public static void main(String[] args) {
		
		File file = new File(args[0]);
		
		ColorList colorList = new ColorList();
		
		try {
			input = new Scanner(file);
			
			while (input.hasNext()) {
				String line = input.nextLine();
				String [] tokens = line.split(", ");
				Color color = new Color(tokens[1], tokens[0]);
				colorList.add(color);
			}

			// Close the file
			input.close();
		} 
		catch (FileNotFoundException e) {
			System.err.println("Error: the file " + args[0] + " cannot be opened.");
			System.exit(1);
		}
		
		input = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the color in HEX format (#RRGGBB) or \"quit\" to stop:");
			String colorStr = input.nextLine();
			Pattern p = Pattern.compile("#[a-f0-9]+", Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(colorStr);
			
			if(colorStr.equalsIgnoreCase("quit"))
				System.exit(0);
			else 
				if (m.matches()) {
					Color color = new Color(colorStr);
					String nameColor = "";
					if(colorList.getColorByHexValue(color.getHexValue()) != null)
						nameColor = colorList.getColorByHexValue(color.getHexValue()).getName();
					System.out.println("\nColor information:\n" + color.toString() + ", " + nameColor + "\n\n");
				}
				else {
					System.out.println("Error: This is not a valid color specification.\n");
				}
		}
	}

}
