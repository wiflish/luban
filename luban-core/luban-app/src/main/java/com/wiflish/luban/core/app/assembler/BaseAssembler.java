package com.wiflish.luban.core.app.assembler;

import com.wiflish.luban.core.domain.entity.BaseEntity;
import com.wiflish.luban.core.dto.BaseDTO;
import com.wiflish.luban.core.dto.Command;

/**
 * @author wiflish
 * @since 2023-08-29
 */
public interface BaseAssembler<C extends Command, T extends BaseDTO, E extends BaseEntity> {
    E toEntity(T dto);
    
    E toEntity(C cmd);

    T toDTO(E entity);
}
