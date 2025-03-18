package isnaayum.co.id.myproject.service.impl;

import isnaayum.co.id.myproject.domain.User;
import isnaayum.co.id.myproject.dto.request.UserRequest;
import isnaayum.co.id.myproject.dto.response.UserResponse;
import isnaayum.co.id.myproject.repository.UserRepository;
import isnaayum.co.id.myproject.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserResponse create(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setAddress(user.getAddress());
        userRepository.save(user);

        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .build();
    }
}
