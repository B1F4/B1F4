package Review;

import Review.ReviewController.ReviewController;

import java.util.Scanner;

public class ReviewView {
    private ReviewController reviewController;
    private Scanner sc;

    public void setController(ReviewController reviewController) {
    this.reviewController = reviewController;
    this.sc = new Scanner(System.in);
    }

    public void start(){
        while (true){
            //주문 완료 후 리뷰 등록
            System.out.println("리뷰를 등록하시겠습니까? (y/n)");
            String choice = sc.next();
            sc.nextLine();

            reviewController.processInitialInput(choice);
        }
    }

    public void addReview(){
        //리뷰 등록은 1)평점 2)코멘트 로 이루어집니다.
        System.out.println("주문하신 음식에 대한 별점을 등록해주세요. ");
        System.out.println("1. ★");
        System.out.println("2. ★★");
        System.out.println("3. ★★★");
        System.out.println("4. ★★★★");
        System.out.println("5. ★★★★★");
        int rating = sc.nextInt();
        System.out.println("리뷰 내용을 입력해주세요: ");
        String comment = sc.nextLine();

        reviewController.saveReview(rating, comment);
        sc.nextLine();
        System.out.println("리뷰가 등록되었습니다.");
        System.exit(0);
    }
}
