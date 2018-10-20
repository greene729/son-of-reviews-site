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

				"Never have I been so gifted, as to see Greg's Chrsitmas Sweater. It was the greatest gift one could recieve. I believe his Great Aunt Mable knitted it for him some years back. It is covered in the finest layer of cat hair, from said Great Aunt Mable. He begins wearing this sweater sometime in mid November and does not take it off till the new year. I dare say he bathes in it. Of all his sweaters this is one of my favorites.",
				"Recomendation: Keep it", "8.7/10", "image", category1);
		Review sweater2 = new Review("Greg's College Sweater",
				"This sweater eminates a kind of naive, hapless earnestness. It doesn't seem to notice how tight it's become, to its benefit. Greg bought this his sophomore year after he finished his cynical phase, and almost lost it in the lake during one of our late-night escapades. The way it smelled for the next week, I wish he had.",
				"Recomendation: Keep it", "8.7/10", "image", category1);
		Review sweater3 = new Review("Greg's Halloween Sweater",
				"Greg has made a lot of bad decisions in his life. There was the time share in Nepal, there was the vacation to Indianapolis, but his Halloween Sweater makes it into the cannon of great disasters. It is neither spooky, nor cute. I've never felt the hint of a shiver run down my spine. I've never felt warm, fuzzy, harvest-time feelings either. What purpose does this sweater serve? What is its target audience? I don't think anyone knows.",
				"Recomendation: Keep it", "4/10", "image", category1);
		Review sweater4 = new Review("Greg's Inappropriately Small Sweater",
				"Why would you give such an ill-fitting sweater such a high score? I went back and forth on this, but I decided in the end that while it gains no points for fashion, taste, respectability, sense, or general ability of anyone accompanying Greg to maintain their composure, it has its own appeal. When Greg was in high school, he spent a summer abroad in Bratislava, and his little sister decided it might get cold there, so she bought him a wool sweater. As soon as Greg arrived in Czechoslovakia he washed and dried his sweater and shrunk it down to dog size. He felt so bad about it that he continued wearing it anyway, and has since.",
				"Recomendation: Keep it", "10/10", "image", category1);
		Review sweater5 = new Review("Greg's Kind of Classy Sweater",
				"rThis one is an honest argyle Greg found for 10% off at JC Penny back in 1999. He didn't belive in Y2K and wore this sweater to our New Years party that year, but that history came out in the next wash and it remains an unassuming argyle sweater. It blends in at business meetings better than a bic ballpoint.",
				"Recomendation: Keep it", "6.5/10", "image", category1);

		sweater1 = reviewRepo.save(sweater1);
		sweater2 = reviewRepo.save(sweater2);
		sweater3 = reviewRepo.save(sweater3);
		sweater4 = reviewRepo.save(sweater4);
		sweater5 = reviewRepo.save(sweater5);

		// hobbies
		Review hobby1 = new Review("Wood Working",
				"Greg was channel-surfing one day in the fall of 2010 and happened upon a show called 'Rough Cut Woodworking with Tommy Mac' and decided that woodworking was his passion. He went out to the neighborhood hardware depot and got himself all the tools of the trade. At one point, he asked me what I thought of a particular lathe and I told him that until today I had never heard of a lathe, and that he should just go with his gut. Long story same length, he scowled at me and purchased a different lathe. Greg spent the rest of the weekend building what can only be described as the world's biggest birdhouse for the world's smallest bird. If I'm being honest, it was a very good first attempt. I've never seen him so proud of any singular achievement. After that, I think he's only really ever made like 3 more things--an oversized wooden spoon, a featureless, human-shaped doll, and a single bedpost.",
				"Get back into it. I think you show some real potential. You just need practice", "7/10",
				"woodworking.jpg", category4);

		hobby1 = reviewRepo.save(hobby1);

		// life choices
		Review lifeChoice1 = new Review("Having Children",
				"When Greg proposed to Carol, he promised he wouldn't become that lame friend who is too busy with his kids to hang out. But he was already a my lame friend- I guess there wasn't any further down to go, so I can't hold this life decision against him. On the whole, I think he's learned a bit about responsibility, but forgotten lots more about music not sung by a choir of six year olds, which I would consider a loss. But Greg has never had cool points to loose, so perhaps it's been a net gain. If it weren't for Lizzy I think this would have been an alright descision.",
				"know when to stop.", "6/10", "having-children.jpg", category2);

		lifeChoice1 = reviewRepo.save(lifeChoice1);

		// dad jokes
		Review dadJoke1 = new Review("Joke about a pepper.",
				"Here is, verbatim, a joke Greg told me once: \"There's this one, that's... How do you... Wait, how. I'm trying to think how this one goes. There's a peppper... Oh! How do you know know if a pepper is nosey? (Greg paused here)... He gets jalapeno business!\" There's an art to delivery in comedy. And then there's the art of delivering a joke so poorly that the delivery is the joke. This skill cannot be mastered, but some master it anyway.",
				"Needs some work. Would be greatly depricated by being worked on.", "6/10", "dad-joke-1.jpg", category5);
		dadJoke1 = reviewRepo.save(dadJoke1);
		
		Review dadJoke2 = new Review("A surprisingly honest aphorism", "I don't remember what the prank was, but it was April 1st, 2003. Not to toot my own horn, but it was a pretty good prank, and I played Greg like a silk fiddle. After realizing he'd been fooled, Greg looked me dead in the eyes and said \"fool me once, shame on me. But teach a man to fool me, and I'll be fooled for the rest of my life.\"", "engrave this on a statue of Greg.", "20/10", "dad-joke-2.jpg", category5);
		dadJoke2 = reviewRepo.save(dadJoke2);
		
		Review dadJoke3 = new Review("Joke about an overweight gourd", "I've reviewed Greg's halloween sweater, and you can find my [poor] opinion of that documented elsewhere. But it bears mentioning as the catalyst for one of Greg's earliest dad jokes. In December 1998 my cousin was repairing his water main and doing about as well as a drunk sea lion with a ratchet set, and Greg started running out of clean laundry. He had to resort to his terrible Halloween sweater, and after the thanksgiving feast at his parents' house, is was fairly snug. As he was shimmying it over his belly he asked me what I would call an overweight pumpkin. \"What?\", I asked. \"A plumpkin!\", he said, delighted.", "don't quit your day job", "4/10", "ded-joke-3.jpg", category5);
		dadJoke3 = reviewRepo.save(dadJoke3);
		
		Review dadJoke4 = new Review("Joke at the supermarket", "The second time Greg ever used the blender he bought Carol was when we decided to make milkshakes around midnight one tuesday. We'd already portioned the ice cream into the blender when we realized Greg was out of milk, and had to run to the store before it melted. We grabbed some 2% and as we were checking out, the cashier asked us if we wanted the single carton of milk in a bag. Not missing a beat, Greg said, \"no, you can leave it in the carton.\"", "she was just trying to do her job, Greg.", "8/10 for quick thinking", "dad-joke-4.jpg", category5);
		dadJoke4 = reviewRepo.save(dadJoke4);

	}

}
