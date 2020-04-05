package helpers;

import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;

public class appHelper {

    /**** Methods for all functionality of apps ****/
    public Sequence scrollDown() {

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Interaction moveToStart = finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 520, 1530);
        Interaction pressDown = finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg());
        Interaction moveToEnd = finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), 520, 490);
        Interaction pressUp = finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg());

        Sequence swipe = new Sequence(finger, 0);
        swipe.addAction(moveToStart);
        swipe.addAction(pressDown);
        swipe.addAction(moveToEnd);
        swipe.addAction(pressUp);
        return swipe;
    }

}
