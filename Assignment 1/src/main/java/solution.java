public class solution {

    public String solve4A(int w){
        if(w <= 2) return "NO";
        if(w % 2 == 0){
            return "YES";
        } else {
            return "NO";
        }
    }


    public String solve69A(int size, int[][] arr){
        boolean equil = true;
        for(int i = 0; i < 3; i++){
            int sumCol = 0;
            for(int j = 0; j < size; j++){
                sumCol += arr[j][i];
            }
            if(sumCol!=0){
                equil = false;
                break;
            }
        }
        if(equil==false) {
            return "NO";
        }
        return"YES";
    }
}
