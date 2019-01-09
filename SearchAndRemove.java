// The "SearchAndRemove" class.

// Programmer: Cameron Dufault
// Date: April 27 2017
// File: SearchAndRemove.java
// Description: This program searches for a certain entered number in an array, outputs index, and removes element

import java.io.*;
public class SearchAndRemove
{
    public static void main (String[] args) throws IOException
    {
	int num; //holds the number to be entered by the user
	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));
	System.out.print("Enter num: ");
	num = Integer.parseInt(kbi.readLine());
	

	int[] array = new int [30]; //array to hold numbers in order
	for (int x = 0 ; x < array.length ; x++) //add numbers 101- 130 to array
	{
	    array [x] = 100 + (x + 1);
	    System.out.print (array [x] + " ");
	}//end fir

	int highIndex = array.length; //high index is the last index of array being search
	int lowIndex = 0; //low index is last index of array being searched
	int midIndex = 0; //the middle index of array being searched
	boolean found = false; //whether or not the number being searched for has been found

	//this loop uses binary search to loacte the index of  the entered number in the array 
	while (found == false)
	{
	    midIndex = (lowIndex + highIndex) / 2; //middle index is halfway between lowest and highest
	    if (array [midIndex] == num) //if the middle index is the number being searched for
		found = true;
	    else if (array [midIndex] < num) //if the middle index less than number being searched for
		lowIndex = midIndex; //the lowest index is how the previous mid index
	    else if (array [midIndex] > num) //if the middle index more than number being searched for
		highIndex = midIndex;  //the highest index is now the previous mid index                
	}//end while
	
	System.out.println("\nThe element is at index: " + midIndex);
	
	//shifting elements over 1 to left
	for(int x = midIndex; x < array.length - 1; x ++)
	{
	    array[x] = array [x +1];
	}
	
	array[array.length -1] = 0; //last element now 0
	
	//outputting aray again
	for (int x = 0 ; x < array.length; x++)
	{
	    System.out.print (array [x] + " ");
	}

    } // main method
} // SearchAndRemove class
