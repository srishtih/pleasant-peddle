package app.model;

import java.sql.Blob;
import java.sql.Timestamp;


public class Reviews{
	protected Integer ReviewId;
	protected Timestamp Created;
	protected Double Rating;
	protected Blob Picture;
	protected Users User;
	protected Trails Trail;
	public Reviews(Integer reviewId, Timestamp created, Double rating, Blob picture, Users user, Trails trail) {
		super();
		ReviewId = reviewId;
		Created = created;
		Rating = rating;
		Picture = picture;
		User = user;
		Trail = trail;
	}
	
	public Reviews(Integer reviewId, Timestamp created, Double rating, Users user, Trails trail) {
		super();
		ReviewId = reviewId;
		Created = created;
		Rating = rating;
		Picture = null;
		User = user;
		Trail = trail;
	}
	
	
	
	
	
}