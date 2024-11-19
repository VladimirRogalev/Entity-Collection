package telran.entitycollections.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import telran.entitycollections.interfaces.Entity;
import telran.entitycollections.interfaces.EntityCollection;

public class C implements EntityCollection {
	Comparator<Entity> comp = (o1, o2) ->Integer.compare(o1.getValue(), o2.getValue()); 
	
	ArrayList<Entity> entityC = new ArrayList<>();
	
	//O(n)

	@Override
	public void add(Entity entity) {
	int index = Collections.binarySearch(entityC, entity, comp);
	if(index <  0 ) {
		entityC.add(-index-1, entity);
	}

	}
	
	//O(1)

	@Override
	public Entity removeMaxValue() {
			return entityC.removeLast();
	}

}
