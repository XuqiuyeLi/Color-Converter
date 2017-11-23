# Color-Converter
Converting color values from their hexadecimal representation to the RGB and name equivalents.

## Program Usage
 - This program should use command line arguments. When the user runs the program, he/she will provide the name of the input file containing the list of the named CSS colors as a command line argument. 
 
 - If the name of the input file provided as a command line argument is incorrect or the file cannot be opened for any reason, the program should display an error message and terminate. It should not prompt the user for an alternative name of the file. If the program is run without any arguments, the program should display an error message and terminate.

## Input and Output

 - The program should allow the user to enter a hexadecimal color value. It should produce the corresponding RGB value and the color name (if such exists).
 - The program should run in a loop allowing the user to check as many hexadecimal values as they wish. On each iteration, the user should be prompted to enter either a name (for which the program computes the results) or the word ”quit” (any case of letters should work) to indicate the termination of the program.
 - If the user enters a value that is incorrect (i.e., not a valid hexadecimal value and not the ”quit” keyword), an error message should be printed (stating that the entered string is not a valid hexadecimal color value) and the program should allow the user to enter another value.
 - If the user enters a valid hexadecimal value, that value should be displayed together with the corresponding RGB values and the CSS name (if such exists) - the program should match the formatting of the examples below.
 - If the user enters a single word ”quit” instead of the color value, the program should terminate.
