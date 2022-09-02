import java.util.*;

public class Main {
    
    
    public static void main(String args[]) {
      Main T = new Main();
      Scanner sc = new Scanner(System.in);
      Stack<Integer> stk = new Stack<>(); 
      int answer = 0; 
    
      int N = sc.nextInt();
      int[][] arr = new int[N][N];
      
      for(int i=0; i<N; i++){
          for(int j=0; j<N; j++){
              int num = sc.nextInt();
              arr[i][j] = num;
          }
      }
      
      int M = sc.nextInt();
      int[] move = new int[M];
      
      for(int i=0; i<M; i++){
          int num = sc.nextInt();
          move[i] = num;
      }
      
      
      for(int i=0; i<M; i++){
          int pos = move[i];
          
          for(int j=0; j<N; j++){
              int num = arr[j][pos-1];
              
              if(num == 0){
                  continue;
              }else{
                  
                  arr[j][pos-1] = 0; 
                
                  if(stk.size() != 0 && stk.peek() == num){
                      stk.pop(); 
                      answer += 2;
                  }else{
                      stk.push(num);
                  }
                
                break; 
                  
              }
              
          }
      }
      

      System.out.println(answer);
    }
}
