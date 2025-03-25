class arrays{
   public static void main(String[] args) {
    //  int[]marks=new int[5];
    //  marks[0]=10;
    //  marks[1]=20;
    //  marks[2]=30;
    //  marks[3]=40;
    //  marks[4]=50;
    int[] marks = {10, 20, 30, 40, 50};
    System.err.println(marks[4]);
    for (int ele : marks) {
    System.out.println(ele);
}

//    for (int i = 0; i < marks.length; i++) {
//     System.out.println(marks[i]);
//  int[][] matrix = new int[3][3];  // 3x3 matrix
 int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
System.out.println(matrix[1][2]);  // Output: 6 (Row index 1, Column index 2)
for (int[] row : matrix) {
    for (int num : row) {
        System.out.print(num + " ");
        
    }
    System.out.println();
}



       
   }
   
   }
