package io.mart.service;

public interface CRUDService<T, Id> {
	
	T create(T t);
	
	T update(T t);
	
	T read(Id id);
	
	void delete(Id id);
	
}
