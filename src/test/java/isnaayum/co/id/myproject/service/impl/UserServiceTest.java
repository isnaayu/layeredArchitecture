package isnaayum.co.id.myproject.service.impl;

import isnaayum.co.id.myproject.dto.request.UserRequest;
import isnaayum.co.id.myproject.dto.response.UserResponse;
import isnaayum.co.id.myproject.repository.UserRepository;
import isnaayum.co.id.myproject.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.UUID;

class UserServiceTest {

    @Test
    void create(){
        UserService userService = Mockito.mock(UserService.class);

        UserRequest userRequest = new UserRequest();
        userRequest.setName("Isna Ayu");
        userRequest.setAddress("Jakarta");

        UserResponse userResponse = new UserResponse();
        userResponse.setId(String.valueOf(UUID.randomUUID()));
        userResponse.setName(userRequest.getName());

        Mockito.when(userService.create(userRequest)).thenReturn(userResponse);

        UserResponse result = userService.create(userRequest);

        Assertions.assertNotNull(result);
        Assertions.assertEquals("Isna Ayu", result.getName());
        Assertions.assertNotNull(result.getId());
        Mockito.verify(userService).create(userRequest);
    }
}
