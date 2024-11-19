package telran.entitycollections.dao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import telran.entitycollections.interfaces.Entity;
import telran.entitycollections.interfaces.EntityCollection;

public class A implements EntityCollection {
	
	Set<Entity> entityA = new HashSet<>();
	
	// O(1)
	@Override
	public void add(Entity entity) {
		entityA.add(entity);

	}
	// O(n) 
	@Override
	public Entity removeMaxValue() {
		if(entityA.isEmpty()) {
			return null;
		}
		Entity victim = Collections.max(entityA, (o1, o2) ->Integer.compare(o1.getValue(), o2.getValue()) );
		entityA.remove(victim);
		return victim;
	}

}
