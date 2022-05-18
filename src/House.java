import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class House {

    String city;
    int roomCount;
    int height;
    int width;


    public String toString() {
        return "City: " + getCity() + ", room count: "+getRoomCount()
                + ", height: "+getHeight() + ", width: "+getWidth()
                + " \n";
    }
}