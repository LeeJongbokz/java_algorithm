import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str = sc.next();
    Stack<Character> stk = new Stack<>();
    StringBuilder sb = new StringBuilder();
    
    for(int i=0; i<str.length(); i++){
     	char c = str.charAt(i);
      
        if(c == '('){
          stk.push('('); 
        }else if(c == ')'){
          stk.pop();	 
        }else{
           if(stk.size() == 0){
           	sb.append(Character.toString(c));  
           }
        }
     
    }
  
    System.out.println(sb.toString());
  }
}
