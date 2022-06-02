package org.tn.zitouna.service;

import java.util.List;

public interface IDeclaration<X,Y> {
	
	public List<X> getAll();
	public X getOne(Y id);
	public X add(X x);
	public X update (X x);
	public void delete(Y id);
}
