
public class Person
{
	private String firstname;
	private String lastname;
	private int age;
	private Boolean male; //note: male=true means a male, male=false means a female
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
	
	//The methods has to work no matter what the actual values
	//are for the personobject in question!
	
	
	//The idea here is we want an answer to the question:
	//Is this persons age 15? (true or false?)
  //Print out "true" if the persons age is 15 or larger and "false" if not
	public void isAge(int age)					
	{
		//Your code here.
		
	}

	//Code method that prints "true" if name is the same as the parameter.
	public void isPersonsName(String name)
	{
		
	}
	
	//Here we want a method that prints true if the name of the personobject is NOT the same
	//as the parameter.
	public void isPersonsNameNot(String name)
	{
		
	}
	
	//Not operator with other expression. Age must match and name must not match to print true
	public void isPersonsNameNotButAgeIs(String name, int age)
	{
		
	}

	//print true if name and age are the same as this person and otherwise false	
	public void isPersonAgeAndName(String name, int age)
	{
		
	}
	
	//Only print true if all 3 parameters (name, age and male) are the same as the person object
	public void isPersonIdentical(String name, int age, boolean male)
	{
		
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
		
	}
	

	/////////////
	// Extended / Difficult
	////////////
	public void isPersonsNameCaseInsensitive(String name)
	{
		
	}
}