public class Pet {
  private String petType;
  private String petName;
  private int petAge;
  private int daysStay;
  private double amountDue;
  private int dogSpaces;
  private int catSpaces;

  // a default constructor if params are not passed
  public Pet() {
    petType = "no type";
    petName = "no name";
    petAge = 0;
    daysStay = 0;
  }

  // a constructor with params
  public Pet(String petTypeValue, String petNameValue, int petAgeValue, int daysStayValue) {
    petType = petTypeValue;
    petName = petNameValue;
    petAge = petAgeValue;
    daysStay = daysStayValue;
  }

  // mutators for each attribute
  public void setPetType(String petTypeValue) {
    petType = petTypeValue;
  }
  public void setPetName(String petNameValue) {
    petName = petNameValue;
  }
  public void setPetAge(int petAgeValue) {
    petAge = petAgeValue;
  }
  public void setDaysStay(int daysStayValue) {
    daysStay = daysStayValue;
  }
  public void setAmountDue(double amountDueValue) {
    amountDue = amountDueValue;
  }
  public void setDogSpaces(int dogSpacesValue) {
    dogSpaces = dogSpacesValue;
  }
  public void setCatSpaces(int catSpacesValue) {
    catSpaces = catSpacesValue;
  }

  // accessors
  public String getPetType() {
    return petType;
  }
  public String getPetName() {
 return petName;
  }
  public int getPetAge() {
    return petAge;
  }
  public int getDaysStay() {
    return daysStay;
  }
  public double getAmountDue() {
    return amountDue;
  }
  public int getDogSpaces() {
    return dogSpaces;
  }
  public int getCatSpaces() {
    return catSpaces;
  }

}
