public class RunPerson
{
	public static void main(String[] args)
	{
		Person person1 = new Person("Peter", "Jensen", 12, true);
	
    person1.isAge(9);
    person1.isPersonsName("Peter Jensen");
    person1.isPersonsNameNot("Jonas Jensen");
    person1.isPersonAgeAndName("Peter Jensen", 12);
    person1.isPersonIdentical("Peter Jensen", 12, true);
    person1.whichAgeGroup();
    person1.isPersonsNameCaseInsensitive("peter", "Jensen");

    // Use method that returns something
    person1.getFirstname();

    Person person3 = new Person("Peter", "Jensen", 12, true);
    // person3.isPersonsName(null);



		// Call the following methods and test that they work as you expect.		
		// Call isAge(12) method
    // Call isPersonsName("Peter Jensen")
		// Call isPersonsNameNot("Peter Jensen")
		// Call isPersonsNameNotButAgeIs("Peter Jensen", 12)
		// Call isPersonAgeAndName("Peter Jensen", 12)
		// Call isPersonsNameNotButAgeIs("Peter Jensen", 12)
    // Call isPersonIdentical("Peter Jensen", 12, true)
    // Call isPersonsNameCaseInsensitive("peter Jensen")
		// Call whichAgeGroup()
		
		
		
		
		Person person2 = new Person("Tea", "Petersen", 42);
    person2.isPersonIdentical("Tea Petersen", 42, false);
	}
}