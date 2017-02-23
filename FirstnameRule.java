public class FirstnameRule {

  public boolean isFirstnameChangeAllowed(String newName){
    
    if (newName.equals("Chili")) {
      return false; // This will stop this method here
    }

    return true;
  }

}