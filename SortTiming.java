// Programmer: Cameron Dufault
// Date: April 26 2017
// File: SortTiming.java
// Description: This program investigate the speed of 3 sorting algorithms in a number of scenarios

public class SortTiming
{
    public static void main (String[] args)
    {
	long currentTime; //the time before sorting
	long endTime; //the time after sorting

	//integer arrays of 10 numbers
	int tenArray1[] = new int [10];
	int tenArray2[] = new int [10];
	int tenArray3[] = new int [10];

	//integer arrays with 500000 elements
	int fiftythousandArray1[] = new int [50000];
	int fiftythousandArray2[] = new int [50000];
	int fiftythousandArray3[] = new int [50000];

	//double arrays with 50000 elements
	double dfiftythousandArray1[] = new double [50000];
	double dfiftythousandArray2[] = new double [50000];
	double dfiftythousandArray3[] = new double [50000];

	//arrays of 10 filled
	fillIntArray (tenArray1, tenArray2, tenArray3);

	/////////////////////////////////////////////////testing algoritms on size 10 arrays. arrays are displayed before and after sorting
	
	//bubble sort
	System.out.println ("Bubble Sort");
	displayIntArray (tenArray1);
	currentTime = System.currentTimeMillis ();
	intBubbleSort (tenArray1);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);
	displayIntArray (tenArray1);

