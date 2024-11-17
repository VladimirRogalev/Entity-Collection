package telran.entitycollections.dao;

import java.util.TreeSet;

import telran.entitycollections.interfaces.Entity;
import telran.entitycollections.interfaces.EntityCollection;

public class B implements EntityCollection {

	
	TreeSet<Entity> entityB = new TreeSet<>();
	
	// O(log n)
	@Override
	public void add(Entity entity) {
		entityB.add(entity);


	}

	
	// O(log n)
	@Override
	public Entity removeMaxValue() {
		return entityB.pollLast();
	}

}
