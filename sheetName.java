
public class sheetName {
   public String sheetName(int index) {
       
    String [] SheetNames = {"sheet1", "sheet2", "sheet3", "sheet4" };
    
    String sheetName = "";
    int i = index;
   
    if (index >= 0 && index <= 256) {
        return SheetNames[i];
    }
    else {
        return null;
    }
   }
}
