package com.hw1.run;

import java.util.ArrayList;
import java.util.Random;

import com.hw1.model.dto.Friend;

public class Run {
	public static void main(String[] args) {
		ArrayList<Friend> f = new ArrayList<Friend>();
		f.add (new Friend("짱구")); 
		f.add (new Friend("철수")); 
		f.add (new Friend("유리")); 
		f.add (new Friend("훈이")); 
		f.add (new Friend("맹구")); 
		int rint = (int) (Math.random()*5 );
		System.out.println(	f.get(rint).getName()+"가 떡잎마을 방범대 대장이다!");
	}

}
