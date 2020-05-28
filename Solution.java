public class Solution {

    int [] nmbOfOnesArray;
    public int[] countBits(int num) {
        nmbOfOnesArray=new int[num+1];
        nmbOfOnesArray[0]=0;
        for(int i=1; i<num+1; i++){
            calculateOnes(i);
        }
        return nmbOfOnesArray;
    }


    private void calculateOnes(int nmb){
        nmbOfOnesArray[nmb]=nmbOfOnesArray[nmb-(int)Math.pow(2,(int) (Math.log(nmb)/Math.log(2)))]+1;
    }
}
