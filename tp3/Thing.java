import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

class Thing {
    String name;
    int taille;

    public Thing(String name) {
        this.name = name;
        this.taille = -1;
    }

    public Thing(int taille) {
        this.taille = taille;
    }

    public Thing(String name, int taille) {
        this.name = name;
        this.taille = taille;
    }

    public int volume() {
        return taille;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasName(String name) {
        return this.name != null && this.name.equals(name);
    }

    @Override
    public String toString() {
        return this.name != null ? this.name : "Unnamed Thing";
    }
}


