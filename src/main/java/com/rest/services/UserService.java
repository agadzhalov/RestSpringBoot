package com.rest.services;

import com.rest.dto.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public ProfileDto getProfile(Long userId) {
        return new ProfileDto(new UserSummaryDto(1L, "Alexander", "Gadzhalov"),
                Arrays.asList(new UserSummaryDto(2L, "Random", "Randomov")),
                Arrays.asList(new MessageDto(1L, "My message")),
                Arrays.asList(new ImageDto(1L, "Title", null)));
    }

    public List<UserSummaryDto> searchUsers(String term) {
        return Arrays.asList(new UserSummaryDto(1L, "Alexander", "Gadzhalov"),
                new UserSummaryDto(2L, "Random", "Randomov"));
    }

    public UserDto signUp(SignUpDto user) {
        return new UserDto(1L, "Alexander", "Gadzhalov", "login", "token");
    }

    public void signOut(UserDto user) {

    }
}