class Fish implements Swimmable, Sleepable {
    @Override
    public void swim(){
        
        System.out.println("The fish is swimming");
    }
    @Override
    public void sleep() {
        
        System.out.println("The fish is sleeping");
    }
    public static void main(String[] args){
    Fish fish1 = new Fish();
    fish1.swim();
    fish1.sleep();
        
    }
    
}