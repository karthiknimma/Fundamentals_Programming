public class sumProblem {
    public static int sumProblem(String str) {
        char ch[] = str.toCharArray();
        String digit = "";
        int sum =0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(ch[i])){
                digit ="";
                int j;
                for(j=i;j<str.length();j++){
                    if(Character.isDigit(ch[j])){
                        digit = digit + ch[j];
                    }
                    else{
                        break;
                    }
                }
                i = j;
                sum += Integer.parseInt(digit);

            }
        }
        return sum;
    }

}
