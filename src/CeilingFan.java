
public class CeilingFan {
    private int speed; // 0 for off, 1 for low, 2 for medium, 3 for high
    private boolean isReversed;

    public CeilingFan() {
        speed = 0;
        isReversed = false;
    }

    public void pullSpeedCord() {
        if (speed == 3) {
            speed = 0; // If speed is at 3, set it to off (0)
        } else {
            speed++;
        }
        System.out.println("Speed: " + getSpeedDescription() + " | Direction: " + (isReversed ? "Reversed" : "Forward"));
    }

    public void pullDirectionCord() {
        isReversed = !isReversed;
        System.out.println("Direction: " + (isReversed ? "Reversed" : "Forward"));
    }

    private String getSpeedDescription() {
        switch (speed) {
            case 0:
                return "Off";
            case 1:
                return "Low";
            case 2:
                return "Medium";
            case 3:
                return "High";
            default:
                return "Invalid Speed";
        }
    }

    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();

        fan.pullSpeedCord(); // Increases speed
        fan.pullSpeedCord();
        fan.pullSpeedCord();
        fan.pullSpeedCord(); // Speed 3, goes to off
        fan.pullSpeedCord(); // Back to low (1)
        fan.pullDirectionCord(); // Reverses direction
        fan.pullSpeedCord(); // Increases speed (2), direction is reversed
        fan.pullSpeedCord(); // Increases speed (3), direction is reversed
        fan.pullSpeedCord(); // Speed 3, goes to off, direction remains reversed
        fan.pullDirectionCord(); // Reverses direction back
        fan.pullSpeedCord(); // Increases speed (1), direction is forward
    }
}