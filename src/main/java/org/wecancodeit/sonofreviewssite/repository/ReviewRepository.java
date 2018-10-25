package org.wecancodeit.sonofreviewssite.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.sonofreviewssite.model.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}
