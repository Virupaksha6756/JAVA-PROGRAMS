public class staircase {
    static int stair(int a,int b,int c){
        if(b == 5){
            System.out.println();
            
            return 1;
        }
        if(b > 5){
            return 0;
        }
        System.out.print(b+" -> ");
        return stair(a,b+1,c+1) + stair(a,b+2,c+1);
    }
    public static void main(String args[]){
        int z = stair(5,0,0);
        System.out.println(z);
    }
    
}
