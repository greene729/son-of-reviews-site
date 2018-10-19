package org.wecancodeit.sonofreviewssite;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.sonofreviewssite.model.Category;
import org.wecancodeit.sonofreviewssite.model.Review;
import org.wecancodeit.sonofreviewssite.repository.CategoryRepository;
import org.wecancodeit.sonofreviewssite.repository.ReviewRepository;

@Service
public class ReviewPopulator implements CommandLineRunner {

	@Resource
	CategoryRepository categoryRepo;

	@Resource
	ReviewRepository reviewRepo;

	@Override
	public void run(String... args) throws Exception {
		Category category1 = new Category("Sweaters");
		Category category2 = new Category("Life Choices");
		Category category3 = new Category("Kids: Which is Best");
		Category category4 = new Category("Hobbies");
		Category category5 = new Category("Worst Dad Jokes");

		category1 = categoryRepo.save(category1);
		category2 = categoryRepo.save(category2);
		category3 = categoryRepo.save(category3);
		category4 = categoryRepo.save(category4);
		category5 = categoryRepo.save(category5);
		
		Review lifeChoice1 = new Review("Having Children", "When Greg proposed to Carol, he promised he wouldn't become that lame friend who is too busy with his kids to hang out. But he was already a my lame friend- I guess there wasn't any further down to go, so I can't hold this life decision against him. On the whole, I think he's learned a bit about responsibility, but forgotten lots more about music not sung by a choir of six year olds, which I would consider a loss. But Greg has never had cool points to loose, so perhaps it's been a net gain. If it weren't for Lizzy I think this would have been an alright descision.", "know when to stop.", "6/10", "having-children.jpg", category2);

		Review dadJoke1 = new Review("I'm trying to thin about how this one goes", "How do you... Wait, how. There's a peppper... Oh! How do you know know if a pepper is nosey? He gets jalapeno business.", "Needs work.", "7/10", "dad-joke-1.jpg", category5);
	}

}