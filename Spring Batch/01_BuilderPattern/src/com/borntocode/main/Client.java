package com.borntocode.main;

import java.time.LocalDate;

import com.borntocode.builder.UserDTOBuilder;
import com.borntocode.builder.UserWebDTOBuilder;
import com.borntocode.dto.UserDTO;
import com.borntocode.pojo.Address;
import com.borntocode.pojo.User;

public class Client {
	public static void main(String[] args) {
		User user = createUser();

		UserDTOBuilder userDTOBuilder = new UserWebDTOBuilder();

		UserDTO dto = directBuild(userDTOBuilder, user);
		System.out.println(dto);

	}

	private static UserDTO directBuild(UserDTOBuilder userDTOBuilder, User user) {
		return userDTOBuilder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withAddress(user.getAddress()).withBirthday(user.getBirthdate()).build();
	}

	public static User createUser() {
		User user = new User();
		user.setFirstName("Vivek");
		user.setLastName("Gohil");
		user.setBirthdate(LocalDate.of(1989, 1, 18));

		Address address = new Address("B-101", "M.G. Road", "Mumbai", "400012", "Maharashtra");
		user.setAddress(address);
		return user;
	}
}
