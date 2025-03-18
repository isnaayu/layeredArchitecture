package isnaayum.co.id.myproject.service;

import isnaayum.co.id.myproject.dto.request.UserRequest;
import isnaayum.co.id.myproject.dto.response.UserResponse;

public interface UserService {
    UserResponse create(UserRequest userRequest);
}
