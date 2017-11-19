package project1;

import java.util.ArrayList;

/**
* The ColorList class is used to store all the Color objects 
* whose hexadecimal value and name are provided in the input file.
*
*/


public class ColorList extends ArrayList<Color> {
	
	public ColorList() {}
	
	public Color getColorByName(String colorName) {
		for (int i = 0; i < size(); i++) {
			if (colorName.equalsIgnoreCase(get(i).getName())) {
				return get(i);
			}
		}
		return null;
	}
	
	public Color getColorByHexValue(String colorHexValue) {
		for (int i = 0; i < size(); i++) {
			if (colorHexValue.equalsIgnoreCase(get(i).getHexValue())) {
				return get(i);
			}
		}
		return null;
	}
}
