package isnaayum.co.id.myproject.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserResponse {
    private String id;
    private String name;
}
