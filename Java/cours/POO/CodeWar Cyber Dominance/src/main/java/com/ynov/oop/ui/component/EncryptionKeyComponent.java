package com.ynov.oop.ui.component;

import jexer.TLabel;
import jexer.TWindow;

public class EncryptionKeyComponent extends TLabel {
    public EncryptionKeyComponent(TWindow window, int x, int y, int encryptionKeyValue) {
        super(window, String.format("Encryption Key : %d", encryptionKeyValue), x, y);
    }
}
