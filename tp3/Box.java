import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;




class Box {
    private ArrayList<Thing> contents = new ArrayList<Thing>();
    private boolean ouverte;
    private int capacity;
    private int maxCapacity;

    public Box(boolean ouverte, int capacity) {
        this.ouverte = ouverte;
        this.capacity = capacity;
        this.maxCapacity = capacity;
    }

    public Box() {
        this.ouverte = false;
        this.capacity = -1;
        this.maxCapacity = -1;
    }

    public void add(Thing truc) {
        if (!this.ouverte) {
            throw new IllegalStateException("Cannot add to a closed box");
        }
        this.contents.add(truc);
    }

    public boolean contains(Thing truc) {
        return this.contents.contains(truc);
    }

    public boolean isOpen() {
        return this.ouverte;
    }

    public void open() {
        this.ouverte = true;
    }

    public void close() {
        this.ouverte = false;
    }

    public String actionLook() {
        if (isOpen()) {
            StringBuilder sb = new StringBuilder("La boite contient : ");
            for (Thing t : contents) {
                sb.append(t.toString()).append(", ");
            }
            return sb.toString();
        }
        return "La boite est fermee";
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int capacity() {
        return this.capacity;
    }

    public boolean hasRoomFor(Thing t) {
        return (t.volume() < this.capacity);
    }

    public void remove(Thing t) {
        List<Thing> newContents = new ArrayList<>();
        this.capacity = this.maxCapacity;
        for (Thing t1 : this.contents) {
            if (!(t1.equals(t))) {
                newContents.add(t1);
                this.capacity -= t1.taille;
            }
        }
        this.contents = new ArrayList<>(newContents);
    }

    public Thing find(String name) {
        if (!this.ouverte) {
            System.out.println("La boite n'est pas ouverte");
        }
        for (Thing t : contents) {
            if (t.hasName(name)) {
                return t;
            }
        }
        System.out.println("Aucun objet correspondant");
        return null;
    }}