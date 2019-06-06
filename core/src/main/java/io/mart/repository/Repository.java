package io.mart.repository;

public interface Repository<T, Id> {
	
	T create(T t);
	
	T update(T t);
	
	T read(Id id);
	
	void delete(Id id);
	
}
