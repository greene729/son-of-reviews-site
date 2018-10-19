package org.wecancodeit.sonofreviewssite.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToMany(mappedBy = "category")
	private Collection<Review> reviews;
	
	public Category() {}

	public Category(Long id, String name, Collection<Review> reviews) {
		super();
		this.id = id;
		this.name = name;
		this.reviews = reviews;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}
	


}
