
public class Chapter5Class {

	int ctr=0;
	
	//Arr[] is the whole array, double since we are getting average
	//num is the length of the Array Arr[]
	//sum is passed as 0 bec. this will be used for containing the sum
	double Ave10(double Arr[], int num, double sum){
		if(ctr==num)
			return sum/num; //base case divides sum over length
		else
			return Ave10(Arr, num, sum+Arr[ctr++]);//recursion sum+Arr[ctr++] adds all numbers in Arr[]
	}
	
	
}
