package comdulcetapplication;

public class LoadingAnimation {
    public static void showLoading(String message) {
        System.out.print(message);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Loading interrupted!");
            }
        }
        System.out.println("\nDone!");
    }
}

