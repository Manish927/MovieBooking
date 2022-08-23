package com.spring5.movieservice.domain.service;

import com.spring5.movieservice.domain.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({@Mapping(target = "serviceAddress", ignore = true)})

    User entityToAPi(UserEntity entity);

    @Mappings({@Mapping(target = "id", ignore = true), @Mapping(target = "version", ignore = true)})
    UserEntity apiToEntity(User api);
}
