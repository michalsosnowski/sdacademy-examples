package pl.sdacademy;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		TreeSet set = new TreeSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("one");

		Iterator it = set.iterator();
		while (it.hasNext()){
			System.out.println(it.next()+" ");}
	}
}
