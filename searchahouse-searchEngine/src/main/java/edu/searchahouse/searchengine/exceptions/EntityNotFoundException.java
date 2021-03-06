
package edu.searchahouse.searchengine.exceptions;

/**
 * 
 * Base class exception for entities not found. Throw this exception when there is no specific "not found" exception for the
 * desire entity.
 * 
 * @author Gustavo Orsi
 *
 */
@SuppressWarnings("serial")
public class EntityNotFoundException extends RuntimeException {

	public EntityNotFoundException(String entityName) {
		super("Could not find " + entityName);
	}

}
