
public class rename {
    public int rename(String currentName, String newName) {

    String [] SheetNames = {"sheet1", "sheet2", "sheet3", "sheet4"};
    
    
    int currentNameindex = -1; 
    int i = 0;
    
    for (i = 0; i < SheetNames.length; i++) {
        if (currentNameindex < 0)// currentName has not been found yet 
      
            if (SheetNames[i].equals(currentName))
                currentNameindex = i;  
        if (SheetNames[i].equals(newName))  // newName is found in the list
            return -1;
    }

    if (currentNameindex > 0)  // currentName is found in the list
        SheetNames[currentNameindex] = newName;  // rename the list item

    return currentNameindex;
 }
  }

