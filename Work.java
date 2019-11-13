public class Work {
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
    
     public static int remove(String SheetName) {
        for(int c = 0; c < Sheets.length; c++) {
            if(count != 1) {
               if(Sheets[c] != null) {
                   if(Sheets[c].equals(SheetName)) {
                Sheets[c] = null;
                count--;
                return c;
            }
            
    } 
    }
 }
 return -1;
}

    public static String remove(int index) {
        if(count != 1) {
            if(index >= 1 && index <= Sheets.length) {
            int x = index - 1;
            String Return = Sheets[x];
            Sheets[x] = null;
            count--;
            return Return;
        }
    }
        
    return null;
}
    public static void main(String[] args) {
        for(int b = 0; b < Sheets.length; b++) {
            add();
            System.out.println(Sheets[b]);
    }
    remove("Sheet69");
    remove("Sheet7");
    remove("Sheet54");
    remove(1);
    remove(255);
    remove(9);
    
    for(int d = 0; d < Sheets.length; d++) {
        System.out.println(Sheets[d]);
    }
    System.out.println(count);
}
}
                
            