public class Sorting {
    public static void main(String[] args) {
        int[] num = {25,11,64,32,30};
        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            boolean flag = true;
            for (int j = 0; j < num.length-1; j++) {
                temp = 0;
                if(num[j]>num[j+1]){  
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    flag = false;
                }
                
            }
            
            System.out.println();
            if(flag == true){
                break;
            }
            System.out.println("ITERATION NO - "+(i+1));
            for (int k : num) {
                System.out.print(k+",");
            }
        }

        for (int i : num) {
            System.out.println(i);
        }
    }    
}
