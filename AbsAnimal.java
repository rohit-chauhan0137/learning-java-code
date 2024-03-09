public  abstract class AbsAnimal {
    void legs(){
        System.out.println("All Animal  have Four Lages");
    }
    abstract void sound();
    abstract void eat();
}

 class Dog extends AbsAnimal {
@Override
void sound(){
    System.out.println("Bow Bow ...");
}
void eat(){
    System.out.println("Dog Eat Meat");
}
   
}
class Cow extends AbsAnimal{
    @Override
void sound(){
    System.out.println("ooo ooo");
}
void eat(){
System.out.println("Grass");
}
}
class Test{
    public static void main(String[] args) {
        Dog r=new Dog();
        Cow s=new Cow();
        r.sound(); s.eat();
        r.eat(); s.sound();
        
    }
}
