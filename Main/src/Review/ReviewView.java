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
    //!! 테스트를 위한 while문 -> 추후 삭제
        while (true) {
            System.out.println("리뷰를 등록하시겠습니까? (y/n)");
            String choice = sc.next();
            sc.nextLine();

            if (choice.equals("n")) {
                System.out.println("저희 서비스를 이용해주셔서 감사합니다.");
                break;
            }

            reviewController.processInitialInput(choice, user, order);
//            userReviewsDisplay(user);
            printDbState();
        }   }

    // 1-2. 리뷰 등록
    public void addReview(UserModel user, OrderModel order){
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

        reviewController.saveReview(user,order, rating, comment);
        System.out.println("리뷰가 등록되었습니다.");
    }

//    // 2. 작성한 리뷰들 보기
//    public void userReviewsDisplay(UserModel user) {
//        System.out.println("\n------------------------------");
//        System.out.println("------------------------------");
//        // 현재 로그인한 사용자의 리뷰들을 출력합니다.
//        List<ReviewModel> reviews = reviewController.getReviews(user);
//        if (reviews.isEmpty()) {
//            System.out.println("작성한 리뷰가 없습니다.");
//        } else {
//            System.out.println("<작성한 리뷰 목록>");
//                for (ReviewModel review : reviews) {
//                    System.out.println("리뷰id: "+review.getId());
//                    System.out.println("작성자: "+review.getUser().getNickname());
//    //                !! Order에서 가게명, orderDetail 출력 메소드 추가해주세요.
////                    System.out.println("가게명: "+review.getOrder().getRestName());
////                    System.out.println("주문내역: "+review.getOrder().getOrdreDetail());
//                    System.out.println("별점: "+review.getRating());
//                    System.out.println("내용: "+review.getComment());
//                    System.out.println("------------------------------");
//            }
//        }
//        System.out.println("------------------------------");
//        System.out.println("\n1. 리뷰 삭제하기");
//        System.out.println("2. 돌아가기");
//        int choice = sc.nextInt();
//        if (choice==1) {
//            System.out.println("삭제할 리뷰의 ID: ");
//            int reviewId = sc.nextInt();
//            System.out.println("해당 리뷰를 삭제하시겠습니까? (y/n)");
//            String choiceDel = sc.next();
//            sc.nextLine();
//            reviewController.deleteReview(choiceDel,reviewId);
//        }
//    }

    public void printDbState() {
        reviewController.printAllReviews();
    }
}
