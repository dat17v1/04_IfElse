public class RunPerson
{
	public static void main(String[] args)
	{
    // Created person1 object based on Person class
		Person person1 = new Person("Andreas", "Jensen", 12, true);
	  Person person2 = new Person("Tea", "Petersen", 42);

    person1.isAge(9);
    person1.isPersonsName("Peter Jensen");
    person1.isPersonsNameNot("Jonas Jensen");
    person1.isPersonAgeAndName("Peter Jensen", 12);
    person1.isPersonIdentical("Peter Jensen", 12, true);
    person1.whichAgeGroup();
    person1.isPersonsNameCaseInsensitive("peter", "Jensen");

    // Use method that returns something -
    // Catch returned value in firstname variable.
    String firstname1 = person1.getFirstname();
    String firstname2 = person2.getFirstname();

    if (firstname1.equals(firstname2)) {
      System.out.println("Dinner is served! muahah");
    }
    else {
      System.out.println("Oh no, no dinner");
    }

    // if (firstname.equals("Andreas")) {
    //   System.out.println("What a wonderful name you have");
    // }
    // System.out.println("person1's name: " + firstname);
    person1.changeFirstname("Anders");
    // firstname = person1.getFirstname();
    // System.out.println("person1's name is now: " + firstname);



    String anotherFirstname = person1.getFirstname();

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
		
		
		
		
		
    person2.isPersonIdentical("Tea Petersen", 42, false);
	}
}