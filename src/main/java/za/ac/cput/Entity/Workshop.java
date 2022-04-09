package za.ac.cput.Entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder(toBuilder=true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
public class Workshop {
    private int workshopID;
    private String workshopName;
    private String workshopLocation;

    public Workshop copy(){
        return this.toBuilder().build();
    }
}
