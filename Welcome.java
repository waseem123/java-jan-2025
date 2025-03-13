class Welcome{
    public static void printname(String name){
        System.out.println(name);
        printname(name);
    }
    public static void main(String[] args){
        System.out.println("Welcome to Java Programming. "+args[0]);
        System.out.println("This is my first java program");
        printname(args[0]);
    }
}