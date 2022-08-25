class Example{
    void showArray(int arr[]){
        for(int i:arr) {
            System.out.println(i);
        }
    }

    int[] getAge(){
        return new int[]{15, 16 ,17, 18, 19, 20};
    }
}
class ArrayExample {
    public static void main(String[] args) {
        // int a[] = new int[5];
        int a[] = {50, 10, 15, 20};
        int [][] two = new int[2][2];
        two[0][0] = 1;
        two[0][1] = 2;
        two[1][0] = 3;
        two[1][1] = 4;

        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        int count = 0;
        for(int i =0; i< arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = count++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                System.out.print(two[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // for(int j = 0; j <= 4; j++){
        //     a[j] = j*5;
        // }

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println(" ");
        
        Example exp = new Example();
        
        exp.showArray(new int[]{50, 10, 15, 25});
        
        System.out.println(" ");
        
        System.out.println("Allowed Ages are: ");
        for(int i:exp.getAge()){
            System.out.println(i);
        }

        System.out.println("");
        
        System.out.println(a[2]);
    }
}
