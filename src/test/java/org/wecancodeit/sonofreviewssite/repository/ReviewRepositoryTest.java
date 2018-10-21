package org.wecancodeit.sonofreviewssite.repository;

import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.wecancodeit.sonofreviewssite.model.Category;
import org.wecancodeit.sonofreviewssite.model.Review;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ReviewRepositoryTest {
	@Resource
	ReviewRepository repo;

	@Test
	public void shouldReturnAllContacts() {
		// Arrange
		Review review = repo.save(new Review());
		Review review2 = repo.save(new Review());

		// Act
		Iterable<Review> result = repo.findAll();

		// Assert
		assertThat(result, hasItems(review2));
	}
}
