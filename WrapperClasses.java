class WrapperClasses{
    public static void main(String[] args) {
        // Wrapper classes are used to convert primitive data types into objects
        // and vice versa.
        // Primitive data types are not objects, they do not belong to any class.
        
        int x = 10;
        Integer y = Integer.valueOf(x); // converting int to Integer (Autoboxing)
        System.out.println(y);

        // Deprecated
        // Integer z = new Integer(100); // creating Integer object deprecated
        // System.out.println(z);

        String s = "100"; // String
        System.out.println(s+10); // concatenation
        int i = Integer.parseInt(s); // converting String to int
        System.out.println(i+10); // addition

        // Unboxing
        int z = y.intValue(); // converting Integer to int
        System.out.println(z);

        String data = y.toString(); // converting Integer to String
        System.out.println(data);

        int a = 10;
        Integer b = Integer.valueOf(a); // Autoboxing
        System.out.println(a==b); // true
        System.out.println(b.equals(a)); // true
    }
}

// Autoboxing: The automatic conversion of primitive data types into their corresponding
// wrapper class objects is known as autoboxing. For example, converting int to Integer,
// long to Long, double to Double etc.

// Unboxing: The automatic conversion of wrapper class objects to their corresponding
// primitive data types is known as unboxing. For example, converting Integer to int,

// 1. valueOf()
// 2. toString()
// 3. parseInt()
// 4. equals()
// 5. comparteTo()
