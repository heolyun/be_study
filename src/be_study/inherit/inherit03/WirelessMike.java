package be_study.inherit.inherit03;

public class WirelessMike extends Mike {
	// 무선 마이크 is a 마이크
	
	//메소드 재정의 (오버라이딩)
	public void volumeUp() {
		System.out.println("WirelessMike 재정의 volumeUp()");
	}
	public void volumeUp(int v) {
		System.out.println(v+"만큼 볼륨 업");
	}
}
