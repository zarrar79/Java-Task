
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,5,6,7,8,9,10};//array initialize
        for(int i =0;i<arr.length;i++){//sorting
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }//sorting
        int sum   = 0;
        for(int i =0;i<arr.length;i++){ //display
            System.out.print(arr[i]);
            System.out.println();
            sum+=arr[i];
        }//display
        System.out.println("Sum: "+sum);//sum
        //min max
       int min = 0;
       int  max  = 0;
        for(int i =0;i<arr.length;i++){
                if(max<arr[i]){
                    max = arr[i];
            }
            else(min>arr[i])
            min = arr[i];
        }//min max
        System.out.println("Min: "+min+" Max: "+max);
    }
}