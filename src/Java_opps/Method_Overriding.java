package Java_opps;

 class Method_Overriding {
	
	void car() {
		System.out.println("This is car for parent's car");
	}
	
	void bike() {
		System.out.println("This is car for parent's bike");
	}

}

 class Method_Overriding_child extends Method_Overriding{
	void car() {
		System.out.println("This is car for child car");
	}
}

 