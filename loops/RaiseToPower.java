public class RaiseToPower {
    public static void main(String[] args) {
        int n = 5;
        int p = 3;
        int r = n;
        for(int i=1;i<p;i++){
            r = r * n;
        }
        System.out.println(r);
    }
}
