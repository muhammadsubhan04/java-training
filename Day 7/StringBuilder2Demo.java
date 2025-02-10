public class StringBuilder2Demo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        sb.insert(3,"pq");
        System.out.println(sb);//abcpqr
        System.out.println(sb.capacity());//19
        System.out.println(sb.length());//6

        sb.replace(8, sb.capacity(), "hello world");
        System.out.println(sb);

    }
    
}
