public class solution {
    public boolean odd = false;
    boolean even_odd(int n){
        boolean ans = false;
        if(n%2 == 0){
            ans = true;
        } else {
            ans = false;
        }
        if(odd) ans = !ans;
        return ans;
    }
    int [] max_min(int [] arr, int size){
        int [] arr2 = new int[2];
        arr2[0] = Integer.MIN_VALUE;
        arr2[1] = Integer.MAX_VALUE;
        for(int i = 0; i < size; i++){
            if(arr[i] > arr2[0]){
                arr2[0] = arr[i];
            }
            if(arr[i] < arr2[1]) {
                arr2[1] = arr[i];
            }
        }
        return arr2;
    }



}