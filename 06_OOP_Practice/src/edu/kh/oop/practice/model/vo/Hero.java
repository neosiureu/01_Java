package edu.kh.oop.practice.model.vo;

public class Hero {


	String nickname;
	String job;
	int hp;
	int mp;
	int level;
	double exp;
	
	Hero(){
	}
	
	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		System.out.printf("%s 직업으로 '%s'님이 생성되었습니다.\n",job,nickname);
		System.out.println(this.toString());
	}

	
	
	
	@Override
	public String toString() {
		return "현재 레벨: " + level+
				"\n현재 hp:"+ hp+ "\n현재 mp:" + mp + "\n현재 경험치: "+ exp +"\n"; 
				
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}
	
	public void attack (double exp) {
		System.out.print(this.nickname+"은/는 공격을 했다!!! ");
		this.exp +=exp;
		System.out.println("현재 경험치: " + this.exp);
		if(this.exp>=300) {
			System.out.print("레벨이 올랐습니다!! ");
			this.level++;
			System.out.println("현재 레벨"+this.level);
		}
		
	}
	
	public void dash () {
		if(this.mp>=10) {
		System.out.print(this.nickname+"님의 엄청 빠른 대시!!   ");
		this.mp-=10;
		System.out.println("남은 마력: "+ this.mp);
		}
		
		else {System.out.println("mp가부족하여 더 이상 대시할 수 없어요..");
}
		
		
	}
	
	
}
