package abstractInterface;

public class AnimalSkeleton implements BlueprintAnimal {
    private String name;
    private String sound;
    private int legs;

    public AnimalSkeleton(String name, String sound, int legs) {
        this.name = name;
        this.sound = sound;
        this.legs = legs;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSound() {
        return this.sound;
    }

    @Override
    public int getLegs() {
        return this.legs;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                ", legs=" + legs +
                '}';
    }
}
