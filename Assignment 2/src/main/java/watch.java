public class watch {
    private String state= "NORMAL";
    private String state1 = "TIME";
    int m=0,h=0, D=1,M=1, Y=2000;

    public void change_state(String input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.print(state + " ");
            System.out.print(state1+" ");
            System.out.println(input.charAt(i));
            switch (state) {
                case "NORMAL":
                    if (input.charAt(i) == 'c') {
                        state = "UPDATE";
                        state1 = "MIN";
                    } else if (input.charAt(i) == 'b') {
                        state = "ALARM";
                        state1 = "ALARM";
                    } else if (input.charAt(i) == 'a') {
                        if (state1 == "TIME") {
                            state1 = "DATE";
                        } else {
                            state1 = "TIME";
                        }
                    }
                    break;
                case "UPDATE":
                    if(input.charAt(i) == 'd'){
                        state = "NORMAL";
                        state1 = "TIME";
                    } else if(input.charAt(i) == 'a' && state1 == "MIN") {
                        state1 = "HOUR";
                    } else if(input.charAt(i) == 'b' && state1 == "MIN") {
                        m+=1;
                        if(m%60 == 0) {
                            h++;
                            m = 0;
                        }
                    }else if(input.charAt(i) == 'a' && state1 == "HOUR") {
                        state1 = "DAY";
                    } else if(input.charAt(i) == 'b' && state1 == "HOUR") {
                        h+=1;
                        if(h%24 == 0) {
                            D++;
                            h = 0;
                        }
                    } else if(input.charAt(i) == 'a' && state1 == "DAY") {
                        state1 = "MONTH";
                    }else if(input.charAt(i) == 'b' && state1 == "DAY") {
                        D+=1;
                        if(D%31 == 0) {
                            M++;
                            D++;
                        }
                        D = D%31;
                    } else if(input.charAt(i) == 'a' && state1 == "MONTH") {
                        state1 = "YEAR";
                    }else if(input.charAt(i) == 'b' && state1 == "MONTH") {
                        M+=1;
                        if(M%13 == 0){
                            Y++;
                            M++;
                        }
                        M = M%13;
                    } else if(input.charAt(i) == 'a' && state1 == "YEAR"){
                        state1 = "TIME";
                        state = "NORMAL";
                    }else if(input.charAt(i) == 'b' && state1 == "YEAR") Y+=1;
                    break;



                case "ALARM":
                    if(input.charAt(i) == 'a'){
                        state1 = "CHIME";
                    } else if(input.charAt(i) == 'd'){
                        state1 = "TIME";
                        state = "NORMAL";
                    }
                    break;
            }
        }
    }
    public String displayDate(){
        return Y + "-" + M + "-" + D;
    }
    public String displayTime(){
        return h + ":" + m;
    }

    public String getState() {
        return state;
    }

    public String getState1() {
        return state1;
    }
}
