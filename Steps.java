public class Steps {
    
        public int getStepsRecur(int n) {
            if(n<0) {
                return 0;
            }
            if(n==0) {
                return 1;
            }
            return getStepsRecur(n-1) + getStepsRecur(n-2) +getStepsRecur(n-3);
        }
        
        public int getStepDP(int n) {
            int[] arr = new int[n+1];
            arr[0]=1;
            arr[1]=1;
            arr[2]=2;
            
            for(int i=3;i<=n;i++) {
                arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
            }
            return arr[n];
    
        }
        
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Steps ways = new Steps();
            int n=5;
            System.out.println("Recursion ways: "+ways.getStepsRecur(n));
            
            System.out.println("DP ways: "+ways.getStepDP(n));
    
        }
    
    }