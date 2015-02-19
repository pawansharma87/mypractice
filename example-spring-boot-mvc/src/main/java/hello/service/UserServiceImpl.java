package hello.service;

import hello.domain.User;
import hello.repository.UserRepository;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(UserServiceImpl.class);
	private final UserRepository repository;

	@Inject
	public UserServiceImpl(final UserRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional
	public User save(@NotNull @Valid final User user) {

		LOGGER.debug("Creating {}", user);
		return repository.save(user);
	}

	@Override
	@Transactional(readOnly = true)
	public List<User> getList() {
		LOGGER.debug("Retrieving the list of all users");
		return repository.findAll();
	}

}
