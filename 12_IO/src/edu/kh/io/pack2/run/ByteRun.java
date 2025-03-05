package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		
		/*
		// 불변성 (Immutable)한 String
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//69609650
		//69609650
		str2=str2+"world";
		System.out.println(str2.hashCode());
		//468881952
		
		// 가변성을 상징하는 StringBuilder
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode()); //1706377736
		sb.append("goobyeWorld! ");
		sb.append("helloWorld!");
		System.out.println(sb);
		System.out.println("그 주소는");
		System.out.println(sb.hashCode()); //1706377736
		*/

		


		// new ByteService().fileByteOutput();
		// new ByteService().bufferedFileByteOutput();
		//new ByteService().fileByteInput();
		// new ByteService().bufferedFileByteInput();
		// new ByteService().readProperties();
		new ByteService().fileCopy();

		
	}

}
