import java.util.*;



public class Main {
    
    
    public int getPrince(int N, int K){
        
        
        Queue<Integer> q = new LinkedList<>();
        
        
        for(int i=1; i<=N; i++){
            q.offer(i);
        }
        
        
        while(true){
            
            
            if(q.size() == 1){
                break;
            }
            
            for(int i=1; i<=K-1; i++){
                int num = q.poll();
                q.offer(num);
            }
            
            q.poll();
        }
        
        return q.peek();
        
        
    }
    
    
    
    public static void main(String args[]) {
      Main T = new Main();
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int K = sc.nextInt();
      
      int answer = T.getPrince(N, K);
      System.out.println(answer);
      
    }
}
