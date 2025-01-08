class Largest{
 int largeNumber=0;
    int largest(int[] array){
         
        


         for(int i=0;i<array.length;i++){
            if(array[i]>largeNumber){
                largeNumber=array[i];
            }
         }
         return largeNumber;

    }

    public static void main(String[] args){
        
        int[] arr= {10,50,60,20};
        Largest largest = new Largest();
       int large= largest.largest(arr);
        System.out.println("largest number of elements : "+large);
    }
}