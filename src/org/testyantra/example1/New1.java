package org.testyantra.example1;

public class New1 {
	
	
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.append("world");
        
        System.out.println(sb);
        
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        
        System.out.println(sb);
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.delete(0,4));
        System.out.println(sb.insert(1,"hhhhh"));
        
    }

}
