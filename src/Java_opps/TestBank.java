package Java_opps;

public abstract class TestBank {
	abstract int getRateOfInterest();
}

class SBI extends TestBank {
	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends TestBank {
	int getRateOfInterest() {
		return 8;
	}
}
