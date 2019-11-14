public class MoveString {
    public static String[] Sheets = new String[256];
    
    public static int move(String from, String to, boolean before) {
        Sheets[0] = "Sheet1";
        Sheets[1] = "Sheet2";
        Sheets[2] = "Sheet3";
        String temp = null;
        if((from.toUpperCase()).equals(to.toUpperCase()) == false) {
           for(int a = 0; a < Sheets.length; a++) {
               if(Sheets[a] != null) {
                   if((Sheets[a].toUpperCase()).equals(from.toUpperCase())) {
                       temp = from;
                       Sheets[a] = null;
                   }
               }
           }
           for(int b = 0; b < Sheets.length; b++) {
               if(Sheets[b] != null) {
                   if((Sheets[b].toUpperCase()).equals((to.toUpperCase()))) {
                       if(before == true) {
                           Sheets[b-1] = temp;
                           return b - 1;
                        } else {
                            Sheets[b+1] = temp;
                            return b + 1;
                        }
                    }
                }
            }
        }
     return -1;
    
    }
                        
}