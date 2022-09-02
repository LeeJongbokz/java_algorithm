import java.util.*;
  
public class Main {
    
    
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String str = sc.next();
    Stack<Integer> stk = new Stack<>();
    
    for(int i=0; i<str.length(); i++){
        char c = str.charAt(i);
     
        
        if(c == '+' || c == '-' || c == '*' || c == '/'){
            
            int num = 0; 
            int num1 = stk.pop();
            int num2 = stk.pop();
            
            if(c == '+'){
                num = num1+num2;
            }else if(c == '-'){
                num = num2-num1;
            }else if(c == '*'){
                num = num1*num2;
            }else if(c == '/'){
                num = num2/num1;
            }
            
            stk.push(num);
            
            
        }else{
            int num = (int)(c-48);
            stk.push(num);
        }
        
        
    }
    
    
    System.out.println(stk.peek());
    
    
    
    
  }
