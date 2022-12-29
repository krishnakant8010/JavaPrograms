package Java_opps;

interface Bank {
	float rateOfInterest();
}

class SBI1 implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB1 implements Bank {
	public float rateOfInterest() {
		return 9.7f;
	}

}
