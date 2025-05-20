package com.arf.service;

import com.arf.document.UserProfile;
import com.arf.dto.request.CreateUserRequestDto;
import com.arf.repository.UserProfileRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;


    public void createUser(CreateUserRequestDto dto) {
        userProfileRepository.save(UserProfile.builder()
                        .authId(dto.getAuthId())
                        .userName(dto.getUserName())
                        .email(dto.getEmail())
                .build());
    }

    public List<UserProfile> getAll(){
        return userProfileRepository.findAll();
    }
}
