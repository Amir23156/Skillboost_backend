package src.main.java.com.example.skillboost.Review;



public class Review {
    private int reviewID;
    private int rating;
    private String comment;

    // Constructors
    public Review(int reviewID, int rating, String comment) {
        this.reviewID = reviewID;
        this.rating = rating;
        this.comment = comment;
    }

    // Getters and Setters
    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // Method to submit a review
    public void submitReview() {
        // Implement the logic for submitting a review
        System.out.println("Review submitted successfully!");
        System.out.println("Review ID: " + reviewID);
        System.out.println("Rating: " + rating);
        System.out.println("Comment: " + comment);
    }

    public static void main(String[] args) {
        // Example usage
        Review userReview = new Review(1, 5, "Great product!");
        userReview.submitReview();
    }
}
