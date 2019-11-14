public class ADD {
    public static String[] Sheets = new String[256];
    public static long count = 0;
    
    public static boolean add() {
        Sheets[0] = "Sheet1";
        Sheets[1] = "Sheet2";
        Sheets[2] = "Sheet3";
        int a = 0, N = 1;
        count = 0;
        for(a = 0; a < Sheets.length; a++) {
            if(Sheets[a] == null) {
                Sheets[a] = "Sheet" + Integer.toString(N);
                N++;
                count++;
                break;
            } else {
                N++;
                count++;
        }
    }
        if(count >= 256) {
            return false;
        } else {
            return true;
    }
  }
}