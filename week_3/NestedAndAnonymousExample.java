package week_3;

public class NestedAndAnonymousExample {

    // User 클래스 정의
    public static class User {
        private String username;
        private String email;

        // 생성자 (구현 필요)
        public User(String username, String email) {
            // TODO: 전달받은 username과 email을 필드에 저장
            this.username = username;
            this.email = email;
        }

        // 정적 중첩 클래스: 사용자 통계
        public static class UserStats {
            private int postCount;

            public UserStats(int postCount) {
                this.postCount = postCount;
            }

            public int getPostCount() {
                return postCount;
            }
        }

        // 비정적 중첩 클래스: 사용자 작업
        public class UserActions {
            public String getWelcomeMessage() {
                // TODO: username을 포함한 환영 메시지 반환
                return username + "님 안녕하세요!"; // 여기를 구현하세요.
            }
        }

        // 사용자 정보 출력 메서드
        public void printUserInfo() {
            // TODO: 사용자 정보 출력 (username과 email)
            System.out.println("사용자이름 : " + this.username);
            System.out.println("이메일 : " + this.email);
        }
    }

    // AsyncService 클래스 정의
    public static class AsyncService {

        // 중첩 인터페이스: 비동기 작업 핸들러
        public interface TaskHandler {
            void onComplete(String result);
        }

        // 비동기 작업 처리 메서드
        public void processTask(TaskHandler handler) {
            System.out.println("비동기 작업 처리 중...");
            new Thread(() -> {
                try {
                    Thread.sleep(1000); // 작업 시뮬레이션
                    // TODO: 작업 성공 메시지를 콜백으로 전달
                    System.out.println("Task 성공!");
                } catch (InterruptedException e) {
                    // TODO: 작업 실패 메시지를 콜백으로 전달
                    System.out.println("실패메시지 :"+e.getMessage());
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        // 사용자 정보 생성
        User user = new User("john_doe", "john@example.com"); // TODO: 생성자 구현 후 확인

        // 사용자 정보 출력
        System.out.println("사용자 정보:");
        user.printUserInfo(); // TODO: printUserInfo 메서드 구현 후 출력 확인

        // 비정적 중첩 클래스 사용
        User.UserActions actions = user.new UserActions();
        System.out.println("환영 메시지: " + actions.getWelcomeMessage()); // TODO: getWelcomeMessage 메서드 확인

        System.out.println();

        // 비동기 작업 처리
        AsyncService service = new AsyncService();
        service.processTask(new AsyncService.TaskHandler() {
            @Override
            public void onComplete(String result) {
                // TODO: 비동기 작업 결과 출력
                System.out.println("비동기 작업 완료: " + result);
            }
        });
    }
}

