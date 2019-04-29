package com.company;
class process{
	public static void output (int array[][]){ //method for output a multi-dimensional array
		for (int i=0;i<3;i++) {// for line
			for (int j = 0; j < 3; j++) {// for column
				System.out.print(array[i][j]+" ");

			}
			System.out.println();
		}

	}

	public static int[][] Sum(int array1[][],int array2[][]){ //method of summation multidimensional arrays

		int[][] sum= new int[3][3]; //Create for Sum array
		for (int i=0;i<3;i++){// for line
			for (int j=0;j<3;j++){// for column
				sum[i][j]=array1[i][j]+array2[i][j];//summation
			}

		}
		System.out.println("Summation Multidimensional Arrays: ");
		output(sum);// for sum Get output method
		return sum;
	}

	public static int[][] Sub(int array1[][],int array2[][]){ //method of subtraction multidimensional arrays
		int[][] sub= new int[3][3]; //Create for subtract array
		for (int i=0;i<3;i++){ // for line
			for (int j=0;j<3;j++){ // for column
				sub[i][j]=array1[i][j]-array2[i][j];//subtraction
			}
		}
		System.out.println("Subtraction Multidimensional Arrays: ");
		output(sub);// for subtract Get output method
		return sub;
	}

	public static int[][] Mul(int array1[][],int array2[][]){ //method of multiplication multidimensional arrays
		int[][] Mul= new int[3][3];//Create for multiplication array
		for(int i=0; i<3;i++){ // for line
			for (int j=0;j<3;j++){ // for column
				for (int k=0;k<3;k++){ //for subtraction
					Mul[i][j]=Mul[i][j]+(array1[i][k]*array2[k][j]);
				}
			}
		}
		System.out.println("Multiplication Multidimensional Arrays: ");
		output(Mul);// for Multiplication Get output method
		return Mul;
	}

	public static int[][] Trans(int Array[][]){//method of Transpoze multidimensional arrays
		int[][] Trans=new int[3][3];//Create for Transpoze array
		for (int i=0;i<3;i++){// for line
			for (int j=0;j<3;j++){// for column
				Trans[i][j]=Array[j][i];// Transpoze
			}
		}
		System.out.println(" Transpoze Multidimensional Array: ");
		output(Trans);// for Transpoze Get output method
		return  Trans;
	}

}
public class Main {
	public static void main(String[] args) {
		int[][] arays1={{1,2,3},{4,5,6},{7,8,9}};//Multidimensional Arrays
		int[][] arays2={{1,2,3},{4,5,6},{7,8,9}};
		process.Trans(arays1);//methods used
		process.Mul(arays1,arays2);
		process.Sum(arays1,arays2);
		process.Sub(arays1,arays2);



    }
}
