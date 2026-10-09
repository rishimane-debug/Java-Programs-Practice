// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;

class Main {
    
    public static boolean isBracketsBalanced(String inputString){
  Deque<Character> bracketStack=new ArrayDeque<>();
  if(inputString == null || inputString.isEmpty()) {
        return false;
      };
  for(char currentChar:inputString.toCharArray()){  //{[()
    if("([{".indexOf(currentChar)>=0) {
      bracketStack.push(currentChar);
    } else if("}])".indexOf(currentChar) >= 0)
    {
      if(bracketStack.isEmpty()) {
        return false;
      };
      char openingBracket=bracketStack.peek();
      if("()[]{}".indexOf(""+openingBracket+currentChar)>=0) { //{)
        bracketStack.pop();
      }
        else{
            return false;
        }
    }
  }
  return bracketStack.isEmpty();
}
 
 
    public static void main(String[] args) {
        System.out.println(isBracketsBalanced("{[()"));
    }
}
