package com.riyug.assignments;

public class TwoDArrayTraversalSpiralWay {
	
	public static void main(String[] args) {
		int[][] inputArray = {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		
		traverseInSpiralWay(inputArray);
		
	}
	
	public static void traverseInSpiralWay(int[][] array) {
		
		/*Defining variables
		  1. variables left,right,top and bottom represents edges of 2D matrix
		  2. direction 0 represents - left --> right direction
		  3. direction 1 represents - top --> bottom direction
		  4. direction 2 represents - right --> left direction
		  5. direction 3 represents - bottom --> top direction
		*/
		
		int direction =0;
		int top = 0; int bottom = array.length-1; 
		int left = 0; int right = array[0].length-1;
		
		//Run while loop while all elements of array visited in spiral order
		while(top<=bottom && left<=right) {
			
			//direction 0 represents - left --> right direction
			//here we keep row constant as top and keep varying column left to right.
			
			if(direction ==0) {
				for(int i=left;i<=right;i++){
					System.out.println(array[top][i]);
				}
				//once all the values in currently pointed top row are printed , then increase top pointer by 1.
				top += 1;
			}
			
			//direction 1 represents - top --> bottom direction
			//here we keep varying row from top to bottom and keep column constant as right
			
			else if(direction ==1) {
				for(int i=top;i<=bottom;i++){
					System.out.println(array[i][right]);
				}
				
				//once all the values in currently pointed right column are printed , then decrease right pointer by 1.
				right -= 1;
			}
			
			//direction 2 represents - right --> left direction
			//here we keep row constant as bottom and keep varying column right to left.
			
			else if(direction ==2) {
				for(int i=right;i>=left;i--){
					System.out.println(array[bottom][i]);
				}
				//once all the values in currently pointed bottom row are printed , then decrease bottom pointer by 1.
				bottom -= 1;
			}
			
			//direction 3 represents - bottom --> top direction
			//here we keep varying row from bottom to top and keep column constant as left
			
			else if(direction ==3) {
				for(int i=bottom;i>=top;i--){
					System.out.println(array[i][left]);
				}
				//once all the values in currently pointed left column are printed , then increase left pointer by 1.
				left += 1;
			}
			
			/* 1. keep increasing direction for each outer while loop iteration,
			      for example (1+1)%4 = 2, so after 1 direction will updated to 2.
			   
			   2. reset the direction to 0 next to direction =3,
			      for example (3+1)%4 = 4%4 = 0, so after 3 direction will reset to 0.
			 */
			
			direction =(direction+1)%4;
			
		}
		
	}

}
