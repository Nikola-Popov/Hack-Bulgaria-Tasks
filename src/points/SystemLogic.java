package points;

public class SystemLogic {
    private double initX;
    private double initY;
    private char[] stringData;
    private double cnst = 1.0;

    public SystemLogic(double initX, double initY) {
        this.initX = initX;
        this.initY = initY;
    }

    public void readStringInput(String string) {
        stringData = string.toCharArray();
        for (int i = 0; i < stringData.length; i++) {
            switch (stringData[i]) {
                case '>':
                    initX += 1.0 * cnst;
                    break;
                case '<':
                    initX -= 1.0 * cnst;
                    break;
                case 'v':
                    initY -= 1.0 * cnst;
                    break;
                case '^':
                    initY += 1.0 * cnst;
                    break;
                case '~':
                    cnst *= -1.0;
                    break;
                default:
                    System.out.println("Character skipped: " + stringData[i] + " ");
                    break;
            }
        }
    }

    public void printCurrentCoordinates() {
        System.out.println("(" + (int) initX + ", " + (int) initY + ")");
    }

}
