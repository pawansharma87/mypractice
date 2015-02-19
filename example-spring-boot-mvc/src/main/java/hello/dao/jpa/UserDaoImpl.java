package hello.dao.jpa;

import hello.domain.User;
import hello.repository.UserRepository;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
@Component
public class UserDaoImpl extends BaseJpaDaoImpl<User, Long> {
	@Inject
	public UserDaoImpl(UserRepository userRepository) {
		super(userRepository);
	}

}
