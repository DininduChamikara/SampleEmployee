class Employee{
	private String fName;
	private String lName;
	private double mSalary;

	Employee(String fName, String lName, double mSalary){
		this.fName = fName;
		this.lName = lName;
		this.mSalary = mSalary;
	}

	//setter
	void set_fName(String fName){
		this.fName = fName;
	}
	void set_lName(String lName){
		this.lName = lName;
	}
	void set_mSalary(double mSalary){
		if(mSalary > 0){
			this.mSalary = mSalary;
		}
		else{
			this.mSalary = 0;
		}
		
	}

	//getter
	String get_fName(){
		return this.fName;
	}

	String get_lName(){
		return this.lName;
	}

	double get_mSalary(){
		return this.mSalary;
	}

	void incriment(double mSalary){
		this.mSalary=this.mSalary + mSalary*0.1;
	}

	void printDetails(){
		System.out.println("\nName: "+this.fName+" "+this.lName);
		System.out.println("Final Salary: "+this.mSalary);
	}
}