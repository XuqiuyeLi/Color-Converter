package project1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Color class stores information about a particular color.
 *
 */

public class Color implements Comparable<Color>{
	private int red;
	private int green;
	private int blue;
	private String name;
	private String hexValue;
	
	
	
	public Color(String colorHexValue) {
		
		Pattern p = Pattern.compile("#[a-f0-9]+", Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(colorHexValue);
		
		if(m.matches()) {
			hexValue = colorHexValue;
			String redComponent = colorHexValue.substring(1, 3);
			String greenComponent = colorHexValue.substring(3, 5);
			String blueComponent = colorHexValue.substring(5, 7);
			
			red = Integer.parseInt(redComponent, 16);
			green = Integer.parseInt(greenComponent, 16);
			blue = Integer.parseInt(blueComponent, 16);
		}
		else {
			throw new IllegalArgumentException("Illegal argument.");
		}
		
	}
	
	public Color(String colorHexValue, String colorName) {
		
		Pattern p = Pattern.compile("#[a-f0-9]+", Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(colorHexValue);
		
		if(m.matches()) {
			hexValue = colorHexValue;
			name = colorName;
		}
		else {
			throw new IllegalArgumentException("Illegal argument.");
		}
	}
	
	public Color(int red, int green, int blue) {
		if ((red >= 0) && (red <= 255) && (green >= 0) && (green <= 255) &&	(blue >= 0) && (blue <= 255)) {
			this.red = red;
			this.green = green;
			this.blue = blue;
		}
		else {
			throw new IllegalArgumentException("Illegal argument.");
		}
		
	}
	
	public int getRed() {
		return red;
	}
	
	public int getGreen() {
		return green;
	}
	
	public int getBlue() {
		return blue;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHexValue() {
		return hexValue;
	}
	
	public boolean equals(Color anotherColor) {
		return hexValue.equalsIgnoreCase(anotherColor.hexValue);
	}
	
	public int compareTo(Color anotherColor) {
		return hexValue.compareToIgnoreCase(anotherColor.hexValue);
	}
	
	public String toString() {
		if ((name == null) || name == "") {
			return String.format("%-7s, (%3d,%3d,%3d)", hexValue.toUpperCase(), red, green, blue);
		}
		else {
			return String.format("%-7s, (%3d,%3d,%3d),\t%-15s", hexValue.toUpperCase(), red, green, blue, name);
		}
		
	} 
	
}
