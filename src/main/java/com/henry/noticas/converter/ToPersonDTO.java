package com.henry.noticas.converter;

import com.henry.noticas.model.Persona;
import com.henry.noticas.model.PersonaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ToPersonDTO implements Converter<Persona, PersonaDTO> {

    private final ModelMapper modelMapper;

    public ToPersonDTO(final ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    @Override
    public PersonaDTO convert(Persona persona) {
        return modelMapper.map(persona, PersonaDTO.class);
    }
}
