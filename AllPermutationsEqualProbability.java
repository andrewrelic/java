import java.util.Arrays;

public class AllPermutationsEqualProbability {

    public static void main(String[] args) {
        AllPermutationsEqualProbability a = new AllPermutationsEqualProbability();
        int[] array = {1, 2, 3};
        a.swapnumbers(array);
    }
    
    void swapnumbers(int[] array){
        for( int i = 0; i < array.length-1; i++){
           int j = array[i];
           array [i] = array[i+1];
           array[i+1] = j;
           System.out.println(Arrays.toString(array));
        }
    }
}
