import java.util.*;

public class Main {
    
    
    public int count(String str){
        
        int cnt = 0; 
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            
            if(str.charAt(i) == '('){
                stk.push('(');
            }else if(str.charAt(i) == ')'){
                stk.pop();
                if(str.charAt(i-1) == '('){
                    cnt += stk.size();
                }else{
                    cnt += 1;
                }
            }
            
        }
        
        
        return cnt; 
        
    }
    
    
    public static void main(String args[]) {
      Main T = new Main();
      Scanner sc = new Scanner(System.in);
      
      String str = sc.next();
      
      int answer = T.count(str);
    
      System.out.println(answer);
      
    }
}
