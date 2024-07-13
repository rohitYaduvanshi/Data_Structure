package String;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");
        s.append("java");
        System.out.println(s); // Hellojava ,output

        StringBuffer sb = new StringBuffer("Hello");
        sb.insert(1, "Java");
        System.out.println(sb); // HJavaello

        StringBuffer sbb = new StringBuffer("Hello");
        sbb.replace(1, 3, "java");
        System.out.println(sbb); // Hjavalo

        StringBuffer s1 = new StringBuffer("Hello");
        s1.delete(1, 3);
        System.out.println(s1); // Hlo

        StringBuffer s2 = new StringBuffer("Hello");
        s2.reverse();
        System.out.println(s2); // olleH

        StringBuffer s3 = new StringBuffer();
        System.out.println(s3.capacity()); // 16
        s3.append("Hello");
        System.out.println(sb.capacity()); // 21
        s3.append("java is my fav language");
        System.out.println(s3.capacity()); // 34

        sb.ensureCapacity(10);// now no change
        System.out.println(sb.capacity());// now 34
        sb.ensureCapacity(50);// now (34*2)+2
        System.out.println(sb.capacity());// now 70
    }
}
