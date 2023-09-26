package tech.espoch.plantilla.base.portal.repositorio;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;
import tech.espoch.repositorio.jpa.crud.GenericoCrudJPA;
import tech.espoch.repositorio.jpa.excepcion.RepositorioExcepcion;

@Slf4j
public class RepositorioJPA<T>  implements Serializable {

	private static final String EX_PU = "ExamplePU";
	@PersistenceContext(unitName = EX_PU)
	public EntityManager entityManager;

	private GenericoCrudJPA genericoCrudJPA;

	/**
	 * 
	 * @param entityClass
	 */
	public RepositorioJPA(Class<T> entityClass) {
		genericoCrudJPA = new GenericoCrudJPA(entityClass);
	}
	public RepositorioJPA() { };

	public GenericoCrudJPA<T> getDao() {
		genericoCrudJPA.setEntityManager(entityManager);
		return this.genericoCrudJPA;
	}
}