	//quick sort
	System.out.println ("Qucik Sort");
	displayIntArray (tenArray2);
	currentTime = System.currentTimeMillis ();
	intQuickSort (tenArray2);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);
	displayIntArray (tenArray2);

	//insertion sort
	System.out.println ("Insertion Sort");
	displayIntArray (tenArray3);
	currentTime = System.currentTimeMillis ();
	intInsertionSort (tenArray3);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);
	displayIntArray (tenArray3);

	//////////////////////////////////////////////general speed test on size 50000 arrays. Ascending sort

	fillIntArray (fiftythousandArray1, fiftythousandArray2, fiftythousandArray3);
	System.out.println ("General sorts on random int array. First is bubble, next is quick, next insertion");

	//bubble sort on int arrya
	currentTime = System.currentTimeMillis ();
	intBubbleSort (fiftythousandArray1);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//quick sort on int array
	currentTime = System.currentTimeMillis ();
	intQuickSort (fiftythousandArray2);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//insertion sort on int array
	currentTime = System.currentTimeMillis ();
	intInsertionSort (fiftythousandArray3);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	filldoubleArray (dfiftythousandArray1, dfiftythousandArray2, dfiftythousandArray3);

	System.out.println ("General sorts on random double array. First is bubble, next is quick, next insertion");
	//bubble sort on double arrya
	currentTime = System.currentTimeMillis ();
	doubleBubbleSort (dfiftythousandArray1);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//quick sort on double array
	currentTime = System.currentTimeMillis ();
	doubleQuickSort (dfiftythousandArray2);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//insertion sort on double array
	currentTime = System.currentTimeMillis ();
	doubleInsertionSort (dfiftythousandArray3);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//-------------------------------------------worst case. Arrays preiovusly sorted in ascending are now sorted in descending
	//bubble sort on int arrya backwards
	System.out.println ("Worst case sorts on integer arrays. First is bubble, next is quick, next insertion");
	currentTime = System.currentTimeMillis ();
	intBubbleSortBackwards (fiftythousandArray1);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//quick sort on int array backwards
	currentTime = System.currentTimeMillis ();
	intQuickSortBackwards (fiftythousandArray2);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//insertion sort on int array backwards
	currentTime = System.currentTimeMillis ();
	intInsertionSortBackwards (fiftythousandArray3);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	System.out.println ("Worst case sorts on double arrays. First is bubble, next is quick, next insertion");
	//bubble sort on double arrya backwards
	currentTime = System.currentTimeMillis ();
	doubleBubbleSortBackwards (dfiftythousandArray1);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//quick sort on double array backwards
	currentTime = System.currentTimeMillis ();
	doubleQuickSortBackwards (dfiftythousandArray2);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//insertion sort on double array backwards
	currentTime = System.currentTimeMillis ();
	doubleInsertionSortBackwards (dfiftythousandArray3);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	///////////////////////Alredy Sorted. Arrays which were just sorted are now sorted again in same way//////////////////////////////////////////
	System.out.println ("Best case sorts on integer arrays. First is bubble, next is quick, next insertion");
	//bubble sort on sorted int array
	currentTime = System.currentTimeMillis ();
	intBubbleSortBackwards (fiftythousandArray1);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//quick sort on sorted int array
	currentTime = System.currentTimeMillis ();
	intQuickSortBackwards (fiftythousandArray2);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//insertion sort on sorted int array
	currentTime = System.currentTimeMillis ();
	intInsertionSortBackwards (fiftythousandArray3);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	System.out.println ("Best case sorts on double arrays. First is bubble, next is quick, next insertion");
	//bubble sort on sorted double array
	currentTime = System.currentTimeMillis ();
	doubleBubbleSortBackwards (dfiftythousandArray1);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//quick sort on sorted double array
	currentTime = System.currentTimeMillis ();
	doubleQuickSortBackwards (dfiftythousandArray2);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//insertion sort on sorted double array
	currentTime = System.currentTimeMillis ();
	doubleInsertionSortBackwards (dfiftythousandArray3);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	///////////////////////////////////////////////////frist and last element swapped in arrays that are otherwise pre sorted
	swapIntArray (fiftythousandArray1, fiftythousandArray2, fiftythousandArray3);
	swapDoubleArray (dfiftythousandArray1, dfiftythousandArray2, dfiftythousandArray3);
	
	
    System.out.println ("sorts on integer arrays where only first and last element are out of order. First is bubble, next is quick, next insertion");
	//bubble sort on int array
	currentTime = System.currentTimeMillis ();
	intBubbleSortBackwards (fiftythousandArray1);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//quick sort in int array
	currentTime = System.currentTimeMillis ();
	intQuickSortBackwards (fiftythousandArray2);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//insertion sort on int array
	currentTime = System.currentTimeMillis ();
	intInsertionSortBackwards (fiftythousandArray3);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);
	
	
	System.out.println ("sorts on double arrays where only first and last element are out of order. First is bubble, next is quick, next insertion");
	//bubbble sort on double array
	currentTime = System.currentTimeMillis ();
	doubleBubbleSortBackwards (dfiftythousandArray1);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//quick sort on double array
	currentTime = System.currentTimeMillis ();
	doubleQuickSortBackwards (dfiftythousandArray2);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);

	//insertion sort on double array
	currentTime = System.currentTimeMillis ();
	doubleInsertionSortBackwards (dfiftythousandArray3);
	endTime = System.currentTimeMillis ();
	System.out.println (endTime - currentTime);


    } // main method//


    //////////////////////////////////////Displaying//////////////////////////////////////////////////////////


    public static void displayIntArray (int[] list)
    {
	for (int a = 0 ; a < list.length ; a++)
	    System.out.print (list [a] + " ");
	System.out.println ("\n");
    } //displayIntArray method


    public static void displayDoubleArray (double[] list)
    {
	for (int a = 0 ; a < list.length ; a++)
	    System.out.print (list [a] + " ");
	System.out.println ("\n");
    } //displayDoubleArray


    //////////////////////////////////////////////////////////Sorting methods////////////////////////////

    public static void intBubbleSort (int[] list)  //this method uses the bubble sort to sort an integer array in ascending order
    {
	int temp; //holds one element being swapped
	boolean swap; //whether or not swap

	//this loop compares elements to the ones beside it and swaps
	do
	{
	    swap = false; //no== swaps have occurred yet

	    for (int index = 0 ; index < list.length - 1 ; index++) //passing thorugh doing swaps
	    {
		if (list [index] > list [index + 1])
		{
		    //swapping
		    temp = list [index];
		    list [index] = list [index + 1];
		    list [index + 1] = temp;

		    swap = true; //a swap has occurred
		}
	    }
	}
	while (swap == true); //keep passing thuorhg until no swaps occur
    } // intBubbleSort method


    public static void intQuickSort (int[] array)
    {
	//secondary call to the method to provide all the necessary information to the quicksort
	intQuickSort (array, 0, array.length - 1);

    } //intQuickSort method 1


    public static void intQuickSort (int[] array, int lowIndex, int highIndex)
    {
	//lowIndex keeps track of lowest index of array or sub-array, high index keeps track of highest of array or sub-array
	int temp;
	int lp, rp; //left pointer and right pointer
	int pivot; //important element around which we sort

	//need to assign lp and rp values;
	lp = lowIndex;
	rp = highIndex;

	pivot = array [(lowIndex + highIndex) / 2];

	do
	{

	    while (array [lp] < pivot)
		lp++;  //movesw left pointer inwards

	    while (array [rp] > pivot)
		rp--;  //moves left pointer inwards

	    //ensure left pointer and right pointer have not crossed
	    if (lp <= rp)
	    {

		temp = array [rp];
		array [rp] = array [lp];
		array [lp] = temp;

		lp++;
		rp--;
	    }
	}
	while (lp < rp);  //left pointer has not crossed

	//check for sub array to the left of pivot
	if (rp > lowIndex)
	    intQuickSort (array, lowIndex, rp);

	//check for sub-array to the right of pivot
	if (lp < highIndex)
	    intQuickSort (array, lp, highIndex);


    } //intQuickSort method 2

    public static void doubleBubbleSort (double[] list)  //has same mechanic as intBubbleSort excepet for it sort doubles
    {
	double temp;
	boolean swap;

	do
	{
	    swap = false;

	    for (int index = 0 ; index < list.length - 1 ; index++)
	    {
		if (list [index] > list [index + 1])
		{
		    temp = list [index];
		    list [index] = list [index + 1];
		    list [index + 1] = temp;

		    swap = true;
		}
	    }
	}
	while (swap == true);
    } //doubleBubbleSort method


    public static void doubleQuickSort (double[] array)
    {
	//secondary call to the method to provide all the necessary information to the quicksort
	doubleQuickSort (array, 0, array.length - 1);

    } //main method


    public static void doubleQuickSort (double[] array, int lowIndex, int highIndex)
    {
	//lowIndex keeps track of lowest index of array or sub-array, high index keeps track of highest of array or sub-array
	double temp;
	int lp, rp; //left pointer and right pointer
	double pivot; //important element around which we sort

	//need to assign lp and rp values;
	lp = lowIndex;
	rp = highIndex;

	pivot = array [(lowIndex + highIndex) / 2];

	do
	{

	    while (array [lp] < pivot)
		lp++;  //movesw left pointer inwards

	    while (array [rp] > pivot)
		rp--;  //moves left pointer inwards

	    //ensure left pointer and right pointer have not crossed
	    if (lp <= rp)
	    {

		temp = array [rp];
		array [rp] = array [lp];
		array [lp] = temp;

		lp++;
		rp--;
	    }
	}
	while (lp < rp);  //left pointer has not crossed

	//check for sub array to the left of pivot
	if (rp > lowIndex)
	    doubleQuickSort (array, lowIndex, rp);

	//check for sub-array to the right of pivot
	if (lp < highIndex)
	    doubleQuickSort (array, lp, highIndex);

    }//doubleQuickSort method


    public static void intInsertionSort (int[] array)
    {
	int temp; //temporary storage when swapping or shifting

	//Assumem that element 0 is in order as it is alone
	//indexKEy is the index of the key element which is the element we are currently examining

	for (int indexKey = 1 ; indexKey < array.length ; indexKey++)
	{
	    //check if key is out of order, we know  this if element to the left is bigger than the key
	    if (array [indexKey] < array [indexKey - 1])
	    {
		//out of order
		temp = array [indexKey];

		//now try to finde where the key belongs
		//loc - index of elements to the left of the key

		int loc = indexKey - 1;
		//keep moving leftward unitl we find where the key belongs
		while (array [loc] > array [indexKey])
		{
		    loc--;
		    //in th event the key belongs at the very first element (index 0) we need to stop moving
		    if (loc == -1)
			break;


		} //end while
		//once we are out of the loop weve gone one element past where key belongs.So adjust loc
		loc++;

		//Shift elements over
		for (int z = indexKey ; z > loc ; z--)
		{
		    array [z] = array [z - 1];
		} //for
		array [loc] = temp; //inserting key element in the right location
	    }

	} //for loop

    }//intInsertionSort method


    public static void doubleInsertionSort (double[] array)
    {

	double temp; //temporary storage when swapping or shifting

	//Assumem that element 0 is in order as it is alone
	//indexKEy is the index of the key element which is the element we are currently examining

	for (int indexKey = 1 ; indexKey < array.length ; indexKey++)
	{
	    //check if key is out of order, we know  this if element to the left is bigger than the key
	    if (array [indexKey] < array [indexKey - 1])
	    {
		//out of order
		temp = array [indexKey];

		//now try to finde where the key belongs
		//loc - index of elements to the left of the key

		int loc = indexKey - 1;
		//keep moving leftward unitl we find where the key belongs
		while (array [loc] > array [indexKey])
		{
		    loc--;
		    //in th event the key belongs at the very first element (index 0) we need to stop moving
		    if (loc == -1)
			break;


		} //end while
		//once we are out of the loop weve gone one element past where key belongs.So adjust loc
		loc++;

		//Shift elements over
		for (int z = indexKey ; z > loc ; z--)
		{
		    array [z] = array [z - 1];
		} //for
		array [loc] = temp; //inserting key element in the right location
	    }

	} //for loop
    }//doubleInsertionSort method


    //----------------------------------------------------------------------backwards sorts
    public static void intBubbleSortBackwards (int[] list) //has same mechanic as intBubbleSort excepet for it sorts in descending order
    {
	int temp;
	boolean swap;
	do
	{
	    swap = false;

	    for (int index = 0 ; index < list.length - 1 ; index++)
	    {
		if (list [index] < list [index + 1])
		{
		    temp = list [index];
		    list [index] = list [index + 1];
		    list [index + 1] = temp;

		    swap = true;
		}
	    }
	}
	while (swap == true);

    }//intBubbleSortBackwards methhod

    public static void doubleBubbleSortBackwards (double[] list) //has same mechanic as intBubbleSort excepet for it sorts in descending order and sorts arrays of doubles
    {
	double temp;
	boolean swap;

	do
	{
	    swap = false;

	    for (int index = 0 ; index < list.length - 1 ; index++)
	    {
		if (list [index] < list [index + 1])
		{
		    temp = list [index];
		    list [index] = list [index + 1];
		    list [index + 1] = temp;

		    swap = true;
		}
	    }
	}
	while (swap == true);

    }//doubleBubbleSortBackwards method


    public static void intQuickSortBackwards (int[] array)
    {
	//secondary call to the method to provide all the necessary information to the quicksort
	intQuickSortBackwards (array, 0, array.length - 1);

    } // method


    public static void intQuickSortBackwards (int[] array, int lowIndex, int highIndex)
    {
	//lowIndex keeps track of lowest index of array or sub-array, high index keeps track of highest of array or sub-array
	int temp;
	int lp, rp; //left pointer and right pointer
	int pivot; //important element around which we sort

	//need to assign lp and rp values;
	lp = lowIndex;
	rp = highIndex;

	pivot = array [(lowIndex + highIndex) / 2];

	do
	{

	    while (array [lp] > pivot)
		lp++;  //movesw left pointer inwards

	    while (array [rp] < pivot)
		rp--;  //moves left pointer inwards

	    //ensure left pointer and right pointer have not crossed
	    if (lp <= rp)
	    {

		temp = array [rp];
		array [rp] = array [lp];
		array [lp] = temp;

		lp++;
		rp--;
	    }
	}
	while (lp < rp);  //left pointer has not crossed

	//check for sub array to the left of pivot
	if (rp > lowIndex)
	    intQuickSortBackwards (array, lowIndex, rp);

	//check for sub-array to the right of pivot
	if (lp < highIndex)
	    intQuickSortBackwards (array, lp, highIndex);


    }//intQuickSortBackwards method


    public static void doubleQuickSortBackwards (double[] array)
    {
	//secondary call to the method to provide all the necessary information to the quicksort
	doubleQuickSortBackwards (array, 0, array.length - 1);

    } //method


    public static void doubleQuickSortBackwards (double[] array, int lowIndex, int highIndex)
    {
	//lowIndex keeps track of lowest index of array or sub-array, high index keeps track of highest of array or sub-array
	double temp;
	int lp, rp; //left pointer and right pointer
	double pivot; //important element around which we sort

	//need to assign lp and rp values;
	lp = lowIndex;
	rp = highIndex;

	pivot = array [(lowIndex + highIndex) / 2];

	do
	{

	    while (array [lp] > pivot)
		lp++;  //movesw left pointer inwards

	    while (array [rp] < pivot)
		rp--;  //moves left pointer inwards

	    //ensure left pointer and right pointer have not crossed
	    if (lp <= rp)
	    {

		temp = array [rp];
		array [rp] = array [lp];
		array [lp] = temp;

		lp++;
		rp--;
	    }
	}
	while (lp < rp);  //left pointer has not crossed

	//check for sub array to the left of pivot
	if (rp > lowIndex)
	    doubleQuickSortBackwards (array, lowIndex, rp);

	//check for sub-array to the right of pivot
	if (lp < highIndex)
	    doubleQuickSortBackwards (array, lp, highIndex);


    }// doubleQuickSortBackwards method 


    public static void intInsertionSortBackwards (int[] array)
    {
	int temp; //temporary storage when swapping or shifting

	//Assumem that element 0 is in order as it is alone
	//indexKEy is the index of the key element which is the element we are currently examining

	for (int indexKey = 1 ; indexKey < array.length ; indexKey++)
	{
	    //check if key is out of order, we know  this if element to the left is bigger than the key
	    if (array [indexKey] > array [indexKey - 1])
	    {
		//out of order
		temp = array [indexKey];

		//now try to finde where the key belongs
		//loc - index of elements to the left of the key

		int loc = indexKey - 1;
		//keep moving leftward unitl we find where the key belongs
		while (array [loc] < array [indexKey])
		{
		    loc--;
		    //in th event the key belongs at the very first element (index 0) we need to stop moving
		    if (loc == -1)
			break;


		} //end while
		//once we are out of the loop weve gone one element past where key belongs.So adjust loc
		loc++;

		//Shift elements over
		for (int z = indexKey ; z > loc ; z--)
		{
		    array [z] = array [z - 1];
		} //for
		array [loc] = temp; //inserting key element in the right location
	    }

	} //for loop
    }//intInsertionSortBackwards methid


    public static void doubleInsertionSortBackwards (double[] array)
    {
	double temp; //temporary storage when swapping or shifting

	//Assumem that element 0 is in order as it is alone
	//indexKEy is the index of the key element which is the element we are currently examining

	for (int indexKey = 1 ; indexKey < array.length ; indexKey++)
	{
	    //check if key is out of order, we know  this if element to the left is bigger than the key
	    if (array [indexKey] > array [indexKey - 1])
	    {
		//out of order
		temp = array [indexKey];

		//now try to finde where the key belongs
		//loc - index of elements to the left of the key

		int loc = indexKey - 1;
		//keep moving leftward unitl we find where the key belongs
		while (array [loc] < array [indexKey])
		{
		    loc--;
		    //in th event the key belongs at the very first element (index 0) we need to stop moving
		    if (loc == -1)
			break;


		} //end while
		//once we are out of the loop weve gone one element past where key belongs.So adjust loc
		loc++;

		//Shift elements over
		for (int z = indexKey ; z > loc ; z--)
		{
		    array [z] = array [z - 1];
		} //for
		array [loc] = temp; //inserting key element in the right location
	    }

	} //for loop
    }//doubleInsertionSortBackwards methid

    /////////////////FILLING ARRAYS//////////////////////////////////////////////////

    public static void fillIntArray (int[] list1, int[] list2, int[] list3)//this method fills all three int arrays 
    {
	int num; //the number to be aadded to each int array 
	for (int x = 0 ; x < list1.length ; x++)
	{
	    //each array filled with same numbers
	    num = (int) (Math.random () * (10000 - (-10000) + 1) - 10000);
	    list1 [x] = num;
	    list2 [x] = num;
	    list3 [x] = num;

	}
    }//fillIntArray method


    public static void filldoubleArray (double[] list1, double[] list2, double[] list3)
    {

	double num; //the number to be aadded to each double array 
	for (int x = 0 ; x < list1.length ; x++)
	{
	    //each array filled with same numbers
	    num =  (Math.random () * (10000 - (-10000) + 1) - 10000);
	    list1 [x] = num;
	    list2 [x] = num;
	    list3 [x] = num;

	}
    } //fillDoubleArray method


    ///////////////////////////////////////////////swappping/////////////

    public static void swapIntArray (int[] list1, int[] list2, int[] list3) //swapping the first and last elements on each int array
    {
	int temp; 

	//basic swapping mechanics
	temp = list1 [0];
	list1 [0] = list1 [list1.length - 1];
	list1 [list1.length - 1] = temp;

	temp = list2 [0];
	list2 [0] = list2 [list2.length - 1];
	list2 [list2.length - 1] = temp;

	temp = list3 [0];
	list3 [0] = list3 [list3.length - 1];
	list3 [list3.length - 1] = temp;

    }//swapIntArray method


    public static void swapDoubleArray (double[] list1, double[] list2, double[] list3) //swapping the first and last elements on each double array
    {
	double temp;

	//basic swapping mechanics
	temp = list1 [0];
	list1 [0] = list1 [list1.length - 1];
	list1 [list1.length - 1] = temp;

	temp = list2 [0];
	list2 [0] = list2 [list2.length - 1];
	list2 [list2.length - 1] = temp;

	temp = list3 [0];
	list3 [0] = list3 [list3.length - 1];
	list3 [list3.length - 1] = temp;


    }//swapDoubleArray method

}//SortTiming class
