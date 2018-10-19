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


		// kids
		Review reviewKid1 = new Review("Lizzy",
				"I was there the day Lizzy was born. And from the moment I saw her I knew; she was going to be terrible. When I first held her, she glared at me. I have never forgiven her. She's the most serious person. She has always been good at everything she's done. Sports: Amazing. Studies: Wonderful. Friends: She has too many. I think she thinks she's better than me. Which she's not!",
				"Recomendation: BREAK HER SPIRIT. She must know she is not special.", "3/10", "image", category3);
		Review reviewKid2 = new Review("Ashley",
				"Such a special child. By far the best kid. Even now in middle school, she's still awesome. I have spent many hours talking to her over thursday dinners. She doesn't seem to get along well with Lizzy, but I know that's Lizzy's fault. ",
				"Recomendation: Give her more attention Greg!", "10/5", "image", category3);
		Review reviewKid3 = new Review("Corbin",
				"Corbin. I mean he's a still a toddler. He seems like a pretty cool little kid I guess. He's super into Spiderman. The most interesting thing about Corbin is the age gap between him and his sisters. Was Corbin a mistake? An unplanned pregnancy? What are you hiding Greg???",
				"Recomendation: Tell me the truth GREG!", "Pending", "image", category3);
		reviewKid1 = reviewRepo.save(reviewKid1);
		reviewKid2 = reviewRepo.save(reviewKid2);
		reviewKid3 = reviewRepo.save(reviewKid3);
		// sweaters
		Review sweater1 = new Review("Greg's Christmas Sweater",
				"have I been so gifted, as to see Greg's Chrsitmas Sweater. It was the greatest gift one could recieve. I believe his Great Aunt Mable knitted it for him some years back. It is covered in the finest layer of cat hair, from said Great Aunt Mable. He begins wearing this sweater sometime in mid November and does not take it off till the new year. I dare say he bathes in it. Of all his sweaters this is one of my favorites.",
				"Recomendation: Keep it", "8.7/10", "image", category1);


		
		Review lifeChoice1 = new Review("Having Children", "When Greg proposed to Carol, he promised he wouldn't become that lame friend who is too busy with his kids to hang out. But he was already a my lame friend- I guess there wasn't any further down to go, so I can't hold this life decision against him. On the whole, I think he's learned a bit about responsibility, but forgotten lots more about music not sung by a choir of six year olds, which I would consider a loss. But Greg has never had cool points to loose, so perhaps it's been a net gain. If it weren't for Lizzy I think this would have been an alright descision.", "know when to stop.", "6/10", "having-children.jpg", category2);

		Review dadJoke1 = new Review("I'm trying to thin about how this one goes", "How do you... Wait, how. There's a peppper... Oh! How do you know know if a pepper is nosey? He gets jalapeno business.", "Needs work.", "7/10", "dad-joke-1.jpg", category5);

	}

}