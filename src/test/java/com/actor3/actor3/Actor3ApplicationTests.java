package com.actor3.actor3;

import com.actor3.actor3.entity.*;
import com.actor3.actor3.repository.ClientUserRepository;
import com.actor3.actor3.repository.UserRepository;
import com.actor3.actor3.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Arrays;

@SpringBootTest
class Actor3ApplicationTests {
	@Autowired
	UserService userService;
	@Autowired
	ClientUserRepository clientUserRepository;
	@Autowired
	UserRepository userRepository;

	@Test
	@Transactional
	void start2() {
		User user = (User) userService.loadUserByUsername("web.varlamov@yandex.ru");
		ClientUser clientUser = user.getClientUser();
		System.out.println(clientUser);
	}

	@Test
	@Transactional
	void createUser() {
		User user = new User();
		user.setUsername("web.varlamov@yandex.ru");
		user.setPassword("Endposition1993");

		ClientUser clientUser = user.getClientUser();
		user.setClientUser(clientUser);

		userRepository.save(user);
	}

	@Test
	void start() {
		User user = (User) userService.loadUserByUsername("web.varlamov@yandex.ru");
		ClientUser clientUser = new ClientUser();
		clientUser.setDescription("web.varlamov client user");

		user.setClientUser(clientUser);
		userRepository.save(user);



//		clientUserRepository.save(clientUser);
//		userRepository.save(user);

//		Attribute attributeHeight = new Attribute();
//		attributeHeight.setName("Высота");
//		attributeHeight.setAttributeValueType(AttributeValueType.INTEGER);
//
//		AttributeValue attributeValueHeight = new AttributeValue();
//		attributeValueHeight.setValueInt(100);
//		attributeValueHeight.setAttribute(attributeHeight);
//
//
//		Attribute attributeGender = new Attribute();
//		attributeGender.setName("Гендер");
//		attributeGender.setAttributeValueType(AttributeValueType.BOOLEAN);
//
//		AttributeValue attributeValueGender = new AttributeValue();
//		attributeValueGender.setValueBoolean(true);
//		attributeValueGender.setAttribute(attributeGender);
//
//		Attribute attributeWeight = new Attribute();
//		attributeGender.setName("Вес");
//		attributeGender.setAttributeValueType(AttributeValueType.INTEGER);
//
//		AttributeValue attributeValueWeight = new AttributeValue();
//		attributeValueWeight.setValueInt(68);
//		attributeValueWeight.setAttribute(attributeWeight);
//
//		clientUser.setAttributeValues(Arrays.asList(attributeValueGender, attributeValueWeight, attributeValueHeight));
//
//		clientUserRepository.save(clientUser);

	}

}
