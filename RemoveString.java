public class RemoveString {
    public static String[] Sheets = new String[256];
    public static int count = 0;
    public static int remove(String SheetName) {
        Sheets[0] = "Sheet1";
        Sheets[1] = "Sheet2";
        Sheets[2] = "Sheet3";
        count = 3;
        for(int c = 0; c < Sheets.length; c++) {
            if(count != 1) {
               if(Sheets[c] != null) {
                   if((Sheets[c].toUpperCase()).equals(SheetName.toUpperCase())) {
                Sheets[c] = null;
                count--;
                return c;
            }
            
        } 
      }
    }
      return -1;
}
}