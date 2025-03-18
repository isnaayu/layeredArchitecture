package isnaayum.co.id.myproject.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserRequest {
    private String name;
    private String address;
}
