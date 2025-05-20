package com.arf.dto.request;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class CreateUserRequestDto {
    Long authId;
    String userName;
    String email;
}
