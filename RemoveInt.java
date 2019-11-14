public class RemoveInt {
    public static String[] Sheets = new String[256];
    public static int count = 3;
    public static String remove(int index) {
        Sheets[0] = "Sheet1";
        Sheets[1] = "Sheet2";
        Sheets[2] = "Sheet3";
        if(count != 1) {
            if(index >= 1 && index <= Sheets.length) {
            int x = index - 1;
            String Return = Sheets[x];
            Sheets[x] = null;
            count--;
            return Return;
        }
    }
return null;}
}