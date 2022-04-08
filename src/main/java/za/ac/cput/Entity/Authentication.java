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
public class Authentication {
    private int authID;
    private String username;
    private String password;

    public Authentication copy(){
        return this.toBuilder().build();
    }
}
