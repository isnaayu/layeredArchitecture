package isnaayum.co.id.myproject.controller;

import isnaayum.co.id.myproject.dto.request.UserRequest;
import isnaayum.co.id.myproject.dto.response.UserResponse;
import isnaayum.co.id.myproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<UserResponse> create(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok(userService.create(userRequest));
    }

}
