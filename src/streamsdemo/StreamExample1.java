package streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 12, 2025
 * Time    : 9:56:46 AM
 * project : AdvancedJavaProject

*/
public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] marks = {45,89,78,45,88,98};


//Build Stream from Array
Stream<Integer> strm = Stream.of(marks);

//terminal operation - forEach()

	// LAmbda expression are used to pass as parameter to another function
strm.forEach(i-> System.out.println(i));
Stream<Integer> strm1 = Stream.of(marks);
//Intermediate operation - filter()  terminal operation - for each
System.out.println("************* Filtred Values **************");
strm1.filter(i->i>50).forEach(i->System.out.println(i) );

System.out.println("************* Array Contents **************");
		List<Integer> grades=new ArrayList<Integer>();
		grades.add(10);
		grades.add(6);
		grades.add(5);
		grades.add(7);
		grades.add(8);
		grades.add(9);
		
		//Build stream from Collections
		Stream<Integer> strm12=grades.stream();
		
		//strm1.forEach(i->System.out.println(i));
		System.out.println("************* ArrayList Contents **************");
		strm12.forEach(System.out::println);
		
		// Intermediate operations - map() & terminal operations - collect()
		List<Integer> squares=grades.stream().map(m->m*m)
				.collect(Collectors.toList());
		
		System.out.println("************** Double of Grades ************");
		System.out.println(squares);


	}

}
