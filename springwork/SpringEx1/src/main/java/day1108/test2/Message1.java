package day1108.test2;

import java.nio.file.spi.FileSystemProvider;

public class Message1 implements Messageinter {
	
	@Override
	public void sayHello(String name) {
		System.out.println("내이름은 " +name+"입니다");
	}
}
