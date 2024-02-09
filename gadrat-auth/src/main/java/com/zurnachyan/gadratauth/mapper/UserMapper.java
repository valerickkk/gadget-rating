package com.zurnachyan.gadratauth.mapper;

import com.zurnachyan.gadratauth.dto.UserDto;
import com.zurnachyan.gadratauth.model.GadRatUser;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto userToDto(GadRatUser user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setUsername(user.getUsername());
        return dto;
    }
}
