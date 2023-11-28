package Bit701.day0914;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex8_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Set<String> set=new HashSet<String>();
        Set<String> set=new TreeSet<String>(); //순서대로ㅉ
        set.add("red");
        set.add("blue");
        set.add("green");
        set.add("pink");
        set.add("purple");
        set.add("black");
        set.add("white");
        set.add("yellow");
        set.add("orange");
        System.out.println(set.size());
        
        for(String s:set)
        	System.out.println(s);
	}

}
