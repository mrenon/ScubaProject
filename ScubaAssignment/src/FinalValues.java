
public interface FinalValues {

	//CHANGING MOST OF THESE VALUES.  DO NOT USE FOR FINAL TABLE!
	
	//Alphabet to let the program know which letter equals which array number
	public final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};

	//Max depth number to compare user input as well as knowing which depth equals which array number
	public final int[] maxDepth = {12, 15, 18, 21, 24, 27, 30, 33, 36, 40};
	
	//The dive table for seeing the amount dive time based off of pressure group and max depth
	public final int[][] timeTable = {{5, 15, 25, 30, 40, 50, 70, 80, 100, 110, 130},
											{-1, 10, 15}};
	
	//Dive interval portion of the table in minutes
	public final int[][] intervalTable = {{1440},     //A
											        {1440, 200},     //B
                                         {1440, 289, 99},     //C
                                         {1440, 348, 158, 69},     //D
                                         {1440, 394, 204, 117, 54},     //E
                                         {1440, 425, 237, 148, 89, 45},     //F
                                         {1440, 456, 265, 178, 119, 75, 40},     //G
                                         {1440, 479, 289, 200, 143, 101, 66, 36},     //H
                                         {1440, 501, 312, 223, 164, 122, 89, 59, 33},     //I
                                         {1440, 530, 340, 242, 184, 140, 107, 79, 54, 31},     //J
                                         {1440, 538, 348, 259, 201, 158, 123, 95, 71, 49, 28},     //K
                                         {1440, 553, 362, 275, 216, 173, 139, 109, 85, 64, 45, 26}};   //L
                             //New Group:  (A)  (B)  (C)  (D)  (E)  (F)  (G)  (H)  (I) (J) (K) (L)
	
	//Residual nitrogen times
	public final int[][] nitrogenTable = {{7, 6, 5, 4, 4, 3, 3, 3, 3, 3},     //A
											{17, 13, 11, 9, 8, 7, 7, 6, 6, 6},          //B  
                                 {25, 21, 17, 15, 13, 11, 10, 10, 9, 8},     //C
                                 {37, 29, 24, 20, 18, 16, 14, 14, 12, 11},   //D
                                 {49, 38, 30, 26, 23, 20, 18, 16, 15, 13},   //E
                                 {61, 47, 36, 31, 28, 24, 22, 20, 18, 16},   //F
                                 {73, 56, 44, 37, 32, 29, 26, 24, 21, 19},   //G
                                 {87, 66, 52, 43, 38, 33, 30, 27, 25, 22},   //H
                                 {101, 76, 61, 50, 43, 38, 34, 31, 28, 25},  //I
                                 {116, 87, 70, 57, 48, 43, 38},              //J
                                 {138, 99, 79, 64, 54, 47},                  //K 
                                 {161, 111, 88, 72, 61, 53}};		           //L 
	}
//}