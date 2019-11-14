public class MoveIntToEnd {
    public static String[] Sheets = new String[256];
    
    public static String moveToEnd(int from) {
        Sheets[0] = "Sheet1";
        Sheets[1] = "Sheet2";
        Sheets[3] = "Sheet3";
        
        int a = from - 1;
        int store = 0;
        String temp = "";
        if(from >= 1 && from <= 256) {
            // Place Sheet after last Sheet in list.
            for(int i = 0; i < Sheets.length; i++) {
                if(Sheets[i] != null) {
                    store = i;
                }
            }
            temp = Sheets[a];
            Sheets[a] = null;
            Sheets[store + 1] = temp;
            return Sheets[store + 1];
        }
        return null;
    }
}