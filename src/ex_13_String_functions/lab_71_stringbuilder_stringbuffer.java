package ex_13_String_functions;

public class lab_71_stringbuilder_stringbuffer {
    public static void main(String[] args) {
        StringBuffer Stringbuffer = new StringBuffer("Priya");
        Stringbuffer.append("Alaisa");
        System.out.println(Stringbuffer);
        Stringbuffer.reverse();
        System.out.println(Stringbuffer);

        StringBuilder Stringbuilder = new StringBuilder("Priya");
        Stringbuilder.append("Aravind");
        System.out.println(Stringbuilder);
        Stringbuilder.reverse();
        System.out.println(Stringbuilder);
    }
}
