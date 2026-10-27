package functionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerPrograms {
	
	public static void main(String[] args) {
		
		Consumer<String> consumer=name-> System.out.println(name.toUpperCase());
		
		consumer.accept("yash");
		
		
		BiConsumer<String, Integer> biconsumer=(name,id)-> System.out.println(name+id);
		
		biconsumer.accept("name", 101);
		
		
		IntConsumer printid=id->System.out.println(id);
		printid.accept(7777);
		
		LongConsumer islong=num->System.out.println(num>2147483647);
		islong.accept(6546555222L);
		
		DoubleConsumer checkgreaterThan20=num->System.out.println(num>20);
		checkgreaterThan20.accept(20.5);
		
	}

}
