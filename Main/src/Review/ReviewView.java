package Review;

import Order.OrderModel.OrderModel;
import Review.ReviewController.ReviewController;
import Review.ReviewModel.ReviewModel;
import User.UserModel.UserModel;

import java.util.Scanner;
import java.util.List;

public class ReviewView {
    private ReviewController reviewController;
    private Scanner sc;

    public void setController(ReviewController reviewController) {
    this.reviewController = reviewController;
    this.sc = new Scanner(System.in);
    }

    //1. 주문 후 리뷰 등록 여부
    public void afterOrderDisplay(UserModel user, OrderModel order){
        //User와 Order 정보를 ReviewController에 전달
        reviewController.setUserAndOrder(user,order);

        System.out.println("리뷰를 등록하시겠습니까? (y/n)");
        String choice = sc.next();
        sc.nextLine();

        reviewController.processInitialInput(choice);
    }

    // 2. 리뷰 등록
    public void addReview(){
        //리뷰 등록은 1)평점 2)코멘트 로 이루어집니다.
        System.out.println("주문하신 음식에 대한 별점을 등록해주세요. ");
        System.out.println("1. ★");
        System.out.println("2. ★★");
        System.out.println("3. ★★★");
        System.out.println("4. ★★★★");
        System.out.println("5. ★★★★★");
        int rating = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리
        System.out.println("리뷰 내용을 입력해주세요: ");
        String comment = sc.nextLine();

        reviewController.saveReview(rating, comment);
        System.out.println("리뷰가 등록되었습니다.");
    }

    // 3. 작성한 리뷰들 보기
    public void userReviewsDisplay(UserModel user) {
        System.out.println("------------------------------");
        // 현재 로그인한 사용자의 리뷰들을 출력합니다.
        List<ReviewModel> reviews = reviewController.getReviews(user);
        if (reviews.isEmpty()) {
            System.out.println("작성한 리뷰가 없습니다.");
        } else {
            System.out.println("<작성한 리뷰 목록>");
                for (ReviewModel review : reviews) {
                    System.out.println("리뷰id: "+review.getId());
                    System.out.println("작성자: "+review.getUser().getNickname());
    //                !! Order에서 가게명, orderDetail 출력 메소드 추가해주세요.
    //                System.out.println("가게명: "+review.getOrder().getRestName());
    //                System.out.println("주문내역: "+review.getOrder().getOrdreDetail());
                    System.out.println("별점: "+review.getRating());
                    System.out.println("내용: "+review.getComment());
            }
        }
        System.out.println("------------------------------");
    }

    // 4. 리뷰 삭제
    public void deleteReviewDisplay(UserModel user) {
        //작성한 리뷰들 먼저 보기
        userReviewsDisplay(user);
        System.out.println("삭제할 리뷰의 ID를 입력하세요: ");
        int reviewId = sc.nextInt();
        reviewController.deleteReview(reviewId);
    }
}
