class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> temp = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            //StringBuffer sb = new StringBuffer();
            
            if(i%3==0&&i%5==0){
                temp.add("FizzBuzz");
            }
            else if(i%3==0){
                temp.add("Fizz");
            }
            else if(i%5==0){
                temp.add("Buzz");
            }
            
            else{
                temp.add(""+i);
            }
            
        }
        return temp;
    }
    public static void main(String[] args){
        FizzBuzz fb = new FizzBuzz();
        List<String> temp = new ArrayList<String>();
        temp=fb.fizzBuzz(5);
        System.out.println(temp.toString());
    }
}