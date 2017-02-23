
public class Person
{
	private String firstname;
	private String lastname;
	private int age;
	private Boolean male = true; //note: male=true means a male, male=false means a female
						// (We learn a more intuitive way to do this later)
	
  public Person(String firstname, String lastname, int age, Boolean male) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
    this.male = male;
  }
  public Person(String firstname, String lastname, int age) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
  }

  public void changeFirstname(String firstname) {
    // Do not implement a rule like this!
    // It is better to implement the rule in here.
    // This is an example of a method calling a method!
    FirstnameRule rule = new FirstnameRule();
    boolean isAllowed = rule.isFirstnameChangeAllowed(firstname);

    String personsFirstname = getFirstname();
    
    if (isAllowed) {
      this.firstname = firstname;
    }
  
  }

  // Get method that returns Something
  public String getFirstname() {
    // kode her
    
    return this.firstname;
    
    // ingen kode her
  }
	
	//The methods has to work no matter what the actual values
	//are for the personobject in question!
	
	
	//The idea here is we want an answer to the question:
	//Is this persons eg. age 15? (true or false?)
  //Print out "true" if the persons age is 15 or larger and "false" if not
	public void isAge(int age)					
	{
		//Your code here.
    if (this.age >= age) {
      System.out.println("isAge: " + true);
    }
    else {
      System.out.println("isAge: " + false);
    }
	}

	//Code method that prints "true" if name is the same as the parameter.
	public void isPersonsName(String name)
	{
    // Example that shows: It will not evaluate the second expression
    // if the first is false.
    if (name != null && name.equals(this.firstname + " " + this.lastname)) {
      System.out.println("isPersonsName: " + true);
    }
    else {
      System.out.println("isPersonsName: " + false);
    }
	}
	
	//Here we want a method that prints true if the name of the personobject is NOT the same
	//as the parameter.
	public void isPersonsNameNot(String name)
	{
		if (!name.equals(this.firstname + " " + this.lastname)) {
      System.out.println("isPersonsNameNot: " + true);
    }
    else {
      System.out.println("isPersonsNameNot: " + false);
    }
	}
	
	//Not operator with other expression. Age must match and name must not match to print true
	public void isPersonsNameNotButAgeIs(String name, int age)
	{
		if (!name.equals(this.firstname + " " + this.lastname) && this.age == age) {
      System.out.println("true");
    }
    else {
      System.out.println(false);
    }
	}

	//print true if name and age are the same as this person and otherwise false	
	public void isPersonAgeAndName(String name, int age)
	{
    if (name.equals(this.firstname + " " + this.lastname) && this.age == age) {
      System.out.println("isPersonAgeAndName :" + true);
    }
    else {
      System.out.println("isPersonAgeAndName :" + false);
    }
	}
	
	//Only print true if all 3 parameters (name, age and male) are the same as the person object
	public void isPersonIdentical(String name, int age, boolean male)
	{
		if (name.equals(this.firstname + " " + this.lastname) 
      && this.age == age && this.male == male) {
        System.out.println("IsPersonIdentical: " + true);
    }
    else {
        System.out.println("IsPersonIdentical: " + false);
    }
	}
	
	
	//age between 0 - 5: print "Small Child"
	//age between 6 - 12: print "Child"
	//age between 13 - 19: print "Teenager"
	//age between 20 - 45: print "Adult"
	//age between 46 - 60: print "Mid age"
	//age between 61 - 75: print "Old"
	//age between 76 and up: print "Very Old"
	public void whichAgeGroup()
	{
		if (this.age >= 0 && this.age <= 5) {
      System.out.println("Small Child");
    }
    else if (this.age >= 6 && this.age <= 12) {
      System.out.println("Child");
    } // ... some if statements missing. Do it yourself!
    else {
      System.out.println("Something went wrong");
    }
    

	}
	

	/////////////
	// Extended / Difficult
	////////////
	public void isPersonsNameCaseInsensitive(String firstname, String lastname)
	{
		if (this.firstname.equalsIgnoreCase(firstname) 
      && this.lastname.equalsIgnoreCase(lastname)) {
        System.out.println("Ignore Case: true");
      }
      else {
        System.out.println("Ignore Case: false");
      }
	}
}