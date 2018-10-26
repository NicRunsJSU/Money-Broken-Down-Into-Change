# Money-Broken-Down-Into-Change
An assignment for my technical writing class at Jacksonville State University. October 2018
## What Does it Do?
This program takes the user input in the form of a dollar amount (double) and breaks down the money into its change equivelent. The program runs in Command Prompt or Terminal
## Prerequisites
For this program to work, you must select the right form of [JAVA SE](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) for your operating system.
## How To Install
1. Download the program to your machine. The program should download in the form of a zipfile called Lab2BAttemptTwo.zip.
2. Decompress the zip file and save it to the location where you would like the program to reside on your machine.
3. Open Command Prompt or Terminal and change the directory to the location of the program file.
4. Through Command Prompt/Terminal, run the program. 
## How Does the Program Work?
1. The program first imports the appropiate library and intializes the variables. These variables are in the form of intergers, doubles, and one boolean. The intergers represent the amount of each types of change(i.e. quarters, dimes, nickels).The doubles represent the amount of money the user wants broken down and the amount of change left to be broken down. Finally, the boolean represents whether there is any change left to be broken down. 
2. The program first takes the user input, divides it by the largest form of change, and then sets that form of change equal to that. It then finds the change that is left over by using the % operator with the intial change and the value of the currency we are looking for.
For Example:
```
dollars = (int) (userInput / 1); 
change = userInput % 1;
```
3. The program then repeats this code for each type of change and it's values, decrementing the amount of change left over using the % operator with the appropiate value. 
4. When there is no change left over (change == 0), the program sets the stillHasMoney boolean to false. 
5. The program then prints a line outputting the amount of change that the user input can be broken down into.
## Developed Using 
This program was developed using [NetBeans 8.2](https://netbeans.org/downloads/).  
## Author
This program was created by Nicholas Morrison while under the instruction of Jay Snellen.
