package edu.searchahouse.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.TypeAlias;

//Customizing type mapping to avoid writing the entire Java class name as type information ("_class" : "du.searchahouse.model.Agent").
@TypeAlias("Property")
public class Property extends BaseEntity {

	public enum PropertyType {
		SALE, RENT;
	}

	public enum PropertyStatus {
		AVAILABLE, NOT_AVAILABLE;
	}

	private String name;

	private String description;

	private String location;

	private Long price;

	private PropertyType type;

	private PropertyStatus status;

	public Property() {
	}

	public Property(String name, String description, String location, Long price, PropertyType type, PropertyStatus status) {
		this.name = name;
		this.description = description;
		this.location = location;
		this.price = price;
		this.type = type;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public PropertyType getType() {
		return type;
	}

	public void setType(PropertyType type) {
		this.type = type;
	}

	public PropertyStatus getStatus() {
		return status;
	}

	public void setStatus(PropertyStatus status) {
		this.status = status;
	}

	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		put(map, this.name, "name");
		put(map, this.description, "description");
		put(map, this.location, "location");
		put(map, this.price, "price");
		put(map, this.status, "status");
		put(map, this.type, "type");

		return map;
	}
}