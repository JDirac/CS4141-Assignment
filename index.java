
public class index {
    public int index(String sheetName) {
        
    String [] SheetNames = {"sheet1", "sheet2", "sheet3", "sheet4"};
        
    int index = -1;
    int i = 0;
    
    for (i = 0; i < SheetNames.length; i++) 
        if (SheetNames[i].equals(sheetName)) {
            index = i;
            break;
        
        }
    return index;   
    }
}
