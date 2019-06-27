public class Dog extends  Animal implements Drawable, SoundProducable {

    public String draw() {
        return "\ud83d\udc29";
    }

    public Dog() {
        super("Dog");
    }

    public String callSound(){
        return "Gav";
    }

}
