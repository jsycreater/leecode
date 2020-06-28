public class ReverseInteger {
    public int reverse(int x) {
        long end=0;
        String str=""+x;
        String result="";
        if(x<0){
            int i=str.length()-1;
            result+="-";
            while(i>=1){
                result+=str.charAt(i);
                i--;
            }
        }
        else {
            int i=str.length()-1;
            while(i>=0){
                result+=str.charAt(i);
                i--;
            }
        }
        end=Long.parseLong(result);
        if(end>Integer.MAX_VALUE||end<Integer.MIN_VALUE)
            end=0;
        return (int)end;
    }
}
