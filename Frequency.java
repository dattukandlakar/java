class Frequency{

    int count=0;

   void countFrequency(String frequency){
        String[] convreted = frequency.split("");
        System.out.println(convreted);
        int[] isInArray = new int[10];
       for(int i=0; i<convreted.length; i++){
        
        for(int j=0; j<convreted.length; j++){
            if(isInArray.contains(convreted[j])){
                continue;
            }
            if(convreted[i].equals(convreted[j]  )){
                count+=1;
                
              System.out.println("frequecy of : " + convreted[i] + " is : " + count);  
            }
            
        }
        count =0;
       }

        
    }

    public static void main(String[] args){

        Frequency f = new Frequency();
        f.countFrequency("Hello World");
    }
}