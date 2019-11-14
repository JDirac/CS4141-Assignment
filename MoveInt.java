public class MoveInt {
    public static String[] Sheets = new String[256];
    
    public static String move(int from, int to, boolean before) {
        Sheets[0] = "Sheet1";
        Sheets[1] = "Sheet2";
        Sheets[2] = "Sheet3";
        
        
        int a = from - 1;
        int b = to - 1;
        String temp = "";
        
        if((from >= 1 && from <= 256) && (to >= 1 && to <= 256)) {
            if(to != from) {
                if(before == true) {
                     temp = Sheets[a];
                     Sheets[a] = null;
                     Sheets[b - 1] = temp;
                     
                     return Sheets[b - 1];
                    }
                if(before == false) {
                    temp = Sheets[a];
                    Sheets[a] = null;
                    Sheets[to] = temp;
                    
                    return Sheets[to];
                   }
                }
            } 
        return null;
    }
}
            