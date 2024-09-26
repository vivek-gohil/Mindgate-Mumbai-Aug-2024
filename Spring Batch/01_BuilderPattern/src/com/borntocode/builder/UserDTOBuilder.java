package com.borntocode.builder;

import java.time.LocalDate;

import com.borntocode.dto.UserDTO;
import com.borntocode.pojo.Address;

//Abstract Buider
public interface UserDTOBuilder {
	UserDTOBuilder withFirstName(String firstName);

	UserDTOBuilder withLastName(String lastName);

	UserDTOBuilder withBirthday(LocalDate birthdate);

	UserDTOBuilder withAddress(Address address);

	UserDTO build();

	UserDTO getUserDTO();
}
