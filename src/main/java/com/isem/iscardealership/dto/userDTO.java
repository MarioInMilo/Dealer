package com.isem.iscardealership.dto;

import com.isem.iscardealership.model.Role;
import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class userDTO {
    private long id;
    private String username;
    private String login;
    private String password;
    private Role role;
    private String email;
    private boolean ban;
}
