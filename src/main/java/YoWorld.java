import java.time.LocalDateTime;

/**
 * Created by David on 4/23/2016.
 */
public class YoWorld {
    LocalDateTime departure = LocalDateTime.now(ZoneId.of("American/Chicago"));

    public static void main(String[] args){
        System.out.println("Yo, World.  What the Fuck is going on?");
    }
}
