package design_patterns.factory_method.example.factory;

import design_patterns.factory_method.example.buttons.Button;
import design_patterns.factory_method.example.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
