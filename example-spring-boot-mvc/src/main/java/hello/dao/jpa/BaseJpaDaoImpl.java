package hello.dao.jpa;

import hello.dao.BaseDao;
import hello.service.UserServiceImpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BaseJpaDaoImpl<Entity, PK extends Serializable> implements
		BaseDao<Entity, PK> {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(UserServiceImpl.class);
	JpaRepository<Entity, PK> entityRepository;

	@Inject
	public BaseJpaDaoImpl(JpaRepository<Entity, PK> entityRepository) {
		this.entityRepository = entityRepository;
	}

	@Override
	@Transactional
	public void add(Entity obj) {
		LOGGER.debug("Creating {}" ,obj);
		entityRepository.save(obj);
	}

	@Override
	@Transactional
	public void update(Entity obj) {
		entityRepository.save(obj);
	}

	@Override
	@Transactional
	public Entity findById(PK id) {
		return entityRepository.findOne(id);
	}

	@Override
	@Transactional
	public List<Entity> findAll() {
		return entityRepository.findAll();
	}

}
