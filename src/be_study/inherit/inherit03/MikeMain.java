package be_study.inherit.inherit03;

public class MikeMain {
	
	public static void main(String[]args) {
		Mike m1 = new Mike();
		m1.volumeUp();
		
		BluetoothMike bm1 = new BluetoothMike();
		bm1.volumeUp();
		bm1.volumeUp(2);
		
		WirelessMike wm1 = new WirelessMike();
		wm1.volumeUp();
		wm1.volumeUp(3);
	}

}
