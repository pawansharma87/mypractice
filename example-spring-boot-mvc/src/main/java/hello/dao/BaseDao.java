package hello.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<Entity, PK extends Serializable> {
	
	void add(Entity obj);
	
	void update(Entity id);

	Entity findById(PK id);
	
	List<Entity> findAll();

}
