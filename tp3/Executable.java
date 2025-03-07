import java.io.FileReader;

import org.junit.*;

import com.google.gson.Gson;
public class Executable {
    
    FileReader fr = new FileReader("chemin");
    Gson gson = new Gson();
    Box ma_boite = gson.fromJson(fr, Box.class);
}