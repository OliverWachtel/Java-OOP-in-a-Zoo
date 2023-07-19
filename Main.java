class Main {
  String favoriteFood = "bacon";
  public static void main(String[] args) {
    Main r = new Main();
    System.out.println("Hello World!");
    Tiger tigger = new Tiger("Tigger");
    tigger.eat("meat");
    Bear pooh = new Bear("Pooh");
    pooh.eat("fish");
    pooh.eat("meat");
    Unicorn rarity = new Unicorn("Rarity");
    rarity.eat("marshmallows");
    Giraffe gemma = new Giraffe("Gemma");
    gemma.eat("meat");
    gemma.eat("leaves");
    Bee stinger = new Bee("Stinger");
    stinger.eat("ice cream");
    stinger.eat("pollen");
    Animal[] animals = {tigger, pooh, rarity, gemma, stinger};
    Zookeeper z = new Zookeeper("Zoebot");
    z.feedAnimals(animals, "meat");
  }
  public void sleep(String name){
    System.out.println(name + " sleeps for 8 hours");
  }
  public void eat(String name, String food){
    System.out.println(name + " eats " + food);
    if(food.equals(favoriteFood)){
      System.out.println("YUM!!! " + name + " wants more " + food);
    }else{
      sleep(name);
    }
  }
}
