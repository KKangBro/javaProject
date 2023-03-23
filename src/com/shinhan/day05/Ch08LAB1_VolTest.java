package com.shinhan.day05;

interface Volume {
	void volumeUp(int level);
	void volumeDown(int level);
}

class Speaker implements Volume {
	int VolLevel = 0;

	public Speaker() {
	}

	@Override
	public void volumeUp(int level) {
		VolLevel = VolLevel + level > 100 ? 100 : VolLevel + level;
		System.out.println(getClass().getSimpleName() + "볼륨 올립니다." + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		VolLevel = VolLevel - level < 0 ? 0 : VolLevel - level;
		System.out.println(getClass().getSimpleName() + "볼륨 내립니다." + VolLevel);
	}
}

class Radio implements Volume {
	int VolLevel = 0;

	public Radio() {
	}

	@Override
	public void volumeUp(int level) {
		VolLevel += level;
		System.out.println(getClass().getSimpleName() + "볼륨 올립니다." + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		VolLevel -= level;
		System.out.println(getClass().getSimpleName() + "볼륨 내립니다." + VolLevel);
	}
}

class TV implements Volume {
	int VolLevel = 0;

	public TV() {
	}

	@Override
	public void volumeUp(int level) {
		VolLevel += level;
		System.out.println(getClass().getSimpleName() + "볼륨 올립니다." + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		VolLevel = VolLevel - level < 0 ? 0 : VolLevel - level;
		System.out.println(getClass().getSimpleName() + "볼륨 내립니다." + VolLevel);
	}
}

public class Ch08LAB1_VolTest {
	public static void main(String args[]) {
		Volume[] v = new Volume[3];
		v[0] = new Speaker();
		v[1] = new Radio();
		v[2] = new TV();
		for (int i = 0; i < v.length; i++) {
			for (int j = 1; j <= 3; j++) {
				v[i].volumeUp(200);
			}
			for (int j = 1; j <= 3; j++) {
				v[i].volumeDown(300);
			}
		}
	}
}
