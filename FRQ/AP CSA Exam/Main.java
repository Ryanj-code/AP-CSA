class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public boolean couponApplies(){
    boolean result = true;
    for(int i =0;i < check.size();i++){
      if(check.get(i).isDailySpecial()){
        result = false;
      }
    }
    if(totalPrices() < 40.0){
      result = false;
    }
    return result;
  }  

  public double calculateCheck(){
    double original = totalPrices();
    double price = totalPrices();
    if(couponApplies()){
      price = price - (original/4);
    }
    if(check.size() >= 6){
      price = price + (original/5);
    }
    return price;
  }

  public static int calculateBonus(int goal, int numDays){
    int bonus = 0;
    for(int i = 0; i < numDays;i++){}
      if(getSales() >= (goal * 0.8) && getSales() < goal){
        bonus += 50;
      }
      if(getSales() >= goal){
        bonus += 75;
      }
    return bonus;
  }
}
